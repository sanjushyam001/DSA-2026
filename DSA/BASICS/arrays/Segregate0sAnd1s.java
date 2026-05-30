package arrays;

public class Segregate0sAnd1s {

    public static void main(String[] args) {
        int ar[] = new int[] { 1, 0, 1, 1, 0, 1, 1 };
        segregate(ar);
        for (int i : ar) {
            System.out.print(i + " ");
        }
    }

    private static void segregate(int ar[]) {

        int i = 0, j = ar.length - 1;

        while (i < j) {

            while (ar[i] < 1) {

                i++;
            }
            while (ar[j] > 0) {
                j--;
            }

            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            i++;
            j--;

        }

    }

}
