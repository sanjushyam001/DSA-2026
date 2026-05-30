package arrays;
class PrintArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}