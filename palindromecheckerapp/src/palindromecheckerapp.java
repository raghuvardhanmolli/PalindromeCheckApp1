import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {

    // Method to check palindrome using Deque
    public static boolean isPalindrome(String input) {

        // Remove spaces and convert to lowercase for uniform comparison
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear characters
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("   UC7: Deque-Based Palindrome App   ");
        System.out.println("=====================================");

        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a PALINDROME.");
        } else {
            System.out.println("Result: The given string is NOT a palindrome.");
        }

        scanner.close();
    }
}