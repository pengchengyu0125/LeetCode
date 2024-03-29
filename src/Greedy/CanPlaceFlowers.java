/*
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: True
Example 2:
Input: flowerbed = [1,0,0,0,1], n = 2
Output: False
Note:
The input array won't violate no-adjacent-flowers rule.
The input array size is in the range of [1, 20000].
n is a non-negative integer which won't exceed the input array size.
 */
package Greedy;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int flowerbed[];
        int n = 2;
        flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
        CanPlaceFlowers c = new CanPlaceFlowers();
        System.out.println(c.canPlaceFlowers(flowerbed, n));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed[0] == 0 && flowerbed.length == 1) {
            if (n > 1)
                return false;
            else
                return true;
        } else if (flowerbed[0] == 1 && flowerbed.length == 1) {
            if (n > 0)
                return false;
            else
                return true;
        }
        for (int i = 0; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0 && flowerbed[i + 1] != 1) {
                n--;
                flowerbed[i] = 1;
            } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 1)
                i++;
            i++;
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] != 1)
            n--;
        if (n < 1)
            return true;
        else
            return false;
    }
}
