package Online_Payment_System;
import java.util.Scanner;


abstract class Payment {

    abstract void processPayment();

}

class CreditCardPayment extends Payment {

    @Override
    void processPayment(){
        System.out.println("Welcome to the Credit Card Payment System");

    }
}

class DebitCardPayment extends Payment{

    @Override
    void processPayment(){
        System.out.println("Welcome to the Debit Card Payment System");

    }
}

class UPIPayment extends Payment {

    @Override
    void processPayment(){
        System.out.println("Welcome to the UPI-Payment System");

    }
}


public class OnlinePayment {
    public static void main(String[] args){

        Payment paymentSystem;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Welcome to Online System Payment");

        System.out.print("1. Credit Card Payment");
        System.out.println("2. Debit Card Payment");
        System.out.println("3. UPI Payment");

        System.out.print("Please select the Choice? (1 - 3): ");
        int choice = scanner.nextInt();

       if(choice == 1){
           paymentSystem = new CreditCardPayment();
           paymentSystem.processPayment();

       } else if (choice == 2) {
           paymentSystem = new DebitCardPayment();
           paymentSystem.processPayment();

       } else if (choice == 3) {
           paymentSystem = new UPIPayment();
           paymentSystem.processPayment();

       }else {
           System.out.println("Invalid Choice You Choose!");
       }


        scanner.close();

    }
}
