package Exception;
import java.util.Scanner;

public class BankApplication {
    static double balance = 4000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        withdraw(scanner.nextDouble());

        scanner.close();
    }

    static void withdraw(double amount) {
        try {
            if (amount < 0) {
                throw new Exception("Negative amount");
            }

            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }

            balance -= amount;
            System.out.println("Withdrawn: " + amount);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction logged");
        }
    }
}