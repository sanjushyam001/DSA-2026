public class PainterAlloaction {
    public static void main(String[] args) {
        int ar[] = { 5, 10, 30, 20, 15 };
        // int result = min(ar);
        int result = minByBinarySearch(ar, 3);
        System.out.println("RESULT: " + result);
    }

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
