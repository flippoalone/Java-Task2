package Payment_Interface;
import java.util.Scanner;


interface Payment {
    void processPayment(double amount);

}

class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card Payment is Don: "+ amount);
    }
}

class UPIPayment implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("UPI Payment is Don: "+ amount);
    }
}

class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card Payment is Don: "+ amount);
    }
}

public class Main {
    public static void main(String[] args){

        Payment credit = new CreditCardPayment();
        Payment upiPayment = new UPIPayment();
        Payment payPal =  new PayPalPayment();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to E-commerce Payment System");
        System.out.println("<------------------------------------->");


            System.out.print("Enter the Choice? (1.CreditCard , 2.UPI Payment , 3.PayPalPayment 4.Quit): ");
            int respons = scanner.nextInt();

            if(respons == 1){
                System.out.print("Enter the CreditCard Amount: ");
                double amount = scanner.nextDouble();
                credit.processPayment(amount);

            } else if (respons == 2) {
                System.out.print("Enter the UPI Payment Amount: ");
                double amount = scanner.nextDouble();
                upiPayment.processPayment(amount);

            } else if (respons == 3) {
                System.out.print("Enter the PayPalPayment Amount: ");
                double amount = scanner.nextDouble();
                payPal.processPayment(amount);

            }else if (respons == 4){
                System.out.println("bey thank you!");

            }


        scanner.close();

    }
}
