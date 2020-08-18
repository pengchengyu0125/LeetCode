package BinarySearch;

/*
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.

Follow up: Your solution should run in O(log n) time and O(1) space.



Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10


Constraints:

1 <= nums.length <= 10^5
0 <= nums[i] <= 10^5
 */
public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        int nums[];
        nums=new int[]{3,3,7,7,10,11,11};
        SingleElementinaSortedArray singleElementinaSortedArray=new SingleElementinaSortedArray();
        int num=singleElementinaSortedArray.singleNonDuplicate(nums);
        System.out.println(num);
    }
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        while(l < h) {
            int m = l + (h - l) / 2;
            if(m % 2 == 1) m--;
            if(nums[m] == nums[m + 1]) l = m + 2;
            else h = m;
        }
        return nums[l];
    }
}
