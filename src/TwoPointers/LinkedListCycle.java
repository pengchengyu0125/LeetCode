/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Follow up:

Can you solve it using O(1) (i.e. constant) memory?



Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.


Constraints:

The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 */
package TwoPointers;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(0);
        ListNode head4 = new ListNode(-4);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head2;
        LinkedListCycle l = new LinkedListCycle();
        System.out.println(l.hasCycle(head));
    }

    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode ln1 = head;
        ListNode ln2 = head.next;
        while (ln1 != null && ln2 != null) {
            if (ln1 == ln2)
                return true;
            if (ln2.next == null)
                break;
            ln1 = ln1.next;
            ln2 = ln2.next.next;
        }
        return false;
    }
}
