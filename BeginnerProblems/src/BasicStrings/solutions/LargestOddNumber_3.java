package BasicStrings.solutions;

public class LargestOddNumber_3 {
    public static String largestOddNumberString(String str) {
        int startIndex = 0;
        int endIndex = str.length() - 1;
        int index = -1;

        for(int i = endIndex; i >= startIndex; i--) {
            if ((str.charAt(i) - '0') % 2 != 0) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return "";
        }
        int i = 0;
        while (i <= index && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i, index + 1);
    }
    public static void main(String[] args) {
        String num = "0000002136489512345";
        String result = largestOddNumberString(num);
        System.out.println("Largest odd number: " + result);
    }
}
