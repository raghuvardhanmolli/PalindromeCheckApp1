import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : normalized.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Main Application
public classPalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Choose Algorithm:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}