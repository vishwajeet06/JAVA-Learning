import java.lang.reflect.Array;
import java.util.Arrays;

public class collectionSort {

    public static void main(String[] args) {
        int array[] = { 1, 6, 3, 5 };
        Arrays.sort(array); //quick sort
        for (int i : array) {
            System.out.println(i);
        }
        
    }

}
