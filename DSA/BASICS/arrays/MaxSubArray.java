package arrays;

public class MaxSubArray {
    public static void main(String[] args) {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int result = max(nums);
        // System.out.println("RESULT: " + result);
        // int result2 = max2(nums);
        // System.out.println("RESULT: " + result2);
        int kadanesAlgoResult = kadanesAlgo(nums);
        System.out.println("RESULT: " + kadanesAlgoResult);
    }

    // O(n^3)
    private static int max(int ar[]) {
        int n = ar.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += ar[k];
                }
                if (sum > max)
                    max = sum;

            }
        }
        return max;
    }

    // O(n^2)
    private static int max2(int ar[]) {
        int n = ar.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += ar[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }

    public static int kadanesAlgo(int ar[]) {

        int currSum = 0;
        int max = Integer.MIN_VALUE;
        // [-2, +1, -3, +4, -1, +2, +1, -5, +4]
        for (int i = 0; i < ar.length; i++) {
            // 1
            if ((currSum + ar[i]) < ar[i]) {
                currSum = ar[i];
            } else {
                currSum = currSum + ar[i];
            }
            if (currSum > max)
                max = currSum;
        }
        return max; // 6,1,5
    }
}
