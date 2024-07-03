package streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamMain1 {

    public static void main(String[] args) {
        
        // create a list and print all even number and sum all
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 7, 8, 91, 2, 3, 42, 32, 12, 1);
        List<Integer> listEven = new ArrayList<>();
        int sum = 0;

        for (Integer i : numbers) {
            if (i % 2 == 0) {
                sum = sum + i;
                listEven.add(i);
            }
        }
        System.out.println(sum);
        
        System.out.println(listEven);

        List<Integer> evenNumber1 = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumber1);
    }

}
