package interviewQ;

import java.util.HashMap;

public class MWS76 {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || s.length() < t.length()) return "";

        String res = "";
        int minLength = Integer.MAX_VALUE;

        int[] chars = new int[256];
        for (char c : t.toCharArray()) {
            chars[c] ++;
        }
        int need = t.length();
        int validRead = 0;
        int right = 0;
        for (int left = 0; left < s.length(); left ++) {
            while (right < s.length() && validRead < need) {
                if (--chars[s.charAt(right++)] >= 0) {
                    validRead ++;
                }
            }

            if (validRead >= need && right - left < minLength) {
                minLength = right - left;
                res = s.substring(left, right);
            }

            if (++chars[s.charAt(left)] > 0) validRead --;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABBC";
        MWS76 mws76 = new MWS76();
        System.out.println(mws76.minWindow(s, t));
    }
}
