import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams group = new GroupAnagrams();
        System.out.println(group.groupAnagrams(strs).toString());
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<List<String>>();
        int len = strs.length;
        if (len < 1) return list;
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        String tmp = "";
        for (int i = 0; i < len; i++) {
            tmp = strs[i];
            char[] arrayOfString = tmp.toCharArray();
            Arrays.sort(arrayOfString);
            tmp = new String(arrayOfString);
            if (map.containsKey(tmp)) {
                map.get(tmp).add(strs[i]);
            } else {
                List<String> item = new ArrayList<String>();
                item.add(strs[i]);
                map.put(tmp, item);
            }
        }
        for (List<String> value : map.values()) {
            list.add(value);
        }
        return list;
    }
}
