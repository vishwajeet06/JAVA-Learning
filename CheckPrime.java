import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter lower limit : ");
        int low = input.nextInt();
        System.out.println("Enter upper limit : ");
        int high = input.nextInt();

        for (int i = low; i <= high; i++) {
            
            // boolean data = checkPrime(i);
            boolean data = checkPrime1(i);

            if (data) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkPrime1(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) { //number divisible by 2 and 3
            return false;
        }
        for (int i = 5; i * i <= n; i+=6) {
            if (n%i==0 || n%(i+2)==0) { //instead of checking all consecutive number we skip number(2,3)
                return false;
            }
        }
        return true;
    }

    private static boolean checkPrime(int n) {
        if (n==1) {
            return false;
        }
        for (int i = 2; i < n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
