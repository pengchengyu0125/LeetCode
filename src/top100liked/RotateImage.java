package top100liked;

/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 */
public class RotateImage {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        RotateImage rotate = new RotateImage();
        rotate.rotate(matrix);
        System.out.println(matrix[0][0]);
    }
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int copy[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                copy[i][j] = matrix[i][j];
            }
        }
        if (m ==1) {
            return;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[j][m-1-i] = copy[i][j];
            }
        }
    }
}
