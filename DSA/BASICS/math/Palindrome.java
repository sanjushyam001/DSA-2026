package Math;

public class Palindrome {

    public static void main(String[] args) {

        palindrome(22);
    }

    private static void palindrome(int n) {

        int originalValue = n;
        int reverseValue = 0;
        while (n != 0) {

            int digit = n % 10; // 1 2 3 4 5
            reverseValue = digit + reverseValue * 10;// 1 12 123 1234 12345
            n /= 10;
        }
        if (originalValue == reverseValue)
            System.out.println("Given number " + originalValue + " is a palindrome!");
        else
            System.out.println("Given number " + originalValue + " is not a palindrome!");

    }
}
