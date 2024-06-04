import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // int SumOfNumber = SumOfNumber(number);
        // System.out.println(SumOfNumber);

        int sumOfOdd = SumOFOdd(number);
        System.out.println(sumOfOdd);
        
        // int sumOfEven = SumOFEVen(number);
        // System.out.println(sumOfEven);
    }

    private static int SumOFOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    private static int SumOFEVen(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    private static int SumOfNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
