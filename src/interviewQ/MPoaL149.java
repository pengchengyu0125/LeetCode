package interviewQ;

import java.util.HashMap;
import java.util.Map;

public class MPoaL149 {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n == 1)
            return 1;
        int nums = 1;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            Map<Float, Integer> k = new HashMap<>();
            Float slope = null;
            for (int j = 0; j < n; j++) {
                float a = points[j][0] - points[i][0];
                float b = points[j][1] - points[i][1];
                if (a == 0 && b == 0)
                    continue;
                if (a == 0) {
                    if (k.containsKey(null)) {
                        k.put(null, k.get(null) + 1);
                    } else {
                        k.put(null, 1);
                    }
                } else {
                    slope = b / a + 0;
                    if (k.containsKey(slope)) {
                        k.put(slope, k.get(slope) + 1);
                    } else {
                        k.put(slope, 1);
                    }
                }
            }
            for (Map.Entry<Float, Integer> entry : k.entrySet()) {
                if (entry.getValue() > nums) {
                    nums = entry.getValue();
                    slope = entry.getKey();
                }
            }
            for (int j = 0; j < n; j++) {
                if (visited[j]) {
                    continue;
                }
                float a = points[j][0] - points[i][0];
                float b = points[j][1] - points[i][1];
                if (slope == null) {
                    if (a == 0) {
                        visited[j] = true;
                    }
                } else if (a != 0 && b / a == slope) {
                    visited[j] = true;
                }
            }
        }
        return nums + 1;
    }

    public static void main(String[] args) {
        int[][] points = {{7,3},{19,19},{-16,3},{13,17},{-18,1},{-18,-17},{13,-3},{3,7},{-11,12},{7,19},{19,-12},{20,-18},{-16,-15},{-10,-15},{-16,-18},{-14,-1},{18,10},{-13,8},{7,-5},{-4,-9},{-11,2},{-9,-9},{-5,-16},{10,14},{-3,4},{1,-20},{2,16},{0,14},{-14,5},{15,-11},{3,11},{11,-10},{-1,-7},{16,7},{1,-11},{-8,-3},{1,-6},{19,7},{3,6},{-1,-2},{7,-3},{-6,-8},{7,1},{-15,12},{-17,9},{19,-9},{1,0},{9,-10},{6,20},{-12,-4},{-16,-17},{14,3},{0,-1},{-18,9},{-15,15},{-3,-15},{-5,20},{15,-14},{9,-17},{10,-14},{-7,-11},{14,9},{1,-1},{15,12},{-5,-1},{-17,-5},{15,-2},{-12,11},{19,-18},{8,7},{-5,-3},{-17,-1},{-18,13},{15,-3},{4,18},{-14,-15},{15,8},{-18,-12},{-15,19},{-9,16},{-9,14},{-12,-14},{-2,-20},{-3,-13},{10,-7},{-2,-10},{9,10},{-1,7},{-17,-6},{-15,20},{5,-17},{6,-6},{-11,-8}};
        MPoaL149 mPoaL149 = new MPoaL149();
        System.out.println(mPoaL149.maxPoints(points));
    }
}
