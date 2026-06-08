public class KeyPad {
    public static void main(String[] args) {
        String ar[] = { "abc", "def" };
        String input = "01";
        print(input, ar, "");

    }

    public static void print(String input, String ar[], String ans) {

        if (input.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = input.charAt(0);
        String press = ar[ch - 48];

        for (int i = 0; i < press.length(); i++) {
            print(input.substring(1), ar, ans + press.charAt(i));
        }
    }

}
