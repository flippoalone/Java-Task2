package Patten_Two;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to print: ");
        int n =  scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print value of j.
            for (int j = i; j <= n; j++) {
                if(j==i||j==n||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // printing new line for each row
            System.out.println();
        }

        // Printing the lower part
        for (int i = n - 1; i >= 1; i--) {

            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print value of j.
            for (int j = i; j <= n; j++) {
                if(j==i||j==n||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // printing new line for each row
            System.out.println();
        }


        scanner.close();

    }
}
