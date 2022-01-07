package interviewQ;

import java.util.ArrayList;
import java.util.List;

public class BTLOT102 {
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

    public static void main(String[] args) {
        TreeNode rl = new TreeNode(15);
        TreeNode rr = new TreeNode(7);
        TreeNode r = new TreeNode(20, rl, rr);
        TreeNode l = new TreeNode(9);
        TreeNode root = new TreeNode(3, l, r);
        BTLOT102 btlot102 = new BTLOT102();
        System.out.println(btlot102.levelOrder(root).toString());
    }
}
