package BasicStrings.solutions;

public class RotateString_6 {
    public static boolean rotateStringBrute(String str, String goal) {
        if (str.length() != goal.length()) {
            return false;
        }
        int strlen = str.length();
        for(int i = 0; i < strlen; i++) {
            String rotated = str.substring(i) + str.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
    public static boolean rotateStringOptimal(String str, String goal) {
        if (str.length() != goal.length()) {
            return false;
        }
        String doubledString = str + str;
        return doubledString.contains(goal);
    }
    public static void main(String[] args) {
        String str = "abcde"; 
        String goal = "cdeab";
        System.out.println(rotateStringBrute(str, goal)); 
        System.out.println(rotateStringBrute(str, goal));
    }
}
