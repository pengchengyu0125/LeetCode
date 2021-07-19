/*
Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */
public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        WordSearch wordSearch = new WordSearch();
        System.out.println(wordSearch.exist(board, word));
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (word.charAt(0) == board[i][j])
                    if (helper(board, word, i, j, 0, new boolean[m][n]))
                        return true;
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int row, int col, int index, boolean[][] visited) {
        if (index == word.length())
            return true;
        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length)
            return false;
        if (visited[row][col])
            return false;
        if (board[row][col] != word.charAt(index))
            return false;
        visited[row][col] = true;
        if (helper(board, word, row + 1, col, index + 1, visited) || helper(board, word, row - 1, col, index + 1, visited) || helper(board, word, row, col + 1, index + 1, visited) || helper(board, word, row, col - 1, index + 1, visited))
            return true;
        visited[row][col] = false;
        return false;
    }
}
