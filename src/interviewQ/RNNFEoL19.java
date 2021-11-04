package interviewQ;

public class RNNFEoL19 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        RNNFEoL19 rnnfEoL19 = new RNNFEoL19();
        int n = 2;
        rnnfEoL19.removeNthFromEnd(node, n);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int size = 0;
        while(p != null) {
            ++size;
            p = p.next;
        }
        if (size == 1 && n == 1)
            return null;
        p = head;
        if (n == size) {
            head = head.next;
            return head;
        }
        int temp = size - n - 1;
        for (int i = 0; i < temp; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
