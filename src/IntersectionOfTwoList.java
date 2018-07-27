/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 For example, the following two linked lists:
 A:          a1 → a2
                     ↘
                      c1 → c2 → c3
                     ↗
 B:     b1 → b2 → b3
 */
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class IntersectionOfTwoList {


        public static void main(String[] args) {

        }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode tempA = headA; //Storing the head in temporary head pointers
            ListNode tempB = headB;
            int length1 = 0;
            int length2 = 0;
            //We need to determine the lengths of both the linked list, inorder to compute the difference
            //Because we cannot start from the same point having two diff length of linked list
            if(tempA == null || tempB == null)
                return null;
            while(tempA != null){
                length1++;
                tempA = tempA.next;
            }

            while(tempB != null){
                length2++;
                tempB = tempB.next;
            }

            //Restore the original head position to tempHeads once again.
            int diff = 0;
            tempA = headA;
            tempB = headB;
            //We need to move the pointer of higher length to difference of both lengths so that we cqan start
            //traversing from one point for both linkedList
            if(length1 > length2){
                diff = length1 - length2;
                int i = 0;
                while(i < diff){
                    tempA = tempA.next;
                    i++;
                }
            }
            if(length2 > length1){
                diff = length2 - length1;
                int i = 0;
                while(i < diff){
                    tempB = tempB.next;
                    i++;
                }
            }
            //Finally we check if value of both the nodes is equal? If equal we return the node
            //Else we return null indicating no intersection
            while(tempA != null && tempB != null){
                if(tempA.val == tempB.val)
                    return tempA;
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return null;
        }
}
