public class Subsequence {
    public static void main(String[] args) {
        int count = subsequence("abc", "");
        System.out.println("COUNT: " + count);
    }

    private static int subsequence(String s, String ans) {

        if (s.length() == 0) {
            if (ans == "")
                System.out.print("--  ");
            System.out.print(ans + "  ");
            return 1;
        }
        char ch = s.charAt(0);
        int c1 = subsequence(s.substring(1), ans);
        int c2 = subsequence(s.substring(1), ans + ch);
        return c1 + c2;
    }
}
