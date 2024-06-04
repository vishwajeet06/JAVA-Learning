package streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class filterStream {

    public static void main(String[] args) {
        
        // int number[] = { 3, 6, 8, 13, 4, 9, 0, 11 };
        List<Integer> numbers = Arrays.asList(2, 5, 9, 8, 7, 4, 1, 2, 3);
    
        // numbers.stream().filter((item) -> {
        //     if (item % 2 != 0) return true;
        //     return false;
        // }).forEach(System.out::println);

        List oddNumber = numbers.stream().filter((item) -> item % 2 == 0).collect(Collectors.toList());
        System.out.println(oddNumber);
    
        
    }

    

}
