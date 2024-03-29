package interviewQ;

public class LPS5 {
    public static void main(String[] args) {
        String s = "babad";
        LPS5 lps5 = new LPS5();
        System.out.println(lps5.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            // 以s[i]为中心
            int len1 = expandAroundCenter(s, i, i);
            // 以s[i]和s[i+1]为中心
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > right - left + 1) {
                left = i - (len - 1) / 2;
                right = i + len / 2;
            }
        }
        return s.substring(left, right + 1);
    }

    private int expandAroundCenter(String s, int center1, int center2) {
        int left = center1;
        int right = center2;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
