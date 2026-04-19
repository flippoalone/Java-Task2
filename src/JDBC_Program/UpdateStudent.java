package JDBC_Program;

import java.sql.*;

public class UpdateStudent {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";
        String password = "admin";

        String sql = "UPDATE student SET marks = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement prepared = conn.prepareStatement(sql)) {

            prepared.setInt(1, 95);
            prepared.setInt(2, 101);

            int rowsAffected = prepared.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Success! The student's marks were updated.");
            } else {
                System.out.println("No student found with that ID.");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

}
