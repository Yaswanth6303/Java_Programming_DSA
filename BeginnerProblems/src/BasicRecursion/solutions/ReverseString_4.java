package BasicRecursion.solutions;

import java.util.Vector;

public class ReverseString_4 {
    public static Vector<Character> reverseString(Vector<Character> str) {
        int first_index = 0;
        int last_index = str.size() - 1;
        reverse(str, first_index, last_index);
        return str;
    }
    private static void reverse(Vector<Character> str, int first_index, int last_index) {
        if(first_index >= last_index) return;

        char temp = str.get(first_index);
        str.set(first_index, str.get(last_index));
        str.set(last_index, temp);

        reverse(str, first_index + 1, last_index - 1);
    }
    public static void main(String[] args) {
        Vector<Character> str = new Vector<>();
        str.add('h');
        str.add('e');
        str.add('l');
        str.add('l');
        str.add('o');
        
        // Function call to reverse the given string
        Vector<Character> reversed = reverseString(str);
        System.out.println(reversed);
    }
}
