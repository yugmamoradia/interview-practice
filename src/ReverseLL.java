class NodeLL{
        int data;
        NodeLL next;
        }
public class ReverseLL {
        public static NodeLL reverseList(NodeLL root){
            NodeLL head = root;
            NodeLL prev = null;
            NodeLL curr = head;
            NodeLL next = null;
            while(next!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
            return head;
        }
}
