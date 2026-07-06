package DSA.BACKTRACKING;

import java.util.Arrays;

public class QueenPermutation {

    public static void main(String[] args) {

        System.out.println("START");
        boolean board[] = new boolean[4];
        System.out.println(Arrays.toString(board));
        int totalQueens = 2;
        permute(board, totalQueens, 0, "");

    }

    private static void permute(boolean board[], int totalQueens, int currentQueen, String result) {
        if (currentQueen == totalQueens) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < board.length; i++) {

            if (board[i] == false) {
                board[i] = true;
                System.out.println("I: " + i);
                System.out.println(Arrays.toString(board));
                permute(board, totalQueens, currentQueen + 1, result + "B[" + i + "]Q+[" + currentQueen + "]");
                board[i] = false;
                System.out.println(Arrays.toString(board));
            }
        }

    }
}
