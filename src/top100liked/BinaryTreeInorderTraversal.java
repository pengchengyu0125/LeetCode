package top100liked;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        BinaryTreeInorderTraversal binary = new BinaryTreeInorderTraversal();
        System.out.println(binary.inorderTraversal(root).toString());
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorderVisit(root,list);
        return list;
    }

    public void inorderVisit(TreeNode root,List<Integer> list){
        if(root != null){
            inorderVisit(root.left,list);
            list.add(root.val);
            inorderVisit(root.right,list);
        }
    }
}
