public class PowerOfX {
    public static void main(String[] args) {
        int result = power(4, 5);
        System.out.println(result);
    }

    private static int power(int x, int n) {

        if (n == 0)
            return 1;
        int power = power(x, n - 1);
        return x * power;
    }
}
