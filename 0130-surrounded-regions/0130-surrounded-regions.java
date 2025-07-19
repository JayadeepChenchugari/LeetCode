class Solution {
    public void solve(char[][] board) {
        int height = board.length, width = board[0].length;

        // Step 1: Mark border-connected 'O's
        for (int i = 0; i < height; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][width - 1] == 'O') dfs(board, i, width - 1);
        }

        for (int j = 0; j < width; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[height - 1][j] == 'O') dfs(board, height - 1, j);
        }

        // Step 2 & 3: Flip surrounded 'O' to 'X', and safe 'S' back to 'O'
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == 'S') board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
            board[i][j] == 'X' || board[i][j] == 'S') {
            return;
        }

        board[i][j] = 'S'; // Mark as safe

        dfs(board, i - 1, j); // Up
        dfs(board, i + 1, j); // Down
        dfs(board, i, j - 1); // Left
        dfs(board, i, j + 1); // Right
    }
}