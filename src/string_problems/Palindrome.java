package string_problems;

public class Palindrome {

    /**
     * INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     * <p>
     * Example: MOM, DAD, MADAM, RACECAR
     * <p>
     * Create a method to check if any given String is a palindrome or not.
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("RACECAR"));
    }

    // Implement here
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            char a = s.charAt(left);
            char b = s.charAt(right);

            if (Character.toLowerCase(a) != Character.toLowerCase(b))
                return false;
            left++;
            right--;
        }
        return true;

    }
}
