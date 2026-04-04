package Map_Set_Assignment;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {

        HashMap<Integer, Double> empSalary = new HashMap<>();

        // Add some employees
        empSalary.put(101, 50000.0);
        empSalary.put(102, 60000.0);
        empSalary.put(103, 55000.0);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID to retrieve salary: ");
        int id = sc.nextInt();

        if (empSalary.containsKey(id)) {
            System.out.println("Salary: " + empSalary.get(id));
        } else {
            System.out.println("Employee ID not found!");
        }

        System.out.print("Enter employee ID to update salary: ");
        int updateId = sc.nextInt();
        System.out.print("Enter new salary: ");
        double newSalary = sc.nextDouble();

        if (empSalary.containsKey(updateId)) {
            empSalary.put(updateId, newSalary);
            System.out.println("Salary updated successfully!");
        } else {
            System.out.println("Employee ID not found!");
        }

        System.out.println("All employees: " + empSalary);

        sc.close();
    }

}
