package BasicRecursion.solutions;

public class PalindromeCheck_5 {
    public static boolean palindromeCheck(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    public static boolean isPalindrome(String str, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return true;
        }
        if (str.charAt(startIndex) != str.charAt(endIndex)) {
            return false;
        }
        return isPalindrome(str, startIndex + 1, endIndex - 1);
    }
    public static void main(String[] args) {
        String str = "hannah";
        System.out.println(palindromeCheck(str));
    }
}
