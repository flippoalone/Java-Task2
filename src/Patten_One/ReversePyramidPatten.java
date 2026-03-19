package Patten_One;

import java.util.Scanner;

public class ReversePyramidPatten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = scanner.nextInt();

        for(int i = n; i > 0; i--){
            System.out.println();

            for(int j = 0; j < i; j++){

                System.out.print(j + " ");

            }

        }


        scanner.close();

    }
}
