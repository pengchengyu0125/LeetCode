package interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MI56 {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if (n == 1)
            return intervals;
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        int min = intervals[0][0];
        int max = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= max) {
                max = intervals[i][1] > max ? intervals[i][1] : max;
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(min);
                list.add(max);
                lists.add(list);
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        lists.add(list);
        int merge[][] = new int[lists.size()][2];
        for (int i = 0; i < lists.size(); i++) {
            merge[i][0] = lists.get(i).get(0);
            merge[i][1] = lists.get(i).get(1);
        }
        return merge;
    }

    public static void main(String[] args) {
        int intervals[][] = {{1, 3}, {2, 6}, {1, 18}, {15, 18}};
        MI56 mi56 = new MI56();
        System.out.println(mi56.merge(intervals).toString());
    }
}
