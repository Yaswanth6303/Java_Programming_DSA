package BasicStrings.solutions;

public class IsomorphicString_5 {
    public static boolean isomorphicString(String s, String t) {
        int [] sMap = new int[256];
        int [] tMap = new int[256];

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap[sChar] != tMap[tChar]) return false;

            sMap[sChar] = i + 1;
            tMap[tChar] = i + 1;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isomorphicString(s, t)); 
        String s1 = "apple";
        String t1 = "bbnbm";
        System.out.println(isomorphicString(s1, t1));
    }
}