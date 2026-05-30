package arrays;

import java.util.Arrays;

public class PivotIndex {

    public static void main(String[] args) {

        int ar[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex2(ar));
    }

    private static int pivotIndex(int ar[]) {

        for (int i = 0; i < ar.length; i++) {

            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += ar[j];
            }
            for (int j = i + 1; j < ar.length; j++) {
                rightSum += ar[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    private static int pivotIndex2(int ar[]) {
        int leftSum = 0;
        int rightSum = 0;
        int left[] = new int[ar.length];
        int right[] = new int[ar.length];

        for (int j = 0; j < ar.length; j++) {
            leftSum += ar[j];
            left[j] = leftSum;
        }
        for (int j = ar.length - 1; j >= 0; j--) {
            rightSum += ar[j];
            right[j] = rightSum;
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        for (int i = 0; i < ar.length; i++) {
            if (left[i] == right[i])
                return i;
        }
        return -1;

    }
}
