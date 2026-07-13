package DSA.STACK;

import java.util.Stack;

public class Histogram {

    public static void main(String[] args) {

        int ar[] = { 2, 1, 5, 6, 2, 3 };
        display(ar);
        display(rightMinArr(ar));
        display(leftMinArr(ar));
        System.out.println("--------------");
        System.out.println("HISTOGRAM: " + histogram(ar, rightMinArr(ar), leftMinArr(ar)));
    }

    private static int histogram(int ar[], int right[], int left[]) {

        int ans = 0;
        for (int i = 0; i < ar.length; i++) {
            if (left[i] < 0) {

                ans = Math.max(ans, ar[i] * (right[i]));
            } else {

                ans = Math.max(ans, ar[i] * (right[i] - left[i] - 1));
            }
        }

        return ans;
    }

    private static int[] rightMinArr(int ar[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[ar.length];

        for (int i = 0; i < ar.length; i++) {

            while (!stack.isEmpty() && ar[i] < ar[stack.peek()]) {
                ans[stack.peek()] = i;
                stack.pop();
            }

            stack.push(i);
        }
        while (!stack.isEmpty()) {

            ans[stack.peek()] = ar.length;
            stack.pop();

        }
        return ans;
    }

    private static int[] leftMinArr(int ar[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[ar.length];

        for (int i = ar.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && ar[i] < ar[stack.peek()]) {
                ans[stack.peek()] = i;
                stack.pop();
            }

            stack.push(i);
        }
        while (!stack.isEmpty()) {

            ans[stack.peek()] = -1;
            stack.pop();

        }
        return ans;
    }

    private static void display(int ar[]) {
        System.out.print("|");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "|");
        }
        System.out.println();
    }
}
