package interviewQ;

public class ATN2 {
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
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(1);
//        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(1);
//        l2.next = new ListNode(9);

        ATN2 atn2 = new ATN2();
        System.out.println(atn2.addTwoNumbers(l1, l2).toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode sum = new ListNode(0);
        ListNode cur = sum;
        while (p1 != null || p2 != null) {
            if (p1 == null) {
                p1 = new ListNode(0);
                cur.val = cur.val + p2.val;
            } else if (p2 == null) {
                p2 = new ListNode(0);
                cur.val = cur.val + p1.val;
            } else cur.val = cur.val + p1.val + p2.val;
            if (cur.val > 9) {
                cur.next = new ListNode(1);
                cur.val = cur.val % 10;
            } else {
                if (p1.next != null || p2.next != null)
                    cur.next = new ListNode(0);
            }
            if (p1 != null)
                p1 = p1.next;
            if (p2 != null)
                p2 = p2.next;
            cur = cur.next;
        }
        return sum;
    }
}
