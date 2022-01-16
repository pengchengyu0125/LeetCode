package interviewQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WBII140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> wordSet = new HashSet<>();
        for (String word : wordDict) {
            wordSet.add(word);
        }
        List<String> res = new ArrayList<>();
        helper(s, wordSet, 0, new ArrayList<String>(), res);
        return res;
    }

    private void helper(String s, HashSet<String> wordSet, int index, List<String> strings, List<String> res) {
        int n = s.length();
        if (index == n) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < strings.size(); j++) {
                if (j == 0) {
                    temp.append(strings.get(j));
                } else {
                    temp.append(" ");
                    temp.append(strings.get(j));
                }
            }
            res.add(temp.toString());
            return;
        }
        for (int i = index; i < n; i++) {
            if (wordSet.contains(s.substring(index, i + 1))) {
                strings.add(s.substring(index, i + 1));
                helper(s, wordSet, i + 1, strings, res);
                strings.remove(strings.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        WBII140 wbii140 = new WBII140();
        System.out.println(wbii140.wordBreak(s, wordDict));
    }
}
