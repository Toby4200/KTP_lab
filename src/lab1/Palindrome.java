package lab1;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
    }

    public static String reverseString(String argStr) {
        String reversedString = "";

        for (int i = argStr.length() - 1; i >= 0; i--) {
            reversedString += argStr.charAt(i);
        }

        return reversedString;
    }

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = false;
        String reversedString = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversedString += s.charAt(i);
        }

        if (s.equals(reversedString)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}