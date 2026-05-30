public class FindSqrtOfGivenElement {

    public static void main(String[] args) {

        int sqrt = findSqrt(80);
        System.out.println("SQRT of given number is : " + sqrt);
    }

    private static int findSqrt(int target) {
        int start = 1;
        int end = target;
        int result = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if ((mid * mid) == target) {
                return mid;
            } else if ((mid * mid) < target) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}