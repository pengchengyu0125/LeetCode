package interviewQ;

/*
I can be placed before V (5) and X (10) to make 4 and 9.
 */
public class RtI13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        RtI13 rtI13 = new RtI13();
        System.out.println(rtI13.romanToInt(s));
    }

    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == 'M')
                sum += 1000;
            else if (s.charAt(i) == 'D')
                sum += 500;
            else if (s.charAt(i) == 'C') {
                if (i != n - 1 && s.charAt(i + 1) == 'D') {
                    sum += 400;
                    ++i;
                } else if (i != n - 1 && s.charAt(i + 1) == 'M') {
                    sum += 900;
                    ++i;
                } else
                    sum += 100;
            } else if (s.charAt(i) == 'L')
                sum += 50;
            else if (s.charAt(i) == 'X') {
                if (i != n - 1 && s.charAt(i + 1) == 'L') {
                    sum += 40;
                    ++i;
                } else if (i != n - 1 && s.charAt(i + 1) == 'C') {
                    sum += 90;
                    ++i;
                } else
                    sum += 10;
            }
            else if (s.charAt(i) == 'V')
                sum += 5;
            else if (s.charAt(i) == 'I') {
                if (i != n - 1 && s.charAt(i + 1) == 'V') {
                    sum += 4;
                    ++i;
                } else if (i != n - 1 && s.charAt(i + 1) == 'X') {
                    sum += 9;
                    ++i;
                } else
                    sum += 1;
            }
        }
        return sum;
    }
}
