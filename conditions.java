import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println(check(number));
    }

    private static boolean check(int number) {
        if (number > 15) {
            return true;
        } else {
            return false;
        }
    }

}
