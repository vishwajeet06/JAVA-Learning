import java.util.Scanner;

public class inputJava {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //input scanner module
        // String name = input.nextLine(); //save in name variabe string
        // // String last = input.next(); //take space as another input

        // System.out.println(name);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println(num1+num2);
    }

}
