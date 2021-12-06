package interviewQ;

public class JG55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (max >= n - 1)
                return true;
            if (i <= max) {
                max = Math.max(max, i + nums[i]);
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 1, 0, 4};
        JG55 jg55 = new JG55();
        System.out.println(jg55.canJump(nums));
    }
}
