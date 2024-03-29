package interviewQ;

public class TS1 {
    public static void main(String[] args) {
        int nums[] = {3, 2, 4};
        int target = 6;
        TS1 ts = new TS1();
        System.out.println(ts.twoSum(nums, target).toString());
    }

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
