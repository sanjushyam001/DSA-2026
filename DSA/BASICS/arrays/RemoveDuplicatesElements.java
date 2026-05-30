package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesElements {

    private static int[] array;

    public static void main(String[] args) {

        int ar[] = { 1, 1, 2, 2, 2, 2, 4, 3, 3 };
        // remove(ar);
        // removeWithStreams(ar);
        removeWithCollection(ar);
    }

    private static void remove(int ar[]) {

        int i = 0;
        for (int j = 0; j < ar.length; j++) {

            if (ar[j] != ar[i]) {
                i++;
                ar[i] = ar[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(ar[k]);
        }
    }

    private static void removeWithStreams(int ar[]) {

        int unique[] = Arrays.stream(ar)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(unique));
    }

    private static void removeWithCollection(int ar[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int e : ar) {

            // if (!set.add(e))
            // System.out.print(e);
            if (set.add(e))
                System.out.print(e);
        }
    }
}
