package interviewQ;

import static java.lang.Math.abs;

public class DTI29 {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        DTI29 dti29 = new DTI29();
        System.out.println(dti29.divide(dividend, divisor));
    }

    public int divide(int dividend, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        if(dividend==0) return 0;
        long tempdividend=dividend;
        long tempdivisor=divisor;
        tempdividend=Math.abs(tempdividend);
        tempdivisor=Math.abs(tempdivisor);
        if(tempdividend<tempdivisor) return 0;
        long tempres=0;
        long sum;
        long count;
        while(tempdividend>=tempdivisor) {
            count=1;
            sum=tempdivisor;
            while(sum+sum<=tempdividend) {
                sum=sum+sum;
                count=count+count;
            }
            tempdividend=tempdividend-sum;
            tempres=tempres+count;
        }
        //System.out.println(tempres);


        if((dividend>0) ^ (divisor>0)) tempres=-tempres;
        if(tempres>Integer.MAX_VALUE || tempres<Integer.MIN_VALUE) return Integer.MAX_VALUE;
        else return (int)tempres;
    }
}
