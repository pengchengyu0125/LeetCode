package interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S78 {
    private ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();

    private void process(ArrayList<Integer> list, int[] nums, int initPos, int n){
        if(n==0){
            ans.add(list);
            return;
        }

        if(initPos==nums.length){
            return;
        }

        for(int i=initPos; i<nums.length; i++){
            ArrayList<Integer> tList= new ArrayList(list);
            tList.add(new Integer(nums[i]));
            process(tList, nums, i+1, n-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        for(int i=0; i<=nums.length; i++){
            ArrayList<Integer> list=new ArrayList<Integer>();
            process(list, nums, 0, i);
        }

        return (List)ans;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        S78 s78 = new S78();
        System.out.println(s78.subsets(nums).toString());
    }
}
