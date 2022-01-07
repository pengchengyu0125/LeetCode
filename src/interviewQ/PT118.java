package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class PT118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 0) {
                list.add(1);
            } else if (i == 1) {
                list.add(1);
                list.add(1);
            } else {
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        list.add(1);
                    } else if (j == i) {
                        list.add(1);
                    } else {
                        list.add(lists.get(i - 1).get(j - 1) + lists.get(i - 1).get(j));
                    }
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args) {
        int numRows = 5;
        PT118 pt118 = new PT118();
        System.out.println(pt118.generate(numRows).toString());
    }
}
