package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class P46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        find(lists, new ArrayList<>(), nums, new boolean[nums.length]);
        return lists;
    }

    public void find(List<List<Integer>> lists, List<Integer> list, int[] nums, boolean[] visit) {
        if (list.size() == nums.length) {
            lists.add(new ArrayList<>(list));
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if (visit[i])
                    continue;
                list.add(nums[i]);
                visit[i] = true;
                find(lists, list, nums, visit);
                list.remove(list.size() - 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        P46 p46 = new P46();
        System.out.println(p46.permute(nums));
    }
}
