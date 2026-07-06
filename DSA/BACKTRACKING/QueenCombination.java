package DSA.BACKTRACKING;

import java.util.Arrays;

public class QueenCombination {

    public static void main(String[] args) {

        // System.out.println("START");
        boolean board[] = new boolean[4];
        // System.out.println(Arrays.toString(board));
        int totalQueens = 2;
        int total = permute(board, totalQueens, 0, "", 0);
        System.out.println("TOTAL : " + total);

    }

    private static int permute(boolean board[], int totalQueens, int currentQueen, String result, int currentIndex) {
        if (currentQueen == totalQueens) {
            System.out.println(result);
            return 1;
        }
        int total = 0;
        for (int i = currentIndex; i < board.length; i++) {

            if (board[i] == false) {
                board[i] = true;
                // System.out.println("I: " + i);
                // System.out.println(Arrays.toString(board));
                total += permute(board, totalQueens, currentQueen + 1, result + "B[" + i + "]Q+[" + currentQueen + "]",
                        i + 1);
                board[i] = false;
                // System.out.println(Arrays.toString(board));
            }
        }
        return total;

    }
}
