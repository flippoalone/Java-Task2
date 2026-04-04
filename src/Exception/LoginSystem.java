package Exception;

import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginSystem {
    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "1234";

        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {
            try {
                System.out.print("Username: ");
                String username = sc.nextLine();

                if (!username.equals(correctUsername)) {
                    throw new InvalidUsernameException("Invalid username");
                }

                System.out.print("Password: ");
                String password = sc.nextLine();

                if (!password.equals(correctPassword)) {
                    throw new InvalidPasswordException("Invalid password");
                }

                System.out.println("Login successful");
                break;

            } catch (InvalidUsernameException e) {
                System.out.println(e.getMessage());
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
            }

            attempts++;
            System.out.println("Attempts left: " + (3 - attempts));
        }

        if (attempts == 3) {
            System.out.println("Too many attempts. Program ended.");
        }

        sc.close();
    }
}
