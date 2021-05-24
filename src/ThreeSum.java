import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-2, 0, 0, 2, 2};
        ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(nums).toString());
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                List<Integer> list = new ArrayList<>();
                int temp = 0 - nums[i];
                if (low != i + 1 && nums[low] == nums[low - 1]) {
                    ++low;
                    continue;
                }
                if (nums[low] + nums[high] == temp) {
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    lists.add(list);
                    ++low;
                    --high;
                } else if (nums[low] + nums[high] > temp) {
                    --high;
                } else {
                    ++low;
                }
            }
        }
        return lists;
    }
}
