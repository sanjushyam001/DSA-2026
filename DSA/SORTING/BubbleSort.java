import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int ar[] = new int[] { 4, 5, 8, 1, 3, 6 };
        int ar2[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        int sortedArr[] = sort(ar2);

        System.out.println(Arrays.toString(sortedArr));
    }

    private static int[] sort(int ar[]) {

        for (int i = 0; i < ar.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < ar.length - 1 - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;

                    flag = true;
                }
                
            }
            if (!flag)
                return ar;
        }

        return ar;
    }
}
