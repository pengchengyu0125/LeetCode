/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
Note:
The vowels does not include the letter "y".
 */
package TwoPointers;

public class ReverseVowelsofaString {
    public static void main(String[] args) {
        String s = "hello";
        ReverseVowelsofaString r = new ReverseVowelsofaString();
        System.out.println(r.reverseVowels(s));
    }

    public String reverseVowels(String s) {
        char temp;
        char[] s1;
        s1 = s.toCharArray();
        int i = 0, j = s1.length - 1;
        while (i < j) {
            if (s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u' || s1[i] == 'A' || s1[i] == 'E' || s1[i] == 'I' || s1[i] == 'O' || s1[i] == 'U') {
                if (s1[j] == 'a' || s1[j] == 'e' || s1[j] == 'i' || s1[j] == 'o' || s1[j] == 'u' || s1[j] == 'A' || s1[j] == 'E' || s1[j] == 'I' || s1[j] == 'O' || s1[j] == 'U') {
                    temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                    ++i;
                    --j;
                } else --j;
            } else ++i;
        }
        s = new String(s1);
        return s;
    }
}
