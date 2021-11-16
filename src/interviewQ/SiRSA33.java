package interviewQ;

public class SiRSA33 {
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4, 5, 6}, target = 6;
        SiRSA33 siRSA33 = new SiRSA33();
        System.out.println(siRSA33.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 0)//长度为0，直接返回 -1
        {
            return -1;
        }
        while (left <= right)//循环二分查找
        {
            int mid = left + (right - left) / 2;//取初次中间数值
            if (nums[mid] == target)//等于中间数值，立即返回当前值
            {
                return mid;
            }

            if (nums[left] < nums[mid])//中间值 大于 最左端（初次）
            {
                if (target > nums[mid] || target < nums[left])
                //目标值大于初次中间值或者目标值小于初次最左端数值，表明目标值在右侧
                {
                    left = mid + 1;//左侧哨兵移动至mid右侧第一位
                } else {
                    right = mid - 1;//反之亦然
                }
            } else if (nums[left] > nums[mid]) //中间值 小于 最左端（初次）
            {
                if (target < nums[mid] || target > nums[right])
                //目标值小于初次中间值或者目标值大于初次最右端数值，表面目标值在左侧
                {
                    right = mid - 1;//右侧哨兵移动至mid左侧第一位
                } else {
                    left = mid + 1;//反之亦然
                }
            } else // 中间值 等于 最左端（初次）
            {
                left += 1;
            }
            //如此循环找到target下标位置
        }
        return -1;//未找到返回-1
    }
}
