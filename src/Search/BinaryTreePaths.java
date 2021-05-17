/*
Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */
package Search;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(), t2 = new TreeNode(), t3 = new TreeNode(), t4 = new TreeNode();
        t1.val = 1;
        t2.val = 2;
        t3.val = 3;
        t4.val = 5;
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        BinaryTreePaths b = new BinaryTreePaths();
        List<String> list = b.binaryTreePaths(t1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList();
        if (root == null) return ret;
        dfs(root, "", ret);
        return ret;
    }

    private void dfs(TreeNode root, String prefix, List<String> ret) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            ret.add(prefix + root.val);
            return;
        }
        prefix += (root.val + "->");
        dfs(root.left, prefix, ret);
        dfs(root.right, prefix, ret);
    }
}
