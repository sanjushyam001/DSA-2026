class Print {
    public static void main(String[] args) {
        print2(5);
    }

    private static void print1(int n) {

        if (n == 0)
            return;
        System.out.println(n);
        print1(n - 1);
    }

    private static void print2(int n) {

        if (n == 0)
            return;
        print2(n - 1);
        System.out.println(n);
    }
}