package interviewQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SL148 {
      public ListNode sortList(ListNode head) {
            if (head == null)
                  return head;
            List<Integer> nodes = new ArrayList<>();
            ListNode p = head;
            while (p != null) {
                  nodes.add(p.val);
                  p = p.next;
            }
            Collections.sort(nodes);
            ListNode newHead = new ListNode(nodes.get(0));
            p = newHead;
            for (int i = 1; i < nodes.size(); i++) {
                  p.next = new ListNode(nodes.get(i));
                  p = p.next;
            }
            return newHead;
      }


      public static void main(String[] args) {
            ListNode head = new ListNode(4);
            ListNode node1 = new ListNode(2);
            ListNode node2 = new ListNode(1);
            ListNode node3 = new ListNode(3);
            head.next = node1;
            node1.next = node2;
            node2.next = node3;
            SL148 sl148 = new SL148();
            sl148.sortList(head);
      }
}
