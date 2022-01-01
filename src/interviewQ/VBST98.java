package interviewQ;

import top100liked.TrappingRainWater;

public class VBST98 {
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

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        if (root.val >= max || root.val <= min)
            return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

    public static void main(String[] args) {
        TreeNode tl = new TreeNode(1);
        TreeNode tr = new TreeNode(3);
        TreeNode treeNode = new TreeNode(2, tl, tr);
        VBST98 vbst98 = new VBST98();
        System.out.println(vbst98.isValidBST(treeNode));
    }
}
