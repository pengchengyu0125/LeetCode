package interviewQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SN136 {
    public int singleNumber(int[] nums) {
        int n= nums.length;
        //we simply when elements are two times put their values as 2 times
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hash.containsKey(nums[i]))
                hash.put(nums[i] , hash.get(nums[i])+1);
            else
                hash.put(nums[i] , 1);
        }

        //here we cheack which elements has value 1 and we just return it
        for(Map.Entry<Integer,Integer> entery : hash.entrySet())
        {
            if(entery.getValue()==1)
            {
                return entery.getKey();
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        SN136 sn136 = new SN136();
        System.out.println(sn136.singleNumber(nums));
    }
}
