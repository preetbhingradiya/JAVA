
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedlistCycl {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Create a cycle (4 -> 2)


        LinkedlistCycl solution = new LinkedlistCycl();
        boolean result = solution.hasCycle(head);

        // Print the result
        System.out.println("The linked list has a cycle: " + result);
    }

    public boolean hasCycle(ListNode head) {
        // If the list is empty or has only one element, there can be no cycle
        if (head == null || head.next == null) return false;

        ListNode fast = head;
        ListNode slow = head;

        // Use the fast and slow pointer technique
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move one step
            fast = fast.next.next;      // Move two steps

            // If slow and fast meet, there is a cycle
            if (slow == fast) return true;
        }

        // No cycle found
        return false;
    }

}
