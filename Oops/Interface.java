interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Dwon,Left,Right (in all 4 dire.)");
    }
}

class Elephents implements ChessPlayer{
    public void moves(){
        System.out.println("vertical and horizontal");
    }
}

public class Interface {

    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
    
}