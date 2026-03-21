package Patten_One;

import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number to Display: ");
        int n = scanner.nextInt();

        int num = 0;

        for(int i = 0; i <=n; i++){
            System.out.println();

            for(int j = 0; j <=i; j++){
                System.out.print(num + " ");
                num++;

            }

        }



        scanner.close();

    }
}
