public class MazePath {

    static int r = 2;
    static int c = 2;

    public static void main(String[] args) {

        int er = 2;
        int ec = 2;
        int totalPaths = path(0, 0, er, ec, "");
        System.out.println("TOTAL PATH: " + totalPaths);

    }

    private static int path(int currRow, int currColumn, int er, int ec, String path) {

        if (currRow == er && currColumn == ec) {
            System.out.println(path);
            return 1;
        }

        if (currRow > r || currColumn > c)
            return 0;
        int p1 = path(currRow, currColumn + 1, er, ec, path + "H");
        int p2 = path(currRow + 1, currColumn, er, ec, path + "C");
        return p1 + p2;
    }
}
