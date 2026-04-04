package Exception;

import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) {
        super(msg);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String msg) {
        super(msg);
    }
}

public class StudentGrading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Input name
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            if (name == null || name.trim().isEmpty()) {
                throw new InvalidNameException("Name cannot be empty");
            }

            // Input marks
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks must be between 0 and 100");
            }

            // Grade calculation
            if (marks >= 90) {
                System.out.println("Grade: A");
            } else if (marks >= 75) {
                System.out.println("Grade: B");
            } else if (marks >= 50) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: Fail");
            }

        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Process Completed");
            sc.close();
        }
    }
}
