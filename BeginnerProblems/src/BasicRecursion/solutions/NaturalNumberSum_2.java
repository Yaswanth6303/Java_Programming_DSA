package BasicRecursion.solutions;

public class NaturalNumberSum_2 {
    public static int nNumberSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + nNumberSum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(nNumberSum(10));
    }
}
