package learning.java;

public class SrtingIndexExample {
	
	public static void main(String[] args) {
        try {
            String str = "Hello, World!";
            
            // Trying to access a character at an index that doesn't exist
            char character = str.charAt(20);
            
            System.out.println("Character: " + character);
        } catch (StringIndexOutOfBoundsException e) {
            // Handle the StringIndexOutOfBoundsException
            System.out.println("Error: " + e.getMessage());
        }
    }

}
