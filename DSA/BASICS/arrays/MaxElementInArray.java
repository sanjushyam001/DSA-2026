package arrays;

import java.util.Arrays;

public class MaxElementInArray {
    public static void main(String[] args) {

        int[] numbers = { 4, 8, 5, 7 };
        // int max = getMaxElement(numbers);
        // System.out.println("Max element is: " + max);
        int max2 = getMaxElementUsingJava8(numbers);
        System.out.println("Max element is: " + max2);
    }

    private static int getMaxElement(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;

    }

    private static int getMaxElementUsingJava8(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        return Arrays.stream(numbers)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Array must not be empty"));

    }
}
