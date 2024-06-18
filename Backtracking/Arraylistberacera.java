import java.util.ArrayList;

//import java.util.*;
public class Arraylistberacera {
    public static void main(String args[]){
    ArrayList<Integer> list =new ArrayList<>();

    // list.add(1); //O(1)
    // list.add(2); 
    // list.add(3);
    // list.add(1,9);   //O(n)
    //System.out.println(list);  
    //*********get operation->O(1)
    //int element=list.get(2);
   // System.out.println(element);
// **********set at index ->o(n)
    // list.set(2,10);
    // System.out.println(list); 
     //contains-> true naki false bole->o(n)
    //  System.out.println(list.contains(1));
    //  System.out.println(list.contains(2));
    // System.out.println(list.size());
    // for(int i=0;i<list.size();i++){
    //     System.out.print(list.get(i)+" ");
    // 
//}

list.add(3);
list.add(4);
list.add(5);
//swap
int idx1=0,idx2=2;
int tmp=list.get(idx1);
list.set(idx1,list.get(idx2));
list.set(idx2,tmp);
System.out.println(list);
//*******find max element */
// int mx=Integer.MIN_VALUE;
//     for(int i=0;i<list.size();i++){
//          mx=Math.max(mx,list.get(i));
//     }
    
//    System.out.println(mx);
    }
}

