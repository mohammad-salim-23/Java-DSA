public class OOPs {
    public static void main(String[] args) {
        // Pen p1=new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(5);
        // System.out.println(p1.tip);
        //*****Access modifier** */
        Bankaccount myAcc=new Bankaccount();
        myAcc.username="MohammadSalim";
       // myAcc.password=(wrong access permission because it's a private)

           myAcc.setpassword("abcde");
           System.out.println(myAcc.username);
           
         


        
     }
 }
     class  Pen{
         String color;
         int tip;
         void setColor(String newColor){
             color=newColor;
         }
         void setTip(int newTip){
             tip=newTip;
         }
     }
//Access modifiers(public,default,protected,private);
class Bankaccount{
    public String username;
    private String password;
    public void setpassword(String password){
       this. password= password;
        System.out.println(password);

    }

}
