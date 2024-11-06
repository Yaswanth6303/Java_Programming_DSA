package BasicRecursion.solutions;

public class PrimeNumber_6 {
    public static boolean primeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        return isPrime(num, 2);
    }
    public static boolean isPrime(int num, int i) {
        if (i * i > num)  return true;
        if (num % i == 0) return false;
        
        return isPrime(num, i + 1);
    } 
    public static void main(String[] args) {
        int num = 11;
        System.out.println(primeNumber(num));
    }
}
