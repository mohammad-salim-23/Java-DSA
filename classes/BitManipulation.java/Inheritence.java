public class Inheritence {
    public static void main(String args[]){
  Fish shark=new Fish();
  shark.color="Blue";
  System.out.println(shark.color);
  shark.eat();
  shark.breath();
  shark.swim();


    }
}
    //Base class
    class Animal{
        String color;
        void eat(){
            System.out.println("eats");
        
        }
        void breath(){
            System.out.println("breathes");
        }
    }
    //derived class
    class Fish extends Animal{
        int fins;
        void swim(){
            System.out.println("Swim is water");
        }
    }


