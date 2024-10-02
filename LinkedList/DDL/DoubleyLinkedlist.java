import org.w3c.dom.Node;

public class DoubleyLinkedlist {

    private Node head;
    private Node tail;
    private int size;

    private class Node {

        private int val;
        private Node next;
        private Node prev;

        private Node(int val) {
            this.val = val;
        }

        private Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        if (tail == null) {
            tail = head;
        }

        head = node;
        size++;
    }

    public int insertLast(int val) {
        Node node = new Node(val);
        //connect to back side taile -> new node
        node.prev = tail;
        tail.next = node;

        // new node next become null
        node.next = null;

        //ncz this is tail now
        tail = node;
        size++;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        // System.out.println("Head is " + head.val);
        // System.out.println("Taile is " + tail.val);
    }

       
    public Node get(int value) {
        Node node = head;
        while (node != null) {
            if(node.val == value) return node;
            node = node.next;
        }

        return null;
    }

    public void insertInIndex(int index, int val) {

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
        }

        Node curr = head;
        for (int i = 1; i < index; i++) {  // less the index number bcz the join node
            curr = curr.next;
        }

        Node nextNode = curr.next;  //save the refrence

        Node node = new Node(val);
        //conecet node in next and prev both
        node.next = nextNode;
        node.prev = curr;

        if (nextNode != null) {  // check nextnode is not empty conect in node
            nextNode.prev = node;
        }

        
        curr.next = node;

        size++;
    }


    public void insertAfter(int after, int val){
        Node p = get(after);

        if(p == null) {
            System.out.println("Does not exit");
            return;
        }

        Node node = new  Node(val);

        node.next = p.next;

        //connect node in left side
        p.next = node;
        node.prev = p;

        //connect in right side
        if(node.next !=  null){
            node.next.prev = node;
        }

    }

    public void displayReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleyLinkedlist list = new DoubleyLinkedlist();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.display();

        System.out.println("Insert in last : " + list.insertLast(20));

        list.display();
        //reverse order
        // list.displayReverse();

        list.insertInIndex(2, 100);
        list.display();

        list.insertAfter(8, 49);
        list.display();
    }

}
