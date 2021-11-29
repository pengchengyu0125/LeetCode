package interviewQ;

import java.util.Arrays;

public class FMP41 {

    public static void main(String[] args) {
        int nums[] = {3,4,-1,1};
        FMP41 fmp41 = new FMP41();
        System.out.println(fmp41.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        int num = 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i])
                ++num;
            else if (num < nums[i])
                return num;
        }
        return num;
    }
}
