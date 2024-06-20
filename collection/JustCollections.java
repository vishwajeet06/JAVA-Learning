import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JustCollections {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(5);
        data.add(1);
        data.add(7);
        data.add(6);
        data.add(4);

        // Collections is a utility class where common static methods are provided like min, max, sort, reverse
        System.out.println(Collections.max(data));
        Collections.sort(data); //sorted in ascending
        
        data.sort(Comparator.reverseOrder()); //sorted in reverse order
        data.forEach((Integer i) -> System.out.println(i));
    }
}
