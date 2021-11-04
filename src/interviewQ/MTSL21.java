package interviewQ;

public class MTSL21 {
    public static class ListNode {
        int val;
        MTSL21.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, MTSL21.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merge = new ListNode();
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = merge;
        if (p1 == null && p2 == null)
            return null;
        while (p1 != null || p2 != null) {
            if (p1 == null) {
                p3.val = p2.val;
                p2 = p2.next;
                if (p2 != null)
                    p3.next = new ListNode();
                p3 = p3.next;
            }
            else if (p2 == null) {
                p3.val = p1.val;
                p1 = p1.next;
                if (p1 != null)
                    p3.next = new ListNode();
                p3 = p3.next;
            }
            else {
                if (p1.val <= p2.val) {
                    p3.val = p1.val;
                    p1 = p1.next;
                    p3.next = new ListNode();
                    p3 = p3.next;
                } else {
                    p3.val = p2.val;
                    p2 = p2.next;
                    p3.next = new ListNode();
                    p3 = p3.next;
                }
            }
        }
        return merge;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MTSL21 mtsl21 = new MTSL21();
        mtsl21.mergeTwoLists(l1, l2);
    }
}
