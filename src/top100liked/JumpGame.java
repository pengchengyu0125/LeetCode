package top100liked;

/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.
 */
public class JumpGame {
    public static void main(String[] args) {
        int nums[] = {0, 2, 3};
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(nums));
    }

    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len < 2)
            return true;
        int max = 0;
        for (int i = 0; i < len - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (max < i + 1) {
                return false;
            }
            if (max >= (len - 1)) {
                return true;
            }
        }
        return false;
    }
}
