package JDBC_Program;

import java.sql.*;

public class InsertStudent {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";
        String password = "admin";

        String sql = "INSERT INTO student (id, name, marks) VALUES (?, ?, ?)";

        try (Connection connect = DriverManager.getConnection(url, user, password);
             PreparedStatement prepared = connect.prepareStatement(sql)) {

            // 4. Plug the actual values into the '?' placeholders
            prepared.setInt(1, 101);
            prepared.setString(2, "John Doe");
            prepared.setInt(3, 88);

            int rowsAffected = prepared.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student record inserted successfully!");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

}
