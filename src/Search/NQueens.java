/*
The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.



Given an integer n, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.

Example:

Input: 4
Output: [
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.
 */
package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    static int resultCount = 0;

    private static boolean place(int[] arr, int s) {
        for(int i = 0; i < s; i++) {
            if((arr[i] == arr[s]) || (Math.abs(i-s) == Math.abs(arr[i]-arr[s]))) {
                return false;
            }
        }

        return true;
    }

    public static void tria(int[] arr, int i, int n) {
        if(i >= n) {
            ++resultCount;
        } else {
            for(int j = 0; j < n; j++) {
                arr[i] = j;
                if(place(arr, i)) {
                    tria(arr, i+1, n);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] queen = new int[4];
        tria(queen, 0, 4);

        System.out.println(resultCount);
    }

}
