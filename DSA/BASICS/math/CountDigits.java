package Math;

public class CountDigits {

    public static void main(String[] args) {

        count(54321);
    }

    private static void count(int n) {

        int count = 0;
        while (n != 0) {

            count++;
            n /= 10;
        }
        System.out.println("Count: " + count);
    }
}
