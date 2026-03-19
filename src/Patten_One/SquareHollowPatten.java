package Patten_One;

import java.util.Scanner;

public class SquareHollowPatten {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = scanner.nextInt();

        for(int i = 0 ; i < n; i++){
            System.out.println();

            for(int j = 0; j < n; j++){

                if(i == 0 || j == 0 || i == n-1 || j == n-1){

                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }


            }

        }

       scanner.close();


    }

}
