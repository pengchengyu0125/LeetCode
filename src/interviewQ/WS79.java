package interviewQ;

public class WS79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int wl = word.length();
        if (m * n < wl)
            return false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (find(i, j, 0, wl, board, word, new boolean[m][n]))
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(int i, int j, int num, int wl, char[][] board, String word, boolean[][] visited) {
        if (num == wl) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return false;
        if (visited[i][j])
            return false;
        if (board[i][j] != word.charAt(num))
            return false;
        visited[i][j] = true;
        if (find(i, j + 1, num + 1, wl, board, word, visited)
                || find(i + 1, j, num + 1, wl, board, word, visited)
                || find(i, j - 1, num + 1, wl, board, word, visited)
                || find(i - 1, j, num + 1, wl, board, word, visited))
            return true;
        visited[i][j] = false;
        return false;
    }

    public static void main(String[] args) {
        char board[][] = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        WS79 ws79 = new WS79();
        System.out.println(ws79.exist(board, word));
    }
}
