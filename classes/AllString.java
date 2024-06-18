import java.util.Scanner;

public class AllString{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
// String str="abcd";
// String str2=new String("abcd");
Scanner sc=new Scanner(System.in);
// String name;
// name=sc.nextLine();
//******Palindrome
// if(isPalindrome(name)){
//     System.out.print("YES\n");
// }
// else{
//     System.out.print("NO\n");
// }
//**********Compare function ....largest found
// String fruits[]={"apple","mango","banana"};
// String largest=fruits[0];
// for(int i=1;i<fruits.length;i++){
//     if(largest.compareTo(fruits[i])<0){
//         largest=fruits[i];
//     }
// }
// System.out.println(largest);
//**********StringBuilder
// StringBuilder sb=new StringBuilder("");
// for(char ch='a' ; ch<='z';ch++){
//     sb.append(ch);
// }
// System.out.println(sb);
// Integer a=10;
// a.toString();


//System.out.println(name);
//printletters(name);
//System.out.println(name.charAt(0));
//System.out.println(name.length());

    }
}