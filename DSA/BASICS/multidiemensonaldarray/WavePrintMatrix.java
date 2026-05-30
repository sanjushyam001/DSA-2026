import java.util.ArrayList;
import java.util.List;

public class WavePrintMatrix {

    public static void main(String[] args) {
        int ar[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 }, { 10, 11, 12 } };
        print(ar);
        System.out.println("--------");
        wave(ar).forEach(e -> System.out.print(e + " "));
    }

    private static void print(int ar[][]) {

        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static List<Integer> wave(int ar[][]) {

        List<Integer> list = new ArrayList<>();

        for (int c = 0; c < ar[0].length; c++) {
            if (c % 2 != 0) {
                for (int r = ar.length - 1; r >= 0; r--) {
                    list.add(ar[r][c]);
                }
            } else {
                for (int r = 0; r < ar.length; r++) {
                    list.add(ar[r][c]);
                }

            }
        }
        return list;

    }
}
