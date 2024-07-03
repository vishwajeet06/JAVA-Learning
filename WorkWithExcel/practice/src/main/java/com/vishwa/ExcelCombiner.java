
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelCombiner {
    public static void main(String[] args) {

        // giving input output data Excel sheet

        String inputFile = "Dummy.xlsx"; //input
        String outputFile = "Combined.xlsx"; //output

        try (FileInputStream file = new FileInputStream(inputFile);
                Workbook workbook = new XSSFWorkbook(file)) {

            // reading data from sheets
            Map<String, Map<String, Object>> mainData = readSheetData(workbook, "MAIN");
            Map<String, Map<String, Object>> amData = readSheetData(workbook, "AM");
            Map<String, Map<String, Object>> mjData = readSheetData(workbook, "MJ");

            // combining the data
            Map<String, Map<String, Object>> combinedData = new HashMap<>();

            for (String id : mainData.keySet()) {
                Map<String, Object> combinedRow = new HashMap<>(mainData.get(id));

                // checking data AM
                if (amData.containsKey(id)) {
                    combinedRow.putAll(amData.get(id));
                }

                // checking data MJ
                if (mjData.containsKey(id)) {
                    for (String key : mjData.get(id).keySet()) {
                        if (!combinedRow.containsKey(key)) {
                            combinedRow.put(key, mjData.get(id).get(key));
                        }
                    }
                }
                combinedData.put(id, combinedRow);
            }

            // combined data to new excel file
            try (Workbook outputWorkbook = new XSSFWorkbook()) {
                Sheet outputSheet = outputWorkbook.createSheet("Combined");

                // write headers
                Row headerRow = outputSheet.createRow(0);

                int cellIndex = 0;
                for (String key : combinedData.values().iterator().next().keySet()) {
                    headerRow.createCell(cellIndex++).setCellValue(key);
                }

                // write data rows
                int rowIndex = 1;
                for (String id : combinedData.keySet()) {
                    Row row = outputSheet.createRow(rowIndex++);
                    Map<String, Object> rowData = combinedData.get(id);
                    cellIndex = 0;
                    for (Object value : rowData.values()) {
                        Cell cell = row.createCell(cellIndex++);
                        if (value instanceof String) {
                            cell.setCellValue((String) value);
                        } else if (value instanceof Double) {
                            cell.setCellValue((Double) value);
                        }
                    }
                }

                // saving output file
                try (FileOutputStream fileOut = new FileOutputStream(outputFile)) {
                    outputWorkbook.write(fileOut);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static Map<String, Map<String, Object>> readSheetData(Workbook workbook, String sheetName) {
        Map<String, Map<String, Object>> data = new HashMap<>();
        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            return data;
        }

        Row headerRow = sheet.getRow(0);
        int numColumns = headerRow.getLastCellNum();

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) continue;

            String id = row.getCell(0).getStringCellValue();
            Map<String, Object> rowData = new HashMap<>();
            for (int j = 0; j < numColumns; j++) {
                Cell cell = row.getCell(j);
                String header = headerRow.getCell(j).getStringCellValue();
                if (cell != null) {
                    switch (cell.getCellType()) {
                        case STRING:
                            rowData.put(header, cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            rowData.put(header, cell.getNumericCellValue());
                            break;
                    }
                }
            }
            data.put(id, rowData);
        }

        return data;
    }
    
}
