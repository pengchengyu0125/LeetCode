package interviewQ;

public class ST101 {
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

    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;
        else return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if ((left == null && right != null) || (left != null && right == null))
            return false;
        if (left.val == right.val)
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        else return false;
    }

    public static void main(String[] args) {
        TreeNode lr = new TreeNode(3);
        TreeNode l = new TreeNode(2, null, lr);
        TreeNode rr = new TreeNode(3);
        TreeNode r = new TreeNode(2, null, rr);
        TreeNode root = new TreeNode(1, l, r);
        ST101 st101 = new ST101();
        System.out.println(st101.isSymmetric(root));
    }
}
