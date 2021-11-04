package interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TS15 {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        TS15 ts15 = new TS15();
        System.out.println(ts15.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        if (n < 3)
            return lists;
        Arrays.sort(nums);
        if (nums[0] > 0)
            return lists;
        for (int i = 0; i < n - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1, right = n - 1;
            while (left < right) {
                List<Integer> list = new ArrayList<>();
                int temp = 0 - nums[i];
                if (left != i + 1 && nums[left] == nums[left - 1]) {
                    ++left;
                    continue;
                }
                if (nums[left] + nums[right] == temp) {
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);
                    ++left;
                    --right;
                } else if (nums[left] + nums[right] < temp) {
                    ++left;
                } else --right;
            }
        }
        return lists;
    }
}
