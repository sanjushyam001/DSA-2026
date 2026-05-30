public class FindCorrectPositionOfElement {

    public static void main(String[] args) {

        int ar[] = new int[] { 2, 4, 6, 8, 10, 14, 16, 18 };
        int position = find(ar, 1);
        System.out.println("Correct Position: " + position);
    }

    private static int find(int ar[], int target) {

        int start = 0;
        int end = ar.length - 1;
        int position = ar.length;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (ar[mid] == target) {
                return mid;
            }
            if (ar[mid] < target) {
                start = mid + 1;
            } else {
                position = mid;
                end = mid - 1;
            }
        }
        return position;
    }
}