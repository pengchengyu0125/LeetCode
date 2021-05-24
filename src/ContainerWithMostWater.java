/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        ContainerWithMostWater container = new ContainerWithMostWater();
        System.out.println(container.maxArea(height));
    }

    public int maxArea(int[] height) {
        int max = 0;
        int low = 0, high = height.length - 1;
        while (low < high) {
            int area = 0;
            if (height[low] <= height[high]) {
                area = height[low] * (high - low);
                ++low;
            } else {
                area = height[high] * (high - low);
                --high;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}
