package Math;

public class Reverse {

    public static void main(String[] args) {

        reverse(54321);
    }

    private static void reverse(int n) {

        int reverseValue = 0;
        while (n != 0) {

            int digit = n % 10; //1 2 3 4 5
            reverseValue = digit + reverseValue * 10;//1 12 123 1234 12345
            n /= 10;
        }
        System.out.println("Reverse of number: " + reverseValue);
    }
}
