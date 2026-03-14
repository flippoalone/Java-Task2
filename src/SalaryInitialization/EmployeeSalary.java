package SalaryInitialization;
public class EmployeeSalary {
    public static void main(String[] args){

        Employee employee1 = new Employee(101 , "Priya" , 20000);
        Employee employee2 = new Employee(102 , "Sakthi" ,  30000);
        Employee employee3 = new Employee(103 , "Mohan" , 4000);

        employee1.displayEmployee();
        employee2.displayEmployee();
        employee3.displayEmployee();
    }

}
