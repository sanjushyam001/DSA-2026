public class SearchInRoatedArray {

    public static void main(String[] args) {
        int ar[] = { 2, 4, 6, 8, 10 };
        int result = index(ar, 4);
        System.out.println(" INDEX IS : " + result);
    }

    private static int index(int ar[], int target) {

        int start = 0;
        int end = ar.length - 1;
        int index = -1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == ar[mid])
                return mid;

            else if (ar[mid] >= ar[0]) {
                if (target >= ar[start] && target <= ar[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (ar[mid] < ar[0]) {
                if (target >= ar[mid] && target <= ar[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return index;
    }
}
