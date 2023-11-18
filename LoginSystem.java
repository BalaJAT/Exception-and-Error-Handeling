package learning.java;

import java.util.Scanner;

public class LoginSystem {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Simulate checking the entered password (Replace this with your actual password checking logic)
            System.out.print("Enter your password: ");
            String enteredPassword = scanner.nextLine();
            
            // Replace "correctPassword" with the actual correct password
            String correctPassword = "correctPassword";

            if (!enteredPassword.equals(correctPassword)) {
                // If the entered password is incorrect, throw an exception
                throw new IncorrectPasswordException("Incorrect password");
            }

            // If the password is correct, continue with the login process
            System.out.println("Login successful!");
        } catch (IncorrectPasswordException e) {
            // Handle the incorrect password exception
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close any necessary resources (e.g., scanner)
            scanner.close();
        }
    }
}

// Custom exception class for incorrect password
class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }

}
