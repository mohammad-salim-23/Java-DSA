public class Methodoverriding {
    public static void main(String args[]){
        Animal dog=new Animal();
        dog.eat();
        Fish ilish=new Fish();
        ilish.eat();

    }
}
class Animal{
    void eat(){
        System.out.println("eat nothing");
    }
}
class Fish{
    void eat(){
        System.out.println("eat grass");
    }
}
