package interviewQ;

public class SR130 {
    public void solve(char[][] board) {
        if (board == null || board.length < 2) return;
        for (int i = 0; i < board.length; i++) {
            dfs(board, i, 0);
            dfs(board, i, board[0].length-1);
        }
        for (int i = 1; i < board[0].length-1; i++) {
            dfs(board, 0, i);
            dfs(board, board.length-1, i);
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
    public void dfs(char[][] board, int i, int j){
        if (board[i][j] == 'X' || board[i][j] == '1')
            return;
        else {
            board[i][j] = '1';
            if (i > 0 && j>0 && i < board.length - 1 && j < board[0].length - 1){
                dfs(board, i-1, j);
                dfs(board, i+1, j);
                dfs(board, i, j-1);
                dfs(board, i, j+1);
            }
            else if (j == 0)
                dfs(board, i, j+1);
            else if (j == board[0].length-1)
                dfs(board, i, j-1);
            else if (i == 0)
                dfs(board, i+1, j);
            else if (i == board.length-1)
                dfs(board, i-1, j);
            return;
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        SR130 sr130 = new SR130();
        sr130.solve(board);
        System.out.println(board.toString());
    }
}
