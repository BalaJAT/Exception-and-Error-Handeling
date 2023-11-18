package learning.java;

public class ArrayIndexExample {
	
	public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4, 5};
            
            // Trying to access an element at an index that doesn't exist
            int value = array[10];
            
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Error: " + e.getMessage());
        }
    }

}
