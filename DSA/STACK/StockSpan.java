package DSA.STACK;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int ar[] = { 3, 1, 6, 4, 18, 7, 5, 11 };
        display(ar);
        display(stockSpan(ar));
    }

    private static int[] stockSpan(int ar[]) {

        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {

            while (!stack.isEmpty() && ar[i] >= ar[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = i - (-1);
            } else {
                ans[i] = i - stack.peek();
            }
            stack.push(i);
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
