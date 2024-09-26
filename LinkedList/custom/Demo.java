

public class Demo {
    
    public static void main(String[] args){
        CustomeLinkedList list = new CustomeLinkedList();
        list.insert(12);
        list.insert(23);
        list.insert(99);
        list.insert(2);

        //insert into last position of tail
        list.insertLast(100);

        //insert in 3 index 
        list.insertInIndex(101, 3);

        list.display();
    }
    
}
