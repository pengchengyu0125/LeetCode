/*
A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.



Example 1:

Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.


Note:

S will have length in range [1, 500].
S will consist of lowercase English letters ('a' to 'z') only.
 */
package greedy;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        String S="ababcbacadefegdehijhklij";
        List<Integer> list=new ArrayList<>();
        PartitionLabels p=new PartitionLabels();
        list=p.partitionLabels(S);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public List<Integer> partitionLabels(String S) {
        char[] c=S.toCharArray();
        List<Integer> list=new ArrayList<>();
        int l=c.length;
        int start=0,end=0,num=0;
        for (int i = 0; i <l+1 ; ++i) {
            if (num>end){
                list.add(end-start+1);
                start=end+1;
                ++end;
                --i;
                continue;
            }
            for (int j = i+1; j < l; ++j) {
                if (c[i]==c[j]&&j>end){
                    end=j;
                }
            }
            ++num;
        }
        return list;
    }
}
