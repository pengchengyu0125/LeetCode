package top100liked;

/*
Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 */
public class MaximalRectangle {
    public static void main(String[] args) {
        char matrix[][] = {{'1','0','1','0','0'}, {'1','0','1','1','1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        MaximalRectangle maximalRectangle = new MaximalRectangle();
        System.out.println(maximalRectangle.maximalRectangle(matrix));
    }
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)
            return 0;
        int max = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] height = new int[cols];
        int[] left = new int[cols];  //左边界(与高度相关进行判断)
        int[] right = new int[cols]; //右边界
        for(int i=0; i<cols; i++){
            right[i] = cols;
        }
        for(int i=0; i<rows; i++){
            int curLeft = 0;
            int curRight = cols;   //当前左边界和右边界
            //更新左边界
            for(int j=0; j<cols; j++){
                if(matrix[i][j] == '1'){
                    height[j]++;
                    left[j] = Math.max(curLeft, left[j]);
                }else{
                    height[j] = 0;
                    curLeft = j+1;
                    left[j] = 0;
                }
            }
            for(int j=cols-1; j>=0; j--){
                if(matrix[i][j]=='1'){
                    right[j] = Math.min(curRight, right[j]);  //很重要的一步
                }else{
                    right[j] = cols;
                    curRight = j;
                }
                //max = Math.max(max, (right[j]-left[j])*height[j]);
            }
            for(int k=0;k<cols;k++){
                if(max<(right[k]-left[k])*height[k]){
                    max=(right[k]-left[k])*height[k];
                }
            }
        }
        return max;
    }
}

