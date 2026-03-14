package Bank_Account_Deposit;
import java.util.Scanner;

class Deposit {

    int accountNumber;
    String holderName ;
    double balance;

    Deposit(int accountNumber , String holderName , double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;

        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name: "+holderName);
        System.out.println("Current Balance: "+balance);
    }


    void  deposit(){
        char choice;
        double amount;
        double withdraw;

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Select Choice : A = Deposit / B = Withdraw");
        System.out.print("Enter the choice (Deposit or Withdraw): ");
        choice = scanner.next().toUpperCase().charAt(0);

        if(choice == 'A'){
            System.out.print("Enter the Amount to Deposit: ");
            amount = scanner.nextDouble();
            amount += balance;
            System.out.println("Account balance is: " + amount);

        }
        else if (choice == 'B'){
            System.out.print("Enter the Amount to withdraw: ");
            withdraw = scanner.nextDouble();
            withdraw -= balance;
            System.out.println("Account balance is: " + withdraw);

        }
        else{
            System.out.println("Invalid Choice You Made!");

        }
    }
}


public class BankAccount {
    public static void main(String[] args){

        Deposit deposit = new Deposit(2457896 , "Vijay Kumar" , 40000);

        deposit.deposit();
    }
}
