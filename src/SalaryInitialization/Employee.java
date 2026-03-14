package SalaryInitialization;

public class Employee {
    int empId;
    String empName;
    double salary;

    Employee(int empId , String empName , double salary){

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;

    }

    void displayEmployee(){
        System.out.println("Emp-ID: " + this.empId + " Emp-Name: " + this.empName + " Salary: " + this.salary);
    }
}
