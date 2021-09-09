package top100liked;

/*
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthofBinaryTree {
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        MaximumDepthofBinaryTree maximum = new MaximumDepthofBinaryTree();
        System.out.println(maximum.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int depth = 0, max = 0;
        search(root, depth, max);
        return max;
    }

    public void search(TreeNode root, int depth, int max) {
        if (root != null) {
            ++depth;
            max = Math.max(max, depth);
            search(root.left, depth, max);
            --depth;
            search(root.right, depth, max);
        }
    }
}
