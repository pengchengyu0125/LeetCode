import java.util.HashMap;

/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s="abcdbcaaabb";
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters=new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        int num=0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0, j = 0; i <s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))){
                j=Math.max(hashMap.get(s.charAt(i)),j);
            }
            hashMap.put(s.charAt(i),i+1);
            num=Math.max(num,i-j+1);
        }
        return num;
    }
}
