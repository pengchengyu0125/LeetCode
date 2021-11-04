package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class GP22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backTrack(n, n, "", list);
        return list;
    }
    void backTrack(int left, int right, String s, List<String> list) {
        if (left < 0 || right < 0|| left > right)
            return;
        if (left == 0 && right == 0) {
            list.add(s);
            return;
        }
        backTrack(left - 1, right, s + '(', list);
        backTrack(left, right - 1, s + ')', list);
    }

    public static void main(String[] args) {
        int n = 3;
        GP22 gp22 = new GP22();
        System.out.println(gp22.generateParenthesis(n).toString());
    }
}
