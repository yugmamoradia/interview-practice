
class Node {
    int data;
    Node next;
}

public class MiddleElementLL {
    public static void main(String[] args) {
        Node head = new Node();
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();
        Node f = new Node();
        Node g = new Node();

        head.data = 1;
        head.next = a;

        a.data = 2;
        a.next = b;

        b.data = 3;
        b.next = c;

        c.data = 4;
        c.next = d;

        d.data = 5;
        d.next = e;

        e.data = 6;
        e.next = f;

        f.data = 7;
        f.next = g;

        g.data = 8;
        g.next = null;
        System.out.println(middleElementLL(head));
    }
    public static int middleElementLL(Node head) {
        Node root = head;
        Node slow = head;
        Node fast = head;
        if(root != null){
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow.data;
    }
}

