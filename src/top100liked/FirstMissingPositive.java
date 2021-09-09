package top100liked;

import java.util.Arrays;

/*
Given an unsorted integer array nums, find the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums[] = {3,4,-1,1};
        FirstMissingPositive first = new FirstMissingPositive();
        System.out.println(first.firstMissingPositive(nums));
    }
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                if (i == nums.length - 1)
                    return ++min;
                if (nums[i + 1] > min + 1)
                    return ++min;
                else if (nums[i + 1] == min + 1)
                    ++min;
            }
        }
        return min;
    }
}
