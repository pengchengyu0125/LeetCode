package interviewQ;

public class P50 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        P50 p50 = new P50();
        System.out.println(p50.myPow(x,n));
    }
    public double myPow(double x, int n) {
        if(n==0)
            return 1.0;
        if(n==1)
            return x;
        if(n==-1)
            return 1/x;

        double halfNpow = myPow(x,n/2);
        if(n%2 == 0){
            return halfNpow * halfNpow;
        }
        else{
            if(n>0)
                return halfNpow* halfNpow * x;
            else
                return halfNpow* halfNpow / x;
        }
    }
}
