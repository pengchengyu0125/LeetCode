package interviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GA49 {
    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GA49 ga49 = new GA49();
        System.out.println(ga49.groupAnagrams(strs).toString());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0)
                continue;
            for (int j = i + 1; j < strs.length; j++) {
                for (int k = 0; k < strs[j].length(); k++) {
                    
                }
            }
        }
        return null;
    }
}
