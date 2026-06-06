public class ValidParenthesis {

    public static void main(String[] args) {
        int count = valid(3, 0, 0, "");
        System.out.println("COUNT: " + count);
    }

    private static int valid(int n, int o, int c, String s) {

        // if (s.length() == n * 2) {
        // System.out.println(s + " ");
        // return 1;
        // }
        if (o == n && c == n) {
            System.out.println(s + " ");
            return 1;
        }

        int count = 0;
        if (o < n)
            count += valid(n, o + 1, c, s + "(");
        if (c < o)
            count += valid(n, o, c + 1, s + ")");
        return count;

    }
}
