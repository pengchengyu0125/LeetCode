package interviewQ;

public class S69 {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m > x / m) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        int x = 8;
        S69 s69 = new S69();
        System.out.println(s69.mySqrt(x));
    }
}
