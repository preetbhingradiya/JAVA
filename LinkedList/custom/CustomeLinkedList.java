
public class CustomeLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CustomeLinkedList(){
        this.size = 0;
    }

    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) tail = head;

        size +=  1;
    }

    public void insertLast(int val){

        if(tail == null) {
            insert(val);  //insert in first poistion value
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertInIndex(int val, int index){
        if(index == 0){
            insert(val);
            return;
        }

        if(index == size){
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

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
