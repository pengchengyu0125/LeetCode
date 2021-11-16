package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class RDfSA26 {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2};
        RDfSA26 rDfSA26 = new RDfSA26();
        System.out.println(rDfSA26.removeDuplicates(nums));
    }


    public int removeDuplicates(int[] nums) {
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[len])
                continue;
            nums[++len] = nums[i];
        }
        return len + 1;
    }
}

