package OOPS;

public class Interface {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();
        bear b= new bear();
        b.eatplant();
        b.eatmeat();
                
    }
}
interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal (in all 4 direction)");
    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("up , down , left , right  ");
    }

}
class King implements chessplayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal (by 1 step only) ");
    }

}
interface Herbivore{
    void eatplant();
}
interface Carnivore{
    void eatmeat();

}
class bear implements Herbivore,Carnivore{
    public void eatplant(){
        System.out.println("can eat veg");
    }
    public void eatmeat(){
        System.out.println("can eat non-veg");
    }

}