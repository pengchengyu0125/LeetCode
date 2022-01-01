package interviewQ;

import static java.lang.Math.pow;

public class PO66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (digits[i] != 9)
                flag = false;
        }
        if (flag) {
            int num[] = new int[n + 1];
            num[0] = 1;
            for (int i = 1; i < n + 1; i++) {
                num[i] = 0;
            }
            return num;
        }
        else {
            ++digits[n - 1];
            for (int i = n - 1; i > 0; --i) {
                if (digits[i] == 10) {
                    digits[i] = 0;
                    ++digits[i - 1];
                }
            }
            return digits;
        }
    }

    public static void main(String[] args) {
        int digits[] = {1, 2, 3};
        PO66 po66 = new PO66();
        System.out.println(po66.plusOne(digits).toString());
    }
}
