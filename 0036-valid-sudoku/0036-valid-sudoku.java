class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Moving Diagonally, Checking all the rows and columns
        for (int index = 0; index < 9; index++) {
            if (!checkLines(board, index))
                return false;
        }

        // Checking each 3x3 block
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                if (!checkBlock(board, i, j))
                    return false;
            }
        }

        return true;
    }

    private boolean checkLines(char[][] board, int index) {
        Set<Character> set = new HashSet<>();

        // Checking Rows
        for (int i = 0; i < 9; i++) {
            if (board[i][index] == '.')
                continue;

            if (set.contains(board[i][index]))
                return false;

            set.add(board[i][index]);
        }

        set = new HashSet<>();

        // Checking Columns
        for (int i = 0; i < 9; i++) {
            if (board[index][i] == '.')
                continue;

            if (set.contains(board[index][i]))
                return false;

            set.add(board[index][i]);
        }

        return true;
    }

    private boolean checkBlock(char[][] board, int r, int c) {
        Set<Character> set = new HashSet<>();

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (board[i][j] == '.')
                    continue;

                if (set.contains(board[i][j]))
                    return false;

                set.add(board[i][j]);
            }
        }

        return true;
    }
}