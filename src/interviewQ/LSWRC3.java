package interviewQ;

import java.util.HashMap;

public class LSWRC3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        LSWRC3 lswrc3 = new LSWRC3();
        System.out.println(lswrc3.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (s == null || length == 0)
            return 0;
        int max = 1;
        for (int i = 0; i < length - 1; i++) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            char c = s.charAt(i);
            hashMap.put(c, 1);
            for (int j = i + 1; j < length; j++) {
                c = s.charAt(j);
                if (hashMap.containsKey(c))
                    break;
                else {
                    hashMap.put(c, 1);
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}
