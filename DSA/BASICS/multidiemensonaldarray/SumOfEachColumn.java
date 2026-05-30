public class SumOfEachColumn {
    public static void main(String[] args) {

        int ar[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 }, { 10, 11, 12 } };
        print(ar);
        sum(ar);

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

    private static void sum(int ar[][]) {

        System.out.println("Length : " + ar[0].length);
        for (int i = 0; i < ar[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < ar.length; j++) {
                sum += ar[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column = " + sum);
        }
    }
}
