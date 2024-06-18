public class Abstractclass{
    public static void main(String args[]){
        // Horse h=new Horse();
        // h.eat();
        // h.walk();
        Mustang myHorse=new Mustang();
        //constructor called-> Animal->Horse->Mustang
    }
}
abstract class Animal{
    Animal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("animal eat");//non_abstract method
    }
    abstract void walk();//abstract method

}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    // walk function na dile horse class wrong dekabe karon walk tar jonno mandatory hoye giyece jehetu seta animal er abstract quality
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
   System.out.println ("Mustang construtor called");
    }

}