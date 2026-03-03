import java.util.Scanner;

public class palindromecheckerapp {


    public static boolean isPalindrome(String input) {

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a word or phrase: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println("\"" + userInput + "\" is a palindrome.");
        } else {
            System.out.println("\"" + userInput + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}

