package top100liked;

/*
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(2);
//        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MergeTwoSortedLists merge = new MergeTwoSortedLists();
        System.out.println(merge.mergeTwoLists(l1,l2).toString());
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode c = null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val <= l2.val){
            c = l1;
        }
        else{
            c = l2;
            l2 = l1;
            l1 = c;
        }
        while(l1.next != null){
            if(l1.next.val > l2.val){
                ListNode temp = l1.next;
                l1.next = l2;
                l2 = temp;
            }
            l1 = l1.next;
        }
        l1.next = l2;
        return c;
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
