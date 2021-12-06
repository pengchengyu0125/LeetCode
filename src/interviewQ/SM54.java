package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class SM54 {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        SM54 sm54 = new SM54();
        System.out.println(sm54.spiralOrder(matrix).toString());
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;
        int direction = 0;
        List<Integer> list = new ArrayList<>();
        while (left < right && top < bottom) {
            if (direction == 0) {
                for (int i = left; i < right; i++) {
                    list.add(matrix[top][i]);
                }
                ++top;
                direction = 1;
            }
            else if (direction == 1) {
                for (int i = top; i < bottom; i++) {
                    list.add(matrix[i][right - 1]);
                }
                --right;
                direction = 2;
            }
            else if (direction == 2) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[bottom - 1][i]);
                }
                --bottom;
                direction = 3;
            }
            else {
                for (int i = bottom - 1; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                ++left;
                direction = 0;
            }
        }
        return list;
    }
}
