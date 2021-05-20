package BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1, nums2;
        nums1 = new int[]{4, 5, 6, 8, 9};
        nums2 = new int[]{};
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        System.out.println(medianofTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] num = new int[l1 + l2];
        int count = 0;
        if (l1 == 0 && l2 > 1) {
            if (l2 % 2 == 0) {
                return (double) (nums2[l2 / 2] + nums2[l2 / 2 - 1]) / 2;
            } else
                return nums2[l2 / 2];
        } else if (l1 == 0 && l2 < 2) {
            return nums2[0];
        } else if (l2 == 0 && l1 > 1) {
            if (l1 % 2 == 0) {
                return (double) (nums1[l1 / 2] + nums1[l1 / 2 - 1]) / 2;
            } else
                return nums1[l1 / 2];
        } else if (l2 == 0 && l1 < 2) {
            return nums1[0];
        } else {
            int i = 0, j = 0;
            while (i < l1 || j < l2) {
                if (i > l1 - 1) {
                    num[count] = nums2[j];
                    ++j;
                    ++count;
                } else if (j > l2 - 1) {
                    num[count] = nums1[i];
                    ++i;
                    ++count;
                } else {
                    if (nums1[i] <= nums2[j]) {
                        num[count] = nums1[i];
                        ++i;
                        ++count;
                    } else {
                        num[count] = nums2[j];
                        ++j;
                        ++count;
                    }
                }

            }
        }
        if (count % 2 == 0) {
            return (double) (num[count / 2] + num[count / 2 - 1]) / 2;
        } else return num[count / 2];
    }
}