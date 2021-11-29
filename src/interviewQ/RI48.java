package interviewQ;

public class RI48 {
    public static void main(String[] args) {
        int matrix[][] = {{
                5, 1, 9, 11
        }, {
                2, 4, 8, 10
        }, {
                13, 3, 6, 7
        }, {
                15, 14, 12, 16
        }};
        RI48 ri48 = new RI48();
        ri48.rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int copy[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                copy[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][m-1-i] = copy[i][j];
            }
        }
    }
}
