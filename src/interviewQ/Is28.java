package interviewQ;

public class Is28 {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        Is28 is28 = new Is28();
        System.out.println(is28.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int p1 = 0;
        int n = haystack.length();
        int m = needle.length();
        if (m == 0 || haystack.equals(needle))
            return 0;
        if (n == 0)
            return -1;
        for (int i = 0; i < n - m + 1; i++) {
            p1 = i;
            int p2 = 0;
            while (p1 < n ) {
                if (haystack.charAt(p1) == needle.charAt(p2)) {
                    ++p2;
                } else break;
                if (p2 == m)
                    return p1 - m + 1;
                ++p1;
            }
        }
        return -1;
    }
}
