class Factorial {
    public static void main(String[] args) {

        // int result = fact1(5, 1);
        int result = fact2(5);
        System.out.println(result);
    }

    private static int fact1(int n, int ans) {

        if (n == 0)
            return ans;

        return fact1(n - 1, n * ans);
    }

    private static int fact2(int n) {

        if (n == 0)
            return 1;

        return n * fact2(n - 1);
    }
}