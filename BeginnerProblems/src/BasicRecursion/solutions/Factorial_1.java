package BasicRecursion.solutions;

public class Factorial_1 {
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
