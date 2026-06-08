public class Permutation {

    public static void main(String[] args) {
        int count = permutation("abc", "");
        System.out.println("COUNT : " + count);
    }

    public static int permutation(String s, String ans) {

        if (s.length() == 0) {
            System.out.println(ans);
            return 1;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            String remain = s.substring(0, i) + s.substring(i + 1);

            count += permutation(remain, ans + ch);

        }
        return count;
    }
}
