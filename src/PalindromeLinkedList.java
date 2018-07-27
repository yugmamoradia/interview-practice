public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head != null){   //Base condition check
            ListNode temp = head;
            int len = 0;
            while(temp != null){    //First calculating the length of LinkedList to determine the size of
                temp = temp.next;   //additional data structure used i.e. array.
                len++;
            }
            int[] arr = new int[len];
            int i = 0;
            temp = head;        //Resetting the temp to head again
            while(temp != null){
                arr[i] = temp.val;  //Now traversing the list again and putting all the values in the array
                temp = temp.next;   //from LinkedList
                i++;
            }
            temp = head;        //Resetting the temp to head again
            for(int j = len - 1; j >= 0; j--){  //Traversing the array from behind and LinkedList from head
                if(temp.val == arr[j]){         //and determining whether both the values are equal.
                    temp = temp.next;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
