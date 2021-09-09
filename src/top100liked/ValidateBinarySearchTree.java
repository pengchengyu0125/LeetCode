package top100liked;

/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
    boolean flag = true;
    public static void main(String[] args) {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(5);
        root.left = new BinaryTreeInorderTraversal.TreeNode(1);
        root.right = new BinaryTreeInorderTraversal.TreeNode(4);
        root.right.left = new BinaryTreeInorderTraversal.TreeNode(3);
        root.right.right = new BinaryTreeInorderTraversal.TreeNode(6);
        ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();
        System.out.println(validateBinarySearchTree.isValidBST(root));
    }

    public boolean isValidBST(BinaryTreeInorderTraversal.TreeNode root) {
        search(root, null, null);
        return flag;
    }

    public void search(BinaryTreeInorderTraversal.TreeNode root, Integer low, Integer up) {
        if (root != null) {
            if (low != null && root.val <= low)
                flag = false;
            if (up != null && root.val >= up)
                flag = false;
            if (root.left != null && root.left.val >= root.val)
                flag = false;
            search(root.left, low, root.val);
            if (root.right != null && root.right.val <= root.val)
                flag = false;
            search(root.right, root.val, up);
        }
    }
}
