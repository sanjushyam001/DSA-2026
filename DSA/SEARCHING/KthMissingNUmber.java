public class KthMissingNUmber {

    public static void main(String[] args) {

        int ar[] = { 2, 3, 4, 7, 11 };
        int index = kthMissingNumber(ar, 5);
        System.out.println("INDEX IS : : " + index);
    }

    private static int kthMissingNumber(int ar[], int k) {

        int start = 0;
        int end = ar.length - 1;
        int index = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if ((ar[mid] - (mid + 1)) >= k) {
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Index >> " + index);
        System.out.println("Kth >> " + ((ar[index] - (index + 1)) - k + 1));
        return ar[index] - ((ar[index] - (index + 1)) - k + 1);

    }
}
