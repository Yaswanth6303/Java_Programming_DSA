package BasicStrings.solutions;

import java.util.Arrays;

public class CommonPrefix_4 {
    public static String largeCommonPrefix(String [] str) {
        if (str.length == 0) return "";
        Arrays.sort(str);
        String firstWord = str[0];
        String lastWord = str[str.length - 1];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < Math.min(firstWord.length(), lastWord.length()); i++) {
            if (firstWord.charAt(i) != lastWord.charAt(i)) {
                return sb.toString();
            }
            sb.append(firstWord.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] str = {"flowers" , "flow" , "fly", "flight"};
        System.out.println(largeCommonPrefix(str));
    }
}
