import java.util.ArrayList;
import java.util.Collection;
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
        int[] nums1,nums2;
        nums1=new int[]{1,3};
        nums2=new int[]{2,4};
        MedianofTwoSortedArrays medianofTwoSortedArrays=new MedianofTwoSortedArrays();
        System.out.println(medianofTwoSortedArrays.findMedianSortedArrays(nums1,nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums=new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            nums.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            nums.add(nums2[i]);
        }
        Collections.sort(nums);
        int a=nums.size()%2;
        if (a==0){
            int i=nums.size()/2;
            double x,y;
            x=nums.get(i);
            y=nums.get(i-1);
            return (x+y)/2;
        }
        int i=nums.size()/2;
        return nums.get(i);
    }
}
