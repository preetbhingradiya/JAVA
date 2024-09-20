
import java.util.Arrays;

public class CuatomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE = 10; // Changed to final
    private int size = 0;  // Also working as index

    // Constructor to initialize the data array
    public CuatomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){  //if the arrayList is full increse the sizze of list
            resize();
        }
        data[size++] = num;  //otherwise just add and size++;
    }

    private boolean isFull() {
        return data.length == size;
    }

    private void resize() {
       int[] temp = new int[data.length * 2];   //current length * 2;

       for(int i=0; i<data.length; i++){
            temp[i] = data[i];
       }

       data = temp;
    }

    public  int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index , int value){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        data[index] = value;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
        // return Arrays.toString(Arrays.copyOf(data, size));
    }

    // public void add(int num) {
    //     if (isFull()) {  // If the arrayList is full, increase the size of the list
    //         resize();
    //     }
    //     data[size++] = num;  // Otherwise just add and size++;
    // }

    // private boolean isFull() {
    //     return data.length == size;
    // }

    // private void resize() {
    //     int[] temp = new int[data.length * 2]; // Current length * 2
    //     for (int i = 0; i < data.length; i++) {
    //         temp[i] = data[i];
    //     }
    //     data = temp;
    // }

    // public int remove() {
    //     if (size == 0) {
    //         throw new IllegalStateException("Cannot remove from an empty list.");
    //     }
    //     int removed = data[--size];
    //     return removed;
    // }

    // public int get(int index) {
    //     if (index < 0 || index >= size) {
    //         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    //     }
    //     return data[index];
    // }

    // public int size() {
    //     return size;
    // }

    // public void set(int index, int value) {
    //     if (index < 0 || index >= size) {
    //         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    //     }
    //     data[index] = value;
    // }

    // @Override
    // public String toString() {
    //     return Arrays.toString(Arrays.copyOf(data, size)); // Show only filled part of the array
    // }

    public static void main(String[] args) {
        CuatomArrayList list = new CuatomArrayList(); // Corrected to call constructor
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        
        System.out.println(list);
    }


}
