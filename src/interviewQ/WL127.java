package interviewQ;

import java.util.*;

public class WL127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord))
            return 0;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(wordList);
        hashSet.remove(beginWord);
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(beginWord);
        HashSet<String> visited = new HashSet<>();
        visited.add(beginWord);
        int num = 1;
        while (!arrayDeque.isEmpty()) {
            int size = arrayDeque.size();
            for (int i = 0; i < size; i++) {
                String temp = arrayDeque.removeFirst();
                char[] chars = temp.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    char ch = chars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == ch)
                            continue;
                        chars[j] = c;
                        String str = String.valueOf(chars);
                        if (str.equals(endWord)) {
                            visited.add(str);
                            return num + 1;
                        }
                        if (!visited.contains(str) && hashSet.contains(str)) {
                            arrayDeque.addLast(str);
                            visited.add(str);
                        }
                    }
                    chars[j] = ch;
                }
            }
            num++;
        }
        return visited.contains(endWord) ? num : 0;
    }

    public static void main(String[] args) {
        String beginWord = "hot", endWord = "dog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dog");
        WL127 wl127 = new WL127();
        System.out.println(wl127.ladderLength(beginWord, endWord, wordList));
    }
}
