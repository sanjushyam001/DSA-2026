class BookAllocation {
    public static void main(String[] args) {

        int ar[] = { 12, 34, 67, 90 };
        // int result = min(ar);
        int result = minByBinarySearch(ar, 2);
        System.out.println("RESULT: " + result);
    }

    // Solved By Brute Force Approach
    private static int min(int ar[]) {

        long startTime = System.nanoTime();

        int n = ar.length;
        int firstHalf = 0;
        int secondHalf = 0;
        int min = Integer.MAX_VALUE;
        ;
        int currentMax = 0;
        for (int i = 0; i < n - 1; i++) {

            firstHalf += ar[i];
            secondHalf = 0;
            for (int j = i + 1; j < n; j++) {
                secondHalf += ar[j];
            }
            currentMax = firstHalf > secondHalf ? firstHalf : secondHalf;

            if (currentMax < min) {
                min = currentMax;
            }

        }
        long endTime = System.nanoTime();
        long totalTimeNs = endTime - startTime;
        double totalTimeMs = totalTimeNs / 1_000_000.0;

        System.out.println("Execution time: " + totalTimeMs + " ms");
        return min;
    }

    // Solved By Binary Search Approach

    private static int minByBinarySearch(int ar[], int m) {

        long startTime = System.nanoTime();
        int start = ar[ar.length - 1];
        int end = sum(ar);
        int n = ar.length;
        int result = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int page = 0;
            int count = 1;
            for (int i = 0; i < n; i++) {
                page += ar[i];
                if (page > mid) {
                    count++;
                    page = ar[i];
                }
            }

            if (count <= m) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        long endTime = System.nanoTime();
        long totalTimeNs = endTime - startTime;
        double totalTimeMs = totalTimeNs / 1_000_000.0;

        System.out.println("Execution time: " + totalTimeMs + " ms");
        return result;
    }

    private static int sum(int ar[]) {
        int sum = 0;
        for (int e : ar) {
            sum += e;
        }
        return sum;
    }
}