package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class BTIT94 {
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
        TreeNode treeNodeL = new TreeNode(3);
        TreeNode treeNodeR = new TreeNode(2, treeNodeL, null);
        TreeNode treeNode = new TreeNode(1, null, treeNodeR);
        BTIT94 btit94 = new BTIT94();
        System.out.println(btit94.inorderTraversal(treeNode).toString());
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        search(root, list);
        return list;
    }

    public void search(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        search(root.left, list);
        list.add(root.val);
        search(root.right, list);
    }
}
