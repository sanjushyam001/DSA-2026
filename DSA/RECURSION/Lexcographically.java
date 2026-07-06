public class Lexcographically {
    public static void main(String[] args) {
        print(0, 1000);
    }

    private static void print(int currValue, int n) {

        if (currValue > n) {
            return;
        }
        System.out.println(currValue);
        int i = 0;
        if (currValue == 0) {
            i = 1;
        }

        for (; i <= 9; i++) {
            print(currValue * 10 + i, n);
        }
    }
}
