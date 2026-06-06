public class Ways {

    public static void main(String[] args) {

        int count = ways(4, 0, "");
        System.out.println("COUNT: " + count);
    }

    private static int ways(int n, int currentValue, String s) {

        if (currentValue == n) {
            System.out.print(s + " ");
            return 1;
        }
        if (currentValue > n) {
            return 0;
        }

        // int w1 = ways(n, currentValue + 1, s + '1');
        // int w2 = ways(n, currentValue + 2, s + '2');
        // int w3 = ways(n, currentValue + 3, s + '3');
        // return w1 + w2 + w3;

        int sum = 0;
        for (int i = 1; i <= 3; i++) {
            sum += ways(n, currentValue + i, s + i);
        }

        return sum;
    }

}
