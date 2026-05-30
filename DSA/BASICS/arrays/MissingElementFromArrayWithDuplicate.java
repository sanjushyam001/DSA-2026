package arrays;

import java.util.Arrays;

public class MissingElementFromArrayWithDuplicate {
    public static void main(String[] args) {

        int ar[] = new int[] { 1, 4, 4, 5, 2, 2 };
        missing(ar);
    }

    private static void missing(int ar[]) {

        for (int i = 0; i < ar.length; i++) {
            int index = Math.abs(ar[i]) - 1;
            if (!(ar[index] < 0))
                ar[index] = (-1 * ar[index]);
        }
        System.out.println(Arrays.toString(ar));

        for (int i = 0; i < ar.length; i++) {
            if (!(ar[i] < 0))
                System.out.println(i + 1);
        }

    }
}
