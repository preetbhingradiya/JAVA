
import java.util.NoSuchElementException;

public class CustomeLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public CustomeLinkedList() {
        this.size = 0;
    }

    public void insert(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {

        if (tail == null) {
            insert(val);  //insert in first poistion value
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;

        head = head.next;
        if (head == null) {
            tail = null;
        }
        //this is only one node and you delete this node also manage tail

        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 0) {
            throw new NoSuchElementException("List is empty");
        }

        if (size == 1) {
            return deleteFirst(); // If there's only one element
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }


    public int getIndex(int value) {
        Node node = head;
        int i =0;
        while (node != null) {
            if(node.value == value) return i;
            node = node.next;
            i++;
        }

        return -1;
    }



    public int deleteInIndex(int index){
        if(index==0) return deleteFirst();

        if(index == size-1) return deleteLast();


        Node prevOfIndex = get(index);

        int val = prevOfIndex.next.value;
        prevOfIndex.next = prevOfIndex.next.next;
        
        return val;
    }


    public void insertInIndex(int val, int index) {
        if (index == 0) {
            insert(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node curr = head;  //as 0 index represent
        for (int i = 1; i < index; i++) {  // less the index number bcz the join node
            curr = curr.next;
        }

        //here node is point to index 4 means next val
        Node node = new Node(val, curr.next);
        //here curr node menas 2 index is point to 3 indexs
        curr.next = node;
        size++;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


}
