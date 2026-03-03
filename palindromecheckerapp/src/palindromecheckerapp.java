import java.util.Scanner;
import java.util.Stack;

public class UseCase5PalindromeCheckerApp {

    // Method to check palindrome using Stack
    public static boolean isPalindrome(String input) {

        // Remove spaces and convert to lowercase
        String cleanedString = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < cleanedString.length(); i++) {
            stack.push(cleanedString.charAt(i));
        }

        // Pop characters and compare
        for (int i = 0; i < cleanedString.length(); i++) {
            char poppedChar = stack.pop();
            if (cleanedString.charAt(i) != poppedChar) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Stack-Based Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}