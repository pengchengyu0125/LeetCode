package interviewQ;

public class UP62 {
    int count = 0;
    public int uniquePaths(int m, int n) {
        int i = 0;
        int j = 0;
        search(i, j, m - 1, n - 1);
        return count;
    }

    public void search(int i, int j, int m, int n) {
        if (i >= m + 1 || j >= n + 1) return ;
        if (i == m && j == n) {
            count++;
            return ;
        }
        search(i, j + 1, m, n);
        search(i + 1, j, m, n);
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        UP62 up62 = new UP62();
        System.out.println(up62.uniquePaths(m, n));
    }
}
