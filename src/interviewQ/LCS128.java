package interviewQ;

import java.util.Arrays;

public class LCS128 {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int length = 1;
        int longest = 1;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i])
                continue;
            if (nums[i - 1] + 1 == nums[i]) {
                length++;
                longest = Math.max(length, longest);
            }
            else length = 1;
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LCS128 lcs128 = new LCS128();
        System.out.println(lcs128.longestConsecutive(nums));
    }
}
