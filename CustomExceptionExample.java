package learning.java;

import java.util.Scanner;

public class CustomExceptionExample {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();

	            // Check if age is less than 18
	            if (age < 18) {
	                // If the age is less than 18, throw the custom exception
	                throw new InvalidAgeException("Invalid age: Age must be 18 or older.");
	            }

	            // Continue with the program logic if age is valid
	            System.out.println("Welcome! You are eligible.");

	        } catch (InvalidAgeException e) {
	            // Handle the custom exception
	            System.out.println("Error: " + e.getMessage());
	        } catch (Exception e) {
	            // Handle other exceptions (e.g., InputMismatchException)
	            System.out.println("Error: Invalid input. Please enter a valid age.");
	        } finally {
	            // Close the scanner to prevent resource leak
	            scanner.close();
	        }
	    }
	}

	// Custom exception class for invalid age
	class InvalidAgeException extends Exception {
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	

}
