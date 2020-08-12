/*
You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.

Given n, find the total number of full staircase rows that can be formed.

n is a non-negative integer and fits within the range of a 32-bit signed integer.

Example 1:

n = 5

The coins can form the following rows:
¤
¤ ¤
¤ ¤

Because the 3rd row is incomplete, we return 2.
Example 2:

n = 8

The coins can form the following rows:
¤
¤ ¤
¤ ¤ ¤
¤ ¤

Because the 4th row is incomplete, we return 3.
 */
public class ArrangingCoins {
    public static void main(String[] args) {
        int n=5,a=0;
        ArrangingCoins arrangingCoins=new ArrangingCoins();
        a=arrangingCoins.result(n);
        System.out.println(a);
    }
    public int result(int n) {
        int l=0,r=n,mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            long x=mid*(mid+1)/2;
            if (x==n)
                return mid;
            else if (x>n)
                r=mid-1;
            else
                l=mid+1;
        }
        return r;
    }
}
