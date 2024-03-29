/*
Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

A region is captured by flipping all 'O's into 'X's in that surrounded region.

Example:

X X X X
X O O X
X X O X
X O X X
After running your function, the board should be:

X X X X
X X X X
X X X X
X O X X
Explanation:

Surrounded regions shouldn’t be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically.
 */
package Search;

public class SurroundedRegions {
    public static void main(String[] args) {
        char board[][] = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};
        SurroundedRegions s = new SurroundedRegions();
        s.solve(board);
    }

    public void solve(char[][] board) {
        if (board == null || board.length < 2) return;
        for (int i = 0; i < board.length; i++) {
            dfs(board, i, 0);
            dfs(board, i, board[0].length - 1);
        }
        for (int i = 1; i < board[0].length - 1; i++) {
            dfs(board, 0, i);
            dfs(board, board.length - 1, i);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '1')
                    board[i][j] = 'O';
                else if (board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

    public void dfs(char[][] board, int i, int j) {
        if (board[i][j] == 'X' || board[i][j] == '1')
            return;
        else {
            board[i][j] = '1';
            if (i > 0 && j > 0 && i < board.length - 1 && j < board[0].length - 1) {
                dfs(board, i - 1, j);
                dfs(board, i + 1, j);
                dfs(board, i, j - 1);
                dfs(board, i, j + 1);
            } else if (j == 0)
                dfs(board, i, j + 1);
            else if (j == board[0].length - 1)
                dfs(board, i, j - 1);
            else if (i == 0)
                dfs(board, i + 1, j);
            else if (i == board.length - 1)
                dfs(board, i - 1, j);
            return;
        }
    }
}
