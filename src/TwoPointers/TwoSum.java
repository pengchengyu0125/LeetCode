/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.


Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]


Constraints:

2 <= nums.length <= 3 * 104
-1000 <= nums[i] <= 1000
nums is sorted in increasing order.
-1000 <= target <= 1000
 */
package TwoPointers;

public class TwoSum {
    public static void main(String[] args) {
        int a[];
        a=new int[]{2,7,11,15};
        int target=9;
        TwoSum twoSum=new TwoSum();
        a=twoSum.twoSum(a,target);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        int num[];
        num=new int[]{0,0};
        int i=0,j=numbers.length-1;
        while (i<j){
            if (numbers[i]+numbers[j]==target){
                num[0]=i+1;
                num[1]=j+1;
                break;
            }
            else if (numbers[i]+numbers[j]>target){
                --j;
            }
            else ++i;
        }
        return num;
    }
}
