import java.util.*;  
    
public class Function {
    public static void binToDec(int binNum)
   {
       int mynum=binNum;
       int pow=0;
       int decNum=0;
       while(binNum>0)
       {
           int ld=binNum%10;
           decNum=decNum+(ld*(int)Math.pow(2,pow));
           pow++;
           binNum=binNum/10;
       }
       System.out.println("decimal of "+mynum+"="+decNum);
   }
   public static void decTobin(int n){
       int mynum=n;
       int pow=0;
       int binNum=0;
       while(n>0)
       {
           int rem =n%2;
           binNum=binNum+(rem*(int)Math.pow(10,pow));
           pow++;
           n=n/2;
       }
         System.out.println("binary of "+mynum+"="+binNum);
   }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
  // binToDec(n);
  decTobin(n);
    }
}
