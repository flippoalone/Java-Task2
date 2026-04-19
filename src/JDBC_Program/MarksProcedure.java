package JDBC_Program;

import java.sql.*;

public class MarksProcedure {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";
        String password = "admin";

        String sql = "{call UpdateStudentMarks(?, ?)}";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = conn.prepareCall(sql)) {

            cstmt.setInt(1, 103);
            cstmt.setInt(2, 985);

            int rowsAffected = cstmt.executeUpdate();

            System.out.println("Success! The stored procedure executed and marks were updated.");

        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

}
