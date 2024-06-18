public class Interfaces {
    public static void main(String args[]){
        // King k=new King();
        // Queen q=new Queen();
        // k.moves();
        // q.moves();
        Bear b=new Bear();
        b.grass();
        b.meat();
    }
}
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal->(in all 4 direction)");
    }
}
class Rock implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal->(by 1 step)");
    }
}
//Multiple inheritance
interface Herbivore{
    void grass();
}
interface Carnivore{
  void meat();
}
class Bear implements Herbivore,Carnivore{
     public void grass(){
        System.out.println("Herbivore animal");
     }
     public void meat(){
        System.out.println("Carnivore animal");
     }

}