public class BinarySearch {

    public static void main(String[] args) {

        int ar[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int result = search(ar, 4);
        if (result != -1) {
            System.out.println("Target element is available at : " + result);
        } else {
            System.out.println("Target element is not available ");

        }
    }

    private static int search(int ar[], int target) {

        int start = 0;
        int end = ar.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (ar[mid] == target) {
                return mid;
            } else if (ar[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
