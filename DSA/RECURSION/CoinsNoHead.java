public class CoinsNoHead {

    public static void main(String[] args) {

        int count = coins(3, "");
        System.out.println("\nCOUNT: " + count);
    }

    private static int coins(int n, String s) {

        if (n == 0) {
            System.out.print(s + " ");
            return 1;
        }
        int c1 = 0;
        if (s.length() == 0 || s.charAt(s.length() - 1) != 'H') {

            c1 = coins(n - 1, s + "H");
        }
        int c2 = coins(n - 1, s + "T");
        return c1 + c2;
    }
}
