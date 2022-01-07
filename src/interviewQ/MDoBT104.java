package interviewQ;

public class MDoBT104 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int max = 1;
        int cur = 1;
        return maxDepth(root, cur, max);
    }

    public int maxDepth(TreeNode root, int cur, int max) {
        if (root == null) {
            return Math.max(max, cur - 1);
        }
        max = maxDepth(root.left, cur + 1, max);
        max = maxDepth(root.right, cur + 1, max);
        return max;
    }

    public static void main(String[] args) {
        TreeNode r = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, r);
        MDoBT104 mDoBT104 = new MDoBT104();
        System.out.println(mDoBT104.maxDepth(root));
    }
}
