package BasicRecursion.solutions;

public class Fibanocci_10 {
    public static int sumFibanocci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return sumFibanocci(n - 1) + sumFibanocci(n - 2);
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(sumFibanocci(n));
    }
}
