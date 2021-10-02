package interviewQ;

public class LCP14 {
    public static void main(String[] args) {
        String strs[] = {"c","acc","ccc"};
        LCP14 lcp14 = new LCP14();
        System.out.println(lcp14.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() == 0)
                return "";
            while (strs[i].indexOf(temp) != 0) {
                temp = temp.substring(0, temp.length() - 1);
                if (temp.length() == 0)
                    return "";
            }
        }
        return temp;
    }
}
