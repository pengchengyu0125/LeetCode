package interviewQ;

public class MS53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int max = nums[0];
        int dp[] = new int[n];
        dp[0] = max;
        for (int i = 1; i < n; i++) {
            int sum = max + nums[i];
            max = Math.max(sum, nums[i]);
            dp[i] = max;
        }
        max = dp[0];
        for (int i = 1; i < n; i++) {
            if (dp[i] > max)
                max = dp[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = {-2,-1};
        MS53 ms53 = new MS53();
        System.out.println(ms53.maxSubArray(nums));
    }
}
