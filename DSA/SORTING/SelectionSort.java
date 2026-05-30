import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int ar[] = new int[] { 4, 5, 8, 1, 3, 6 };
        int sortedArr[] = sort(ar);

        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] sort(int ar[]) {

        int min = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            min = i;
            for (int j = i; j < ar.length; j++) {

                if (ar[j] < ar[min]) {
                    min = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        return ar;
    }
}
