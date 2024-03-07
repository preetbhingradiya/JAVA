//pen is class and color , width is property of pen
class Pen{

    String color;
    private int width;

    //Get :- to return the value
    //Set :- to modify(change) the value
    int getWidth(){
        return width;
    }

    void setColor(String newColor){
        color=newColor;
        System.out.println("Pen color is :-" + color);
    };

    void setWidth(int width){
        //if the varible and parameter name is same that time use This keyword to the variable

        this.width = width;
        System.out.println("Pen width is :- " + width);
    }
        
}

public class Class_Object {
    
    public static void main(String[] args){
        Pen newPen = new Pen();

        newPen.setColor("red");
        newPen.setWidth(10);
        
        System.out.println(newPen.getWidth());
    }
}
