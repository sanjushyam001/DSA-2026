package Math;

public class SunOfDigts {

    public static void main(String[] args) {

        sum(54321);
    }

    private static void sum(int n) {

        int sum = 0;
        while (n != 0) {

            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println("Sum of Digits: " + sum);
    }
}
