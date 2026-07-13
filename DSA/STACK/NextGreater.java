package DSA.STACK;

import java.util.Stack;

public class NextGreater {

    public static void main(String[] args) {

        int ar[] = { 11, 9, 13, 21, 3, 5 };
        display(ar);
        display(nextGreater(ar));
    }

    private static int[] nextGreater(int ar[]) {

        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {

            while (!stack.isEmpty() && ar[i] >= ar[stack.peek()]) {
                ans[stack.peek()] = ar[i];
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
