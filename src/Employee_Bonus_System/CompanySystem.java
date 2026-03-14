package Employee_Bonus_System;


import java.util.Scanner;

interface Employees { // I am using Interface Method for this

    void calculateBonus();

}

class Manager implements Employees{ // Child1 connect to Parent

    String name;
    double salary;

    Manager(String name , double salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calculateBonus() {
        double bonus = 1000;
        bonus *= salary / 100;

        System.out.println("Manager Name: " + name);
        System.out.println("Your Current Salary: "+salary);
        System.out.printf("You have a Bonus Increment %.2f\n",bonus);
        System.out.println();

    }
}

class Developer implements Employees{ // Child 2 connect to Parent

    int empId;
    String name;
    double salary;

    Developer(int empId , String name , double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calculateBonus() {
        double bonus = 1000;
        bonus *= salary / 100;

        System.out.println("Developer Name: " + name);
        System.out.println("Your Current Salary: "+salary);
        System.out.printf("You have a Bonus Increment %.2f\n",bonus);
        System.out.println();
    }
}


class Intern implements Employees{ // Child 3 connect to Parent

    int internId;
    String name;
    double workPay;

    Intern(int internId , String name , double workPay){
        this.internId = internId;
        this.name = name;
        this.workPay = workPay;

    }

    @Override
    public void calculateBonus() {
        System.out.println("Name of Intern: " + name);
        System.out.println("Your Monthly Work Payment: " + workPay);
        System.out.println("Bonus Not Required!");

    }
}



public class CompanySystem {
    public static void main(String[] args){

    Employees employee;

    Manager TeamLeader = new Manager("Ajay" , 50000);
    Developer developer = new Developer(101, "Jack" , 20000);
    Intern internEmployee = new Intern(1001 , "Mike" , 10000);

        Scanner scanner = new Scanner(System.in);

        int choice;

        System.out.println("Choose the Display message to Show their Salary");

        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.println("3. Intern");
        System.out.println("4. Exit");

        System.out.print("Enter the Choice? (1-4): ");
        choice = scanner.nextInt();

            if (choice == 1){
                TeamLeader.calculateBonus();

            } else if (choice == 2) {
                developer.calculateBonus();

            }
            else if (choice == 3){
                internEmployee.calculateBonus();

            }
            else {
                System.out.println("Thank You!");
            }






    scanner.close();

    }
}
