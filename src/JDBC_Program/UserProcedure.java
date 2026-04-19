package JDBC_Program;

import java.sql.*;

public class UserProcedure {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/appdb";
        String user = "root";
        String password = "admin";

        String sql = "{call AddUser(?, ?, ?)}";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = conn.prepareCall(sql)) {

            cstmt.setInt(1, 301);
            cstmt.setString(2, "cool_coder_99");
            cstmt.setString(3, "coder99@example.com");

            cstmt.executeUpdate();

            System.out.println("Success! The new user was added using the stored procedure.");

        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

}
