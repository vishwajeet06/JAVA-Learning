package starPattern;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int row = input.nextInt();
        System.out.print("Enter the Coloumn : ");
        int col = input.nextInt();

        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= col; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
// *********
// *       *
// *       *
// *       *
// *       *
// *********
    }

}
