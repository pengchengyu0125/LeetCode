package interviewQ;

public class VS36 {
    public static void main(String[] args) {
        char board[][] = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '5', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        VS36 vs36 = new VS36();
        System.out.println(vs36.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] != '.') {
                    flag = row(i, j, m, board);
                    if (flag == false)
                        return flag;
                    flag = column(i, j, n, board);
                    if (flag == false)
                        return flag;
                    flag = nine(i, j, board);
                    if (flag == false)
                        return flag;
                }
            }
        }
        return flag;
    }

    public boolean row(int i, int j, int m, char[][] board) {
        if (j == m - 1)
            return true;
        for (int k = j + 1; k < m; k++) {
            if (board[i][k] != '.') {
                if (board[i][j] == board[i][k])
                    return false;
            }
        }
        return true;
    }

    public boolean column(int i, int j, int n, char[][] board) {
        if (i == n - 1)
            return true;
        for (int k = i + 1; k < n; k++) {
            if (board[k][j] != '.') {
                if (board[i][j] == board[k][j])
                    return false;
            }
        }
        return true;
    }

    public boolean nine(int i, int j, char[][] board) {
        int a = i / 3 * 3;
        int b = j / 3 * 3;
        for (int k = a; k < a + 3; k++) {
            for (int l = b; l < b + 3; l++) {
                if (board[k][l] != '.' && k != i && l != j) {
                    if (board[i][j] == board[k][l])
                        return false;
                }
            }
        }
        return true;
    }
}
