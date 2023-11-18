package learning.java;

import java.util.Scanner;

public class Division {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the two integers from the user.
        System.out.println("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Try to divide the two integers.
        try {
            int quotient = dividend / divisor;
            System.out.println("The quotient is: " + quotient);
        } catch (ArithmeticException e) {
            // Handle the exception that is thrown when the divisor is zero.
            System.out.println("Error: Division by zero.");
        }
    }

}
