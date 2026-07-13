package DSA.STACK;

import java.util.Stack;

public class FindCelebrity {
    public static void main(String[] args) {

        int ar[][] = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };

        System.out.println("has celebrity found? " + find(ar));

    }

    private static int find(int ar[][]) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ar.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {

            int row = stack.pop();
            int col = stack.pop();

            if (ar[row][col] == 1) {
                stack.push(col);
            } else {
                stack.push(row);
            }
        }
        if (stack.size() == 1) {
            System.out.println("STACK LAST ELEMENT : " + stack.peek());

            int index = stack.pop();
            for (int i = 0; i < ar.length; i++) {
                if(i==index){
                    if(ar[index][i]!=0)
                        return -1;
                }
                else if (ar[index][i] != 0 || ar[i][index]!=1) {
                    return -1;
                }else{
                    return 1;
                }
            }
            // for (int i = 0; i < ar.length; i++) {
            // for (int j = 0; j < ar[i].length; j++) {

            // if (i == index && ar[index][j] != 0) {
            // System.out.println("i - " + i + " j - " + j);
            // return -1;
            // }
            // if (j == index && ar[i][index] != 1) {
            // if (ar[index][index] != 0) {
            // return -1;
            // }
            // }
            // }
            // }

        }
        return 1;

    }

}
