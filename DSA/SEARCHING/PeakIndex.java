class PeakIndex {
    public static void main(String[] args) {
        int ar[] = { 2, 4, 6, 8, 10, 8, 5 };
        int result = peakIndex(ar);
        System.out.println("PEAK INDEX IS : " + result);
    }

    private static int peakIndex(int ar[]) {

        int start = 0;
        int end = ar.length - 1;
        while (start <= end) {

            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;
            if (ar[mid] > ar[mid - 1] && ar[mid] > ar[mid + 1]) {
                return mid;
            } else if (ar[mid] > ar[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}