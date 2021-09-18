package interviewQ;

import java.util.Arrays;

public class MoTSA4 {
    public static void main(String[] args) {
        int nums1[] = {1, 3}, nums2[] = {2};
        MoTSA4 moTSA4 = new MoTSA4();
        System.out.println(moTSA4.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        if (m == 0 && n == 0)
            return 0;
        else if (m == 0 && n != 0) {
            if (n % 2 == 0)
                return (double) (nums2[n / 2 - 1] + nums2[n / 2]) / 2;
            else return nums2[n / 2];
        }
        else if (m != 0 && n == 0) {
            if (m % 2 == 0)
                return (double) (nums1[m / 2 - 1] + nums1[m / 2]) / 2;
            else return nums1[m / 2];
        }
        int length = m + n;
        int nums[] = new int[length];
        for (int i = 0; i < m; ++i) {
            nums[i] = nums1[i];
        }
        for (int i = m, j = 0; i < length; ++i, ++j) {
            nums[i] = nums2[j];
        }
        Arrays.sort(nums);
        if (length % 2 == 0)
            return (double) (nums[length / 2 - 1] + nums[length / 2]) / 2;
        else return nums[length / 2];
    }
}
