package interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode {
    public static void main(String[] args) {
        int nums[] = {2,10,7,5,4,1,8,6};
        int k = 3;
        leetcode leet = new leetcode();
        System.out.println(leet.getAverages(nums, k));
    }

    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int averages[] = new int[n];
        if (k == 0)
            return nums;
        else if (n < 2 * k + 1) {
            for (int i = 0; i < n; i++) {
                averages[i] = -1;
            }
            return averages;
        }
        else {
            for (int i = 0; i < n; i++) {
                if (i < k || i > n - k -1)
                    averages[i] = -1;
                else {
                    long sum = 0;
                    for (int j = i - k; j < i + k + 1; j++) {
                        sum += nums[j];
                    }
                    averages[i] = (int) (sum / (2 * k + 1));
                }
            }
            return averages;
        }
    }
}
