package interviewQ;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LLC141 {

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            if (visited.contains(node))
                return true;
            visited.add(node);
            node = node.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode ln1 = new ListNode(2);
        ListNode ln2 = new ListNode(0);
        ListNode ln3 = new ListNode(-4);
        head.next = ln1;
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln1;
        LLC141 llc141 = new LLC141();
        System.out.println(llc141.hasCycle(head));
    }
}
