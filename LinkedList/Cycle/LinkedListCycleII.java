//here return the node where is cycle start

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class LinkedListCycleII {
    
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);
        
        // Connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Create a cycle: tail connects to node with value 2

        ListNode temp = detectCycle(head);
        System.err.println("Cycl linked list start with " + temp.val);
    }

    public  static ListNode detectCycle(ListNode head){
        
        // first find the length of cycle list
        ListNode fast = head;
        ListNode slow  = head;
        int length = 0;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){ 
                //slow == fast again run temp.next != slow they give length of list
                ListNode temp = slow;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                break;
            }
        }

        if(length == 0) return null;

        ListNode first = head;
        ListNode seconde = head;

        //now i can set second in length of X is not become zero
        while(length > 0){
            seconde = seconde.next;
            length--;
        }

        //than travel first and seconde one move become not same postion
        while(first != seconde){
            first = first.next;
            seconde = seconde.next;
        }   

        //return any of one both are point same at the last
        return first;
    }


}
