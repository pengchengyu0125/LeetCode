import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.
 */
public class MergekSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(5);
//
        ListNode l2 = new ListNode();
//        l2.next = new ListNode(3);
//        l2.next.next = new ListNode(4);
//
//        ListNode l3 = new ListNode(2);
//        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2};
        MergekSortedLists merge = new MergekSortedLists();
        ListNode list = mergeKLists(lists);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode sum = new ListNode();
        if (lists == null || lists.length == 0)
            return null;
        int flag = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null)
                ++flag;
        }
        if (flag == lists.length)
            return null;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode list = lists[i];
            while (list != null) {
                nums.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(nums);
        ListNode p = sum;
        for (int i = 0; i < nums.size(); i++) {
            p.val = nums.get(i);
            if (i == nums.size() - 1)
                break;
            p.next = new ListNode();
            p = p.next;
        }
        return sum;
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
