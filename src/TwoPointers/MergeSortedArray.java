/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]


Constraints:

-10^9 <= nums1[i], nums2[i] <= 10^9
nums1.length == m + n
nums2.length == n
 */
package TwoPointers;

public class MergeSortedArray {
    public static void main(String[] args) {
        int nums1[], nums2[];
        nums1 = new int[]{1, 2, 3};
        nums2 = new int[]{2, 5, 6};
        int m = 3, n = 3;
        MergeSortedArray merge = new MergeSortedArray();
        merge.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total[] = new int[m + n];
        int num = 0, i = 0, j = 0;
        while (num < m + n) {
            if (i > m - 1) {
                total[num] = nums2[j];
            } else if (j > n - 1) {
                total[num] = nums1[i];
            } else if (nums1[i] <= nums2[j]) {
                total[num] = nums1[i];
                ++i;
            } else {
                total[num] = nums2[j];
                ++j;
            }
            num++;
        }
    }
}
