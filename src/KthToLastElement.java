
public class KthToLastElement {
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
        System.out.println(kToLastElement(head, 4));
    }

    public static Integer kToLastElement(Node head, int k) {
        Node root = head;
        Node pointer1 = head;
        Node pointer2 = head;
        for(int i = 0; i< k-1; i++){
            if(pointer2 == null)
                return null;
            pointer2 = pointer2.next;
        }
        if(pointer2 == null)
            return null;

        while(pointer2.next != null){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1.data;
    }
}
