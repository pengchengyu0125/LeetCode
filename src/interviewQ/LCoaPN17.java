package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class LCoaPN17 {
    public static void main(String[] args) {
        String digits = "23";
        LCoaPN17 lCoaPN17 = new LCoaPN17();
        System.out.println(lCoaPN17.letterCombinations(digits).toString());
    }
    public List<String> letterCombinations(String digits) {
        String[] buttons = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        // 第一个数字所在的按钮上对应的字母
        String firstLetters = buttons[digits.charAt(0) - '2'];

        // 如果长度为1，则将该按钮上的字母分别返回即可
        if (digits.length() == 1) {
            for (int i = 0; i < firstLetters.length(); i++) {
                result.add(String.valueOf(firstLetters.charAt(i)));
            }
            return result;
        }

        // 如果长度大于1，则递归求解
        List<String> combinations = letterCombinations(digits.substring(1));
        for (int i = 0; i < firstLetters.length(); i++) {
            String letter = firstLetters.substring(i, i + 1);
            for (String combination : combinations) {
                result.add(letter + combination);
            }
        }
        return result;
    }
}
