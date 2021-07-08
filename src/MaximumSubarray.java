/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maxarray = new MaximumSubarray();
        System.out.println(maxarray.maxSubArray(nums));
    }
    public int maxSubArray(int[] nums) {
        if (nums.length < 2)
            return nums[0];
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            max = Math.max(sum, max);
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}
