import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int ar[] = new int[] { 4, 5, 8, 1, 3, 6 };
        System.out.println(Arrays.toString(sort(ar)));
    }

    private static int[] sort(int ar[]) {

        int i = 0;
        while (i < ar.length - 1) {

            // for (int j = i + 1; j > 0; j--) {

            // if (ar[j - 1] > ar[j]) {
            // int temp = ar[j];
            // ar[j] = ar[j - 1];
            // ar[j - 1] = temp;
            // }
            // }
            // i++;
            int j = i + 1;
            while (j > 0 && ar[j] < ar[j - 1]) {

                if (ar[j - 1] > ar[j]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                }
                j--;
            }
            i++;
        }
        return ar;
    }
}
