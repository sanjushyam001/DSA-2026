package Math;

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 11;
        // if (isPrime(n))
        // System.out.println("Given number " + n + " is a prime number");
        // else
        // System.out.println("Given number " + n + " is not a prime number");
        printPrimeNumbersInGivenRange(100);

    }

    private static void printPrimeNumbersInGivenRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;

    }
}
