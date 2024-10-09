
class ListNode {

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

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        // Creating first sorted linked list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(10);
        list1.next = new ListNode(24);
        list1.next.next = new ListNode(55);

        // Creating second sorted linked list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(23);
        list2.next.next = new ListNode(40);

        ListNode mergedList = mergeTwoLists(list1, list2);
        printList(mergedList);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); //create dummy list
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) { // if list2 to val grater
                curr.next = list1; //add the dummy list and move next
                list1 = list1.next;
            } else {
                curr.next = list2; //otherwise list1 to val add in curr ad move next
                list2 = list2.next;
            }
            curr = curr.next; // Move to the next node
        }

        // check it the one of the any list null add other list in curr
        curr.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}
