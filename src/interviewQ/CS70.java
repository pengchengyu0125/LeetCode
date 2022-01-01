package interviewQ;

public class CS70 {
    public static void main(String[] args) {
        int n = 5;
        CS70 cs70 = new CS70();
        System.out.println(cs70.climbStairs(n));
    }
    public int climbStairs(int n) {
        if(n < 4)
            return n;
        else {
            int num[] = new int[n];
            num[0] = 1;
            num[1] = 2;
            num[2] = 3;
            for(int i = 3; i < n; ++i){
                num[i] = num[i - 1] + num[i - 2];
            }
            return num[n - 1];
        }
    }
}
