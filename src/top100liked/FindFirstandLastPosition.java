package top100liked;

/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */
public class FindFirstandLastPosition {
    public static void main(String[] args) {
        int nums[] = {5, 7, 7, 8, 8, 10};
        FindFirstandLastPosition find = new FindFirstandLastPosition();
        System.out.println(find.searchRange(nums, 8)[0]);
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int search[] = {-1, -1};
        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                search[0] = left;
                search[1] = right;
                return search;
            } else if (nums[left] == target && nums[right] != target)
                --right;
            else if (nums[left] != target && nums[right] == target)
                ++left;
            else {
                ++left;
                --right;
            }
        }
        return search;
    }
}
