import LinkedList.RemoveDuplicate.ListNode;

public class RemoveDuplicate {

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

    public static void mian(String[] args) {

        ListNode head = new ListNode();

        deleteDuplicates(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) return head;

        ListNode temp =  head;

        while(temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }
}
