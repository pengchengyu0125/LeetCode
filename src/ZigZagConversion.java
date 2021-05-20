/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        System.out.println(zigZagConversion.convert(s, numRows));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        int len = s.length();
        if (len <= numRows)
            return s;
        StringBuffer res = new StringBuffer();
        int size = 2 * numRows - 2;//每次处理的长度
        for (int i = 0; i < numRows; i++) {//每一行的元素
            char ch;
            for (int j = i; j < len; j += size) {
                ch = s.charAt(j);
                res.append(ch);
                if (i != 0 && i != numRows - 1) {//如果是中间元素单独处理
                    int tmp = j + size - 2 * i;
                    if (tmp < len) {
                        ch = s.charAt(tmp);
                        res.append(ch);
                    }
                }
            }
        }
        return res.toString();
    }
}
