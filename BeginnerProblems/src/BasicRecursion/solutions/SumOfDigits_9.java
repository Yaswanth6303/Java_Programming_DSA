package BasicRecursion.solutions;

public class SumOfDigits_9 {
    public static int sumDigits(int n) {
        if (n <= 9) {
            return n;
        }

        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sumDigits(sum);
    }
    public static void main(String[] args) {
        int n = 529;
        System.out.println(sumDigits(n));
    }
}
