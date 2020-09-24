/*
Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:
Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]

Output:
"apple"
Example 2:
Input:
s = "abpcplea", d = ["a","b","c"]

Output:
"a"
Note:
All the strings in the input will only contain lower-case letters.
The size of the dictionary won't exceed 1,000.
The length of all the strings in the input won't exceed 1,000.
 */
package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class LongestWordinDictionarythroughDeleting {
    public static void main(String[] args) {
        String s="abpcplea";
        List<String> d=new ArrayList<>();
        d.add("ale");
        d.add("apple");
        d.add("monkey");
        d.add("plea");
        LongestWordinDictionarythroughDeleting l=new LongestWordinDictionarythroughDeleting();
        System.out.println(l.findLongestWord(s,d));
    }
    public String findLongestWord(String s, List<String> d) {
        String ret = "";
        for (String str : d) {
            for (int i = 0, j = 0; i < s.length() && j < str.length(); i++) {
                if (s.charAt(i) == str.charAt(j)) j++;
                if (j == str.length()) {
                    if (ret.length() < str.length() || (ret.length() == str.length() && ret.compareTo(str) > 0)) {
                        ret = str;
                    }
                }
            }
        }
        return ret;
    }
}
