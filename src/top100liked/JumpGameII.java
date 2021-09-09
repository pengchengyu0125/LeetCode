package top100liked;

/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

You can assume that you can always reach the last index.
 */
public class JumpGameII {
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        JumpGameII jump = new JumpGameII();
        System.out.println(jump.jump(nums));
    }
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;

        int step = 1;
        int maxReach = nums[0];
        int curMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (curMax < i) {
                ++step;
                curMax = maxReach;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return step;
    }
}
