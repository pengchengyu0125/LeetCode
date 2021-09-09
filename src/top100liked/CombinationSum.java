package top100liked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */
public class CombinationSum {
    public static void main(String[] args) {
        int candidates[] = {2, 3, 6, 7};
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(candidates, 7).toString());
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSumHelp(candidates, result, list, target, 0);
        return result;
    }

    public boolean combinationSumHelp(int[] candidates, List<List<Integer>> result, List<Integer> list, int target, int start) {
        if (target < 0) {
            return false;
        } else if (target == 0) {
            List<Integer> temp = new ArrayList<Integer>(list);
            result.add(temp);
            return false;
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                boolean flag = combinationSumHelp(candidates, result, list, target - candidates[i], i);
                list.remove(list.size() - 1);
                if (!flag) {
                    break;
                }
            }
        }
        return true;
    }
}
