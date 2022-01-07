package interviewQ;

public class PNRPiEN116 {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if (root == null)
            return null;
        if (root.left != null) {
            if (root.next != null)
                root.right.next = root.next.left;
            root.left.next = root.right;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node l = new Node(2);
        Node r = new Node(3);
        Node ll = new Node(4);
        Node lr = new Node(5);
        Node rl = new Node(6);
        Node rr = new Node(7);
        l.left = ll;
        l.right = lr;
        r.left = rl;
        r.right = rr;
        root.left = l;
        root.right = r;
        PNRPiEN116 pnrPiEN116 = new PNRPiEN116();
        System.out.println(pnrPiEN116.connect(root).toString());
    }
}
