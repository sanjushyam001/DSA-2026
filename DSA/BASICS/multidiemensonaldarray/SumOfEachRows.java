public class SumOfEachRows {
    public static void main(String[] args) {

        int ar[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 }, { 10, 11, 12 } };
        sum(ar);
    }

    private static void sum(int ar[][]) {

        for (int i = 0; i < ar.length; i++) {
            int sum = 0;
            for (int j = 0; j < ar[i].length; j++) {
                sum += ar[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " = " + sum);
        }
    }
}
