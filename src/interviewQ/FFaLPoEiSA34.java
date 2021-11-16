package interviewQ;

public class FFaLPoEiSA34 {
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        FFaLPoEiSA34 fFaLPoEiSA34 = new FFaLPoEiSA34();
        System.out.println(fFaLPoEiSA34.searchRange(nums, target).toString());
    }
    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1, -1};
        int n = nums.length;
        if (n < 1)
            return result;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                result[0] = left;
                result[1] = right;
                return result;
            }
            if (nums[left] != target)
                ++left;
            if (nums[right] != target)
                --right;
        }
        return result;
    }
}
