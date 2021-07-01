import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 */
public class Permutations {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        Permutations permutations = new Permutations();
        System.out.println(permutations.permute(nums).toString());
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length == 1){                                //当数据中只有一个元素时，只需要一种情况
            List<Integer>lst = new ArrayList<>();
            lst.add(nums[0]);
            list.add(lst);
        }
        else{
            for(int i = 0 ; i < nums.length ; i++){
                int[] num1 = new int[nums.length-1];
                int j = 0;
                int k = 0;
                while(j < nums.length){                 //while语句是用来得到当前数组的子数组
                    if(j != i){
                        num1[k++] = nums[j++];
                    }
                    else
                        j++;
                }

                List<List<Integer>> list1 = permute(num1);
                Iterator<List<Integer>> it = list1.iterator();
                while(it.hasNext()){                       //取出子数组得到集合中与当前元素进行组成
                    List<Integer>lst = new ArrayList<>();
                    lst.add(nums[i]);
                    lst.addAll( it.next());
                    list.add(lst);
                }
            }
        }
        return list;
    }
}
