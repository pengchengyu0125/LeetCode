package interviewQ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTZLOT103 {
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        levelRecursion(root, result, 0);
        return result;
    }

    private void levelRecursion(TreeNode node, List<List<Integer>> result,
                                int level) {
        if (node == null) {
            return;
        }
        if (result.size() < level + 1) {
            result.add(new LinkedList<Integer>());
        }
        if (level % 2 != 0) {
            ((LinkedList<Integer>) result.get(level)).addFirst(node.val);
        } else {
            result.get(level).add(node.val);
        }
        levelRecursion(node.left, result, level + 1);
        levelRecursion(node.right, result, level + 1);
    }
}
