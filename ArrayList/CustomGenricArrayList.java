import java.util.Arrays;
//int generic T use of create object or array it not allowed to do it]
// bcz generic is not idea which data type object will create 
// so create main Object class to define it 

public class CustomGenricArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10; // Changed to final
    private int size = 0;  // Also working as index

    // Constructor to initialize the data array
    public CustomGenricArrayList() {
        this.data = new Object[DEFAULT_SIZE];
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
       Object[] temp = new Object[data.length * 2];   //current length * 2;

       for(int i=0; i<data.length; i++){
            temp[i] = data[i];
       }

       data = temp;
    }

    public  T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    
    public T get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T)(data[index]);
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
    }

    public static void main(String[] args){
        CustomGenricArrayList<Integer> list = new CustomGenricArrayList<>();

        list.add(12);
        list.add(13);

        System.out.println(list);
    }
}
