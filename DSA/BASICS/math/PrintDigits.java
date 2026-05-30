package Math;

public class PrintDigits {

    public static void main(String[] args) {

        print(54321);
    }

    private static void print(int n) {

        while (n != 0) {

            int digit = n % 10;
            System.out.print(digit + " ");
            n /= 10;
        }
    }
}
