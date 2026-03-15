package Account_File;

abstract class Account {

    void calculateInterest(){

    }
}

class SavingsAccount extends Account{

    void calculateInterest(){
        System.out.println("Savings Account is Successfully Created");
    }
}

class CurrentAccount extends Account {

    void calculateInterest(){
        System.out.println("Current Account is created Successfully");
    }
}


public class Main {
    public static void main(String[] args){

    }
}
