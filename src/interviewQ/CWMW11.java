package interviewQ;

public class CWMW11 {
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        CWMW11 cwmw11 = new CWMW11();
        System.out.println(cwmw11.maxArea(height));
    }

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;
        while (left < right) {
            area = Math.max(area, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right])
                ++left;
            else --right;
        }
        return area;
    }
}
