package JDBC_Program;

import java.sql.*;

public class EmployeeStored {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "admin";

        String sql = "{call AddEmployee(?, ?, ?, ?)}";

        try (Connection connect = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = connect.prepareCall(sql)) {

            cstmt.setString(2, "Jane Smith");
            cstmt.setString(3, "Engineering");
            cstmt.setDouble(4, 95000.50);

            cstmt.executeUpdate();

            System.out.println("Success! Employee details added via stored procedure.");

        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

}
