public class MinElementInRoatedArray {

    public static void main(String[] args) {
        int ar[] = { 8, 10, 2, 4, 6 };
        int result = index(ar);
        System.out.println("MINIMUM INDEX IS : " + result);
    }

    private static int index(int ar[]) {

        int start = 0;
        int end = ar.length - 1;
        int index = 0;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (ar[mid] < ar[0]) {
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return index;
    }
}
