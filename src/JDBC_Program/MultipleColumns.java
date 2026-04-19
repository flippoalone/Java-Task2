package JDBC_Program;

import java.sql.*;

public class MultipleColumns {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";
        String password = "admin";


        String sql = "UPDATE student SET name = ?, marks = ? WHERE id = ?";

        try (Connection connect = DriverManager.getConnection(url, user, password);
             PreparedStatement prepared = connect.prepareStatement(sql)) {

            prepared.setString(1, "Alice Smith");
            prepared.setInt(2, 92);
            prepared.setInt(3, 101);

            int rowsAffected = prepared.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Success! The student's name and marks were updated.");
            } else {
                System.out.println("No student found with that ID.");
            }

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

}
