package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Custom exception for non-palindrome numbers
class NotPalindromeException extends Exception {
    public NotPalindromeException(String message) {
        super(message);
    }
}

public class PalindromeChecker {

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    // Method to check palindrome with exception handling
    public static void checkPalindrome(int number) throws NotPalindromeException {
        if (!isPalindrome(number)) {
            throw new NotPalindromeException("The number " + number + " is not a palindrome.");
        }
        System.out.println("The number " + number + " is a palindrome.");
    }

    public static void main(String[] args) {
        // Write a sample number to "index.txt"
        try (FileWriter writer = new FileWriter("index.txt")) {
            writer.write("12321"); // Change this number to test with different values
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
            return;
        }

        // Read the number from "index.txt" and check if it is palindrome
        try (BufferedReader reader = new BufferedReader(new FileReader("index.txt"))) {
            String line = reader.readLine();
            if (line != null) {
                int number = Integer.parseInt(line.trim());
                checkPalindrome(number);
            } else {
                System.out.println("The file is empty.");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("The file does not contain a valid number.");
        } catch (NotPalindromeException e) {
            System.out.println(e.getMessage());
        }
    }
}
