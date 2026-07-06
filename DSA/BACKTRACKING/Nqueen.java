package DSA.BACKTRACKING;

public class Nqueen {

    public static void main(String[] args) {

        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '.';
            }
            System.out.println();
        }
        nQueen(board, 0, n);

    }

    private static void nQueen(char board[][], int row, int totalQueens) {
        if (totalQueens == 0) {
            display(board);
            return;
        }
        for (int i = 0; i < board[0].length; i++) {

            if (isSafe(row, i, board)) {

                board[row][i] = 'Q';
                nQueen(board, row + 1, totalQueens - 1);
                board[row][i] = '.';
            }
        }
    }

    private static boolean isSafe(int row, int col, char board[][]) {

        int r = row;
        int c = col;
        while (r >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
        }
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c] == 'Q')
                return false;
            r--;
            c++;
        }
        return true;
    }

    private static void display(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }
}
