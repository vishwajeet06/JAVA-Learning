package streamsAPI;

import java.util.Arrays;

public class streamSum {

    public static void main(String[] args) {
        int arrays[] = { 2, 3, 8, 5, 7 };
        int sum = Arrays.stream(arrays).sum();
        System.out.println(sum);
    }

}
