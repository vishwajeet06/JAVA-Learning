import java.util.Arrays;

public class sortCompar {

    public static void main(String[] args) {
       
        Integer[] arr = { 10, 12, 9, 51, 79, 13 };

        //merge sort
        // Arrays.sort(arr); 

        // comparator uses compare method to sort
        // v1-v2 >0 {0} <0 >0  swaping condition
        // v1-v2 => ascending
        // v2-v1 => descending
        Arrays.sort(arr, (Integer v1, Integer v2) -> v2 - v1);
        for (Integer i : arr) {
            System.out.println(i);
        }
    }
}
