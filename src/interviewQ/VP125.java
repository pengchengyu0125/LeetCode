package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class VP125 {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n == 1) {
            return true;
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                list.add((char) (s.charAt(i) + 32));
            }
            else if ((s.charAt(i) > 96 && s.charAt(i) < 123) || (s.charAt(i) > 47 && s.charAt(i) < 58)) {
                list.add(s.charAt(i));
            }
        }
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            if (list.get(left) != list.get(right))
                return false;
            ++left;
            --right;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        VP125 vp125 = new VP125();
        System.out.println(vp125.isPalindrome(s));
    }
}
