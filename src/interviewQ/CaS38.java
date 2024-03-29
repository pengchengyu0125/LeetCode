package interviewQ;

import java.util.HashMap;
import java.util.Map;

public class CaS38 {
    public static void main(String[] args) {
        int n = 4;
        CaS38 caS38 = new CaS38();
        System.out.println(caS38.countAndSay(n));
    }
    public String countAndSay(int n) {
        int i = 1;
        if (n <= 0)
            return null;
        String s = "1";
        while (i <= n - 1) {
            s = countAndSay(s);
            i++;
        }
        return s;
    }

    public String countAndSay(String s) {
        int count = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i))
                count++;
            else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        sb.append(count).append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
