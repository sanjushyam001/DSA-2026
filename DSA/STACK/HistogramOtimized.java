package DSA.STACK;

import java.util.Stack;

public class HistogramOtimized {
    public static void main(String[] args) {

        int ar[] = { 2, 1, 5, 6, 2, 3 };
        int ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < ar.length; i++) {

            while (!stack.isEmpty() && ar[i] < ar[stack.peek()]) {
                int index = stack.peek();
                stack.pop();
                if (stack.isEmpty()) {
                    ans = Math.max(ans, (ar[index]) * (i - 0));
                } else {

                    ans = Math.max(ans, (ar[index]) * (i - stack.peek() - 1));
                }
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int index = stack.peek();
            stack.pop();
            if (stack.isEmpty()) {

                ans = Math.max(ans, (ar[index]) * (ar.length - 0));
            } else {

                ans = Math.max(ans, (ar[index]) * (ar.length - stack.peek() - 1));
            }

        }
        System.out.println("HISTOGRAM: " + ans);
    }
}
