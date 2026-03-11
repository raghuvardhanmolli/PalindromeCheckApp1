import java.util.Scanner;
import java.util.Stack;

// Palindrome service class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome using Stack
    public boolean checkPalindrome(String input) {

        // Normalize the string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        // Compare characters by popping from stack
        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check palindrome:");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}