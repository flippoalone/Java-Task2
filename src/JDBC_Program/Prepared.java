package JDBC_Program;

import  java.sql.*;

public class Prepared {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "admin";

        String sql = "UPDATE employee SET salary = salary + ? WHERE department = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, 5000);
            pstmt.setString(2, "IT");
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Success! Updated salaries for " + rowsAffected + " employees in the IT department.");
            } else {
                System.out.println("No employees found in that department.");
            }

        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

}
