public class Linkedlist {

    public static class Node{
        int data;  //store the value
        Node next;  //point the next value refrence

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head ; //starting point
    public static Node Tail; //ending point
    public static int Size; //every time when newNode create size++;

    public void addFirst(int data){
        //1) create new nodde
        Node newNode = new Node(data);
        Size++;
        if(Head==null){
            Head=Tail=newNode;
            return;
        }

        // 2) newNode next = Head
        newNode.next = Head ; //connect the linkedlist

        // 3) Head = newNode
        Head = newNode ;
    }

    public void addLast(int data){
        //1)  create newNode
        Node newNode = new Node(data);
        Size++;
        if(Head==null){
            Head=Tail=newNode;
            return;
        }
        
        //2) Tail next is = newnode
        Tail.next = newNode;

        //3)Tail = newNode
        Tail=newNode;
    }

    public void print(){
        if(Head==null){
            System.out.println("Linkedlist is empty");
            return;
        }

        Node temp = Head;
        while (temp!=null) {
            
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addData(int index,int data){
        Node newNode = new Node(data);
        Size++;
        //temp store
        Node temp = Head;
        int i=0;

        while (i<index-1) {
            i++;
            temp = temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(Size==0) return -1; //Linkedlist size is 0
        else if(Size==1){
            int val = Head.data;
            Head=Tail=null;  //Linkedlist size is 1
            Size=0;
            return val;
        }
        int val = Head.data;
        Head = Head.next;
        Size--;
        return val;
    }

    public int removeLast(){
        if(Size==0) return -1; //Linkedlist size is 0
        else if(Size==1){
            int val = Head.data;
            Head=Tail=null;  //Linkedlist size is 1
            Size=0;
            return val;
        }
        
        Node prev = Head;
        for(int i=0;i<Size-2;i++){   //lastindex ka previous value 
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null ;  //previous value can null beacuasit value is make last
        Tail = prev;
        Size--;
        return val;  
    }

    public static void main(String[] args){
        Linkedlist li = new Linkedlist();
        li.print();
        li.addFirst(1);
        li.print();
        li.addFirst(2);
        li.print();
        li.addLast(3);
        li.print();
        li.addLast(4);
        li.print();
        li.addData(2, 77);
        li.print();

        System.out.println("Size of Linkedlist is : " + Size);
        System.out.println();

        System.out.println("Remove the element : " + li.removeFirst());
        System.out.println();

        System.out.println("Remove the element : " + li.removeLast());

        li.print();
        //output
        //2 -> 1 -> 3 -> 4-> null
    //  Head             Tail
    }

}
