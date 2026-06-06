public class Fibonacci {
    public static void main(String[] args) {

        int result = fibonacci(8);
        System.out.println(result);
    }

    private static int fibonacci(int n) {

        if (n == 0 || n == 1)
            return n;
        int f1 = fibonacci(n - 1);
        int f2 = fibonacci(n - 2);
        return f1 + f2;
    }
}
