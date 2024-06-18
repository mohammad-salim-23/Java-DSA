import java.util.*;
public class Pairsum {
    // it's work just for sorted array
    public static boolean pairsum(ArrayList<Integer>list,int target){
        int lp=0;
       int rp=list.size()-1;
       while(lp!=rp){
        if(list.get(lp)+list.get(rp)==target){
              return true;
        }
        if(list.get(lp)+list.get(rp)<target){
            lp++;
        }
        else{
            rp--;
        }

       }
       return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(pairsum(list,90));
    }
}
