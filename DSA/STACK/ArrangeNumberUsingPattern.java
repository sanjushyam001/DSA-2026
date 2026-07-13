package DSA.STACK;

import java.util.Arrays;
import java.util.Stack;

public class ArrangeNumberUsingPattern {

    public static void main(String[] args) {

        String pattern = "DDIIDDI";
        int result[] = arrange(pattern);
        System.out.println(Arrays.toString(result));

    }

    private static int[] arrange(String pattern) {
        Stack<Integer> stack = new Stack<>();
        int ar[] = new int[pattern.length() + 1];
        for (int i = ar.length; i >= 1; i--) {
            stack.push(i);
        }
        int count = 0;
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            count++;
            if (ch == 'I') {
                ar[i] = stack.pop();
                int j = i;
                while (count != 1) {
                    ar[--j] = stack.pop();
                    count--;
                }
                count = 0;
            }
        }
        while (!stack.isEmpty()) {
            ar[pattern.length()] = stack.pop();
        }
        return ar;
    }
}
