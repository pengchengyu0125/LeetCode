package interviewQ;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CLwRP138 {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node p = head;
        while (p != null) {
            hashMap.put(p, new Node(p.val));
            p = p.next;
        }
        p = head;
        while (p != null) {
            hashMap.get(p).next = hashMap.get(p.next);
            hashMap.get(p).random = hashMap.get(p.random);
            p = p.next;
        }
        return hashMap.get(head);
    }

    public static void main(String[] args) {
        Node node = new Node(7);
        Node node1 = new Node(13);
        Node node2 = new Node(11);
        Node node3 = new Node(10);
        Node node4 = new Node(1);
        node.next = node1;
        node1.next = node2;
        node1.random = node;
        node2.next = node3;
        node2.random = node4;
        node3.next = node4;
        node3.random = node2;
        node4.random = node;
        CLwRP138 cLwRP138 = new CLwRP138();
        cLwRP138.copyRandomList(node);
    }
}
