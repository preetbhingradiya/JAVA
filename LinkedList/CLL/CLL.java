
import org.w3c.dom.Node;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        head = null;
        tail = null;
    }

    private class Node {

        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;

            tail.next = head;  //connect tail in head bcz circular
            return;
        }

        tail.next = node;  //now tail point node
        node.next = head;   //node poin heead

        tail = node;  //tail is seach in node
    }

    public void delete(int val) {
        Node temp = head;

        // Special case for deleting the head
        if (head != null && head.val == val) {
            // If there's only one node in the list
            if (head == tail) {
                head = null;
                tail = null;
            } else { //delete the headValue so head can move head.next and join tail
                head = head.next;
                tail.next = head;  // Maintain circular nature
            }
            return;
        }

        do {
            // Node p = temp.next;
            if (temp.next.val == val) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);

    }

    public void display() {
        Node temp = head;

        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head); //circular so temp is run stile not refound head
            System.out.println("HEAD");
        }
    }

    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(22);
        list.insert(45);
        list.insert(200);
        list.insert(10);

        list.display();

        list.delete(200);

        list.display();
    }
}
