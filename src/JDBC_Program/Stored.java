package JDBC_Program;

import java.sql.*;

public class Stored {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";
        String password = "admin";

        String sql = "{call AddStudent(?, ?, ?)}";

        try (Connection connect = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = connect.prepareCall(sql)) {

            cstmt.setInt(1, 102);
            cstmt.setString(2, "Bob Builder");
            cstmt.setDouble(3, 75.0);

            int rowsAffected = cstmt.executeUpdate();

            System.out.println("Stored procedure executed successfully!");

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

}
