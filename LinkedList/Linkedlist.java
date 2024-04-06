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

    public void AddFirst(int data){
        //1) create new nodde
        Node newNode = new Node(data);

        if(Head==null){
            Head=Tail=newNode;
            return;
        }

        // 2) newNode next = Head
            newNode.next = Head ; //connect the linkedlist

        // 3) Head = newNode
        Head = newNode ;
    }
    public static void main(String[] args){
        Linkedlist li = new Linkedlist();
        li.AddFirst(1);
        li.AddFirst(2);

        System.out.println(li);
    }

}
