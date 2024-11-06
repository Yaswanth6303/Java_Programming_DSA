package BasicStrings.solutions;

import java.util.*;

public class ReverseString_1 {
    public static void reverse(Vector<Character> str) {
        int startIndex = 0;
        int endIndex = str.size() - 1;

        while (startIndex < endIndex) {
            char temp = str.get(startIndex);
            str.set(startIndex, str.get(endIndex));
            str.set(endIndex, temp);

            startIndex++;
            endIndex--;
        }
    }
    public static void main(String[] args) {
        Vector<Character> str = new Vector<>();
        str.add('h');
        str.add('e');
        str.add('l');
        str.add('l');
        str.add('o');

        reverse(str);

        for (char c : str) {
            System.out.print(c);
        }
        System.out.println();
    }

}
