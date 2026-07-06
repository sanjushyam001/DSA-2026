package DSA.BACKTRACKING;

public class WordSearch {
    public static void main(String[] args) {

        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        boolean isExist = wordSearch(board, "ABCCED");
        if (isExist)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean wordSearch(char board[][], String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean search(char board[][], String word, int row, int col, int index) {

        if (index == word.length()) {
            return true;
        }
        if (row < 0 || col < 0 || row >= board.length || col >= board.length || board[row][col] != word.charAt(index)) {
            return false;
        }
        int r[] = { -1, 1, 0, 0 };
        int c[] = { 0, 0, -1, 1 };

        board[row][col] = '*';
        for (int i = 0; i < c.length; i++) {

            boolean ans = search(board, word, row + r[i], col + c[i], index + 1);
            if (ans == true)
                return true;
        }
        board[row][col] = word.charAt(index);
        return false;
    }
}
