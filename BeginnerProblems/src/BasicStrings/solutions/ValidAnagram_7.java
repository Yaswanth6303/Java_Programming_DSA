package BasicStrings.solutions;

import java.util.Arrays;

public class ValidAnagram_7 {
    public static boolean isAnagramBrute(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char [] sCharArray = s.toCharArray();
        char [] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);  
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    }
    public static boolean isAnagramOptimal(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int [] count = new int[26];
        for(int ch : s.toCharArray()) count[ch - 'a']++;
        for(int ch : t.toCharArray()) count[ch - 'a']--;
        for(int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagramBrute(s, t));
        System.out.println(isAnagramOptimal(s, t));
    }
}