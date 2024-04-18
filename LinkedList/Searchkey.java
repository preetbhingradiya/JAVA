public class Searchkey {

    public static class Node{
        int data;  //store the value
        Node next;  //point the next value refrence

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head ; 
    public static Node Tail;
    public static int Size;

    public static void addElement(int data){
        Node temp = new Node(data);

        if(Head==null){
            Head=Tail=temp;
            return;
        }

        Tail.next = temp;

        Tail = temp;
    }


    public void print(){
        if(Head==null){
            System.out.println("Linkedlist is empty");
            return;
        }

        Node temp = Head;
        int key =3;
        while (temp!=null) {
            
            // System.out.print(temp.data + "->");
            if(key==temp.data){
                System.out.println("Key is here");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Key not found");
        return ;
        // System.out.println("null");
    }

    public static void main(String[] args){
        Searchkey li = new Searchkey();

        li.addElement(1);
        li.addElement(2);
        li.addElement(3);
        li.addElement(4);

        li.print();
    }

}
