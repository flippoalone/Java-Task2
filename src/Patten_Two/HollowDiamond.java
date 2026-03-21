package Patten_Two;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the a Number to Print: ");
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {

            // inner loop to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // outer loop to handle lower part
        for (int i = n-1; i >= 1; i--) {

            // inner loop to print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2*i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
