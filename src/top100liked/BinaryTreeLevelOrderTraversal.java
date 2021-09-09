package top100liked;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal {
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
        BinaryTreeLevelOrderTraversal binary = new BinaryTreeLevelOrderTraversal();
        System.out.println(binary.levelOrder(root));
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        set(root, 0, lists);
        return lists;
    }

    public void set(TreeNode treeNode, int level, List<List<Integer>> result) {
        if(treeNode==null){
            return;
        }
        if(level==result.size()){
            result.add(new ArrayList<>());
        }
        result.get(level).add(treeNode.val);
        set(treeNode.left,level+1,result);
        set(treeNode.right,level+1,result);
    }
}
