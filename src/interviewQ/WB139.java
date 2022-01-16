package interviewQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WB139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> words = new HashSet<>();
        for(String w : wordDict) {
            words.add(w);
        }
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        for(int i = 1; i <= s.length(); i++) {
            for(int j = i; j >= 0; j--) {
                if (res[j] && words.contains(s.substring(j, i))) {
                    res[i] = true;
                    break;
                }
            }
        }
        return res[s.length()];
    }

    public static void main(String[] args) {
        String s = "aaaaaaa";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("aaaa");
        wordDict.add("aaa");
        WB139 wb139 = new WB139();
        System.out.println(wb139.wordBreak(s, wordDict));
    }
}
