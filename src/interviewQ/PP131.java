package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class PP131 {
    public List<List<String>> partition(String s) {
        List<List<String>> lists = new ArrayList<>();
        help(s, lists, new ArrayList<String>());
        return lists;
    }

    private void help(String s, List<List<String>> lists, ArrayList<String> strings) {
        if (s.length() == 0) {
            lists.add(new ArrayList<>(strings));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(0, i + 1))) {
                strings.add(s.substring(0, i + 1));
                help(s.substring(i + 1), lists, strings);
                strings.remove(strings.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String substring) {
        int left = 0;
        int right = substring.length() - 1;
        while (left <= right) {
            if (substring.charAt(left) != substring.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        PP131 pp131 = new PP131();
        System.out.println(pp131.partition(s).toString());
    }
}
