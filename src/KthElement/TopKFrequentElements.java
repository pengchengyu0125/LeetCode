/*
Given a non-empty array of integers, return the k most frequent elements.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
Note:

You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
It's guaranteed that the answer is unique, in other words the set of the top k frequent elements is unique.
You can return the answer in any order.
 */
package KthElement;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements top = new TopKFrequentElements();
        int nums[] = new int[]{1,1,1,2,2,3};
        int k = 2;
        int result[] = top.topKFrequent(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int f[] = new int[k];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < k; i++) {
            int max=0;
            for (int key : map.keySet()) {
                int num;
                num = map.get(key);
                if (num > max){
                    max = num;
                    f[i] = key;
                }
            }
            map.remove(f[i]);
        }
        return f;
    }
}
