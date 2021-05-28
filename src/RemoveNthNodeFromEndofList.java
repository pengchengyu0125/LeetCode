/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Follow up: Could you do this in one pass?
 */
public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        RemoveNthNodeFromEndofList remove = new RemoveNthNodeFromEndofList();
        remove.removeNthFromEnd(head, 2);

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        int length = 1;
        ListNode p = head;
        while (p.next != null) {
            ++length;
            p = p.next;
        }
        if (length == n) {
            head = head.next;
            return head;
        }
        p = head;
        for (int i = 1; i < length-n; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }

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
}
