public class FirstLastOccurenceOfElement {
    public static void main(String[] args) {
        int ar[] = new int[] { 5, 7, 7, 8, 8, 10 };
        int firstCoccerenceIndex = first(ar, 10);
        int lastCoccerenceIndex = last(ar, 10);
        System.out.println("First: " + firstCoccerenceIndex);
        System.out.println("Last: " + lastCoccerenceIndex);
    }

    private static int first(int ar[], int target) {

        int start = 0;
        int end = ar.length - 1;
        int firstOccurenceIndex = -1;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (ar[mid] >= target) {
                firstOccurenceIndex = mid;
                end = mid - 1;
            }
            // else if (ar[mid] > target) {
            // end = mid - 1;
            // }
            else {
                start = mid + 1;
            }
        }
        return firstOccurenceIndex;
    }

    private static int last(int ar[], int target) {

        int start = 0;
        int end = ar.length - 1;
        int lastOccurenceIndex = -1;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (ar[mid] <= target) {
                lastOccurenceIndex = mid;
                start = mid + 1;
            }
            // else if (ar[mid] > target) {
            // end = mid - 1;
            // }
            else {
                start = mid + 1;
            }
        }
        return lastOccurenceIndex;
    }
}
