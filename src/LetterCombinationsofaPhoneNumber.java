import java.util.ArrayList;
import java.util.List;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 */
public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        String digits = "234";
        LetterCombinationsofaPhoneNumber l = new LetterCombinationsofaPhoneNumber();
        System.out.println(l.letterCombinations(digits).toString());
    }

    public List<String> letterCombinations(String digits) {
        List<String> letter = new ArrayList<>();
        if (digits.length() == 0) {
            return letter;
        } else {
            String[] str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            String[] strings = new String[digits.length()];
            for (int i = 0; i < digits.length(); i++) {
                strings[i] = str[Integer.parseInt(String.valueOf(digits.charAt(i))) - 2];
            }
            String s = "";
            group(strings, 0, s, letter);
            return letter;
        }
    }

    private static void group(String[] arr, int startStr, String str, List<String> strings) {
        char[] chars1 = arr[startStr].toCharArray();
        for (int j = 0; j < chars1.length; j++) {
            if (startStr == arr.length - 1) {
                strings.add(str + chars1[j]);
            } else {
                //startStr+1:遍历下一个字符组合;str + chars1[j]:拼接当前遍历的字符
                group(arr, startStr+1, str + chars1[j],strings);
            }
        }
    }
}
