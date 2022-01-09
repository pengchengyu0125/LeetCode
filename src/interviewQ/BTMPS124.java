package interviewQ;

public class BTMPS124 {
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

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        search(root);
        return max;
    }

    public int search(TreeNode root) {
        if (root == null)
            return 0;
        int left = Math.max(0, search(root.left));
        int right = Math.max(0, search(root.right));
        int sum = root.val + left + right;
        max = Math.max(sum, max);
        return root.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        BTMPS124 btmps124 = new BTMPS124();
        System.out.println(btmps124.maxPathSum(root));
    }
}
