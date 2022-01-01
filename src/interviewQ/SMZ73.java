package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class SMZ73 {
    public static void main(String[] args) {
        int matrix[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        SMZ73 smz73 = new SMZ73();
        smz73.setZeroes(matrix);
        System.out.println(matrix.toString());
    }
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for (int i = 0; i < rows.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[rows.get(i)][j] = 0;
            }
        }
        for (int i = 0; i < columns.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][columns.get(i)] = 0;
            }
        }
    }
}
