package DSA.BACKTRACKING;

public class Sudoku {
    public static void main(String[] args) {

        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        solve(board, 0, 0);
    }

    private static void solve(int board[][], int row, int col) {

        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            display(board);
            return;
        }
        if (board[row][col] != 0) {
            solve(board, row, col + 1);
        } else {
            for (int value = 1; value <= 9; value++) {

                if (isSafe(board, row, col, value)) {
                    board[row][col] = value;
                    solve(board, row, col + 1);
                    board[row][col] = 0;
                }
            }
        }

    }

    private static boolean isSafe(int[][] board, int row, int col, int value) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value)
                return false;
        }
        for (int j = 0; j < 9; j++) {
            if (board[j][col] == value)
                return false;

        }
        int r = row - (row % 3);
        int c = col - (col % 3);

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == value)
                    return false;
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

}
