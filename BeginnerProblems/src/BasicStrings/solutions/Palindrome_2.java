package BasicStrings.solutions;


public class Palindrome_2 {
    public static boolean palindromeString(String str) {
        int startIndex = 0;
        int endIndex = str.length() - 1;

        while (startIndex < endIndex) {
            if (str.charAt(startIndex) != str.charAt(endIndex)) {
                return false;
            }

            startIndex++;
            endIndex--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "hannah";
        boolean result = palindromeString(str);
        System.out.println(result);
    }
}
