package interviewQ;

import static java.lang.Math.*;

public class TRW42 {
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;
        if (n < 3)
            return sum;
        else if (n == 3) {
            sum = min(height[0],height[2]) - height[1];
            if (sum > 0)
                return sum;
            else return 0;
        }
        int left = 1;
        int right = n - 2;
        int lmax = height[0];
        int rmax = height[n - 1];
        while(left <= right) {
            lmax = max(height[left], lmax);
            rmax = max(height[right], rmax);
            if (lmax <= rmax) {
                sum += lmax - height[left];
                ++left;
            }
            else {
                sum += rmax - height[right];
                --right;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        TRW42 trw42 = new TRW42();
        System.out.println(trw42.trap(height));
    }
}
