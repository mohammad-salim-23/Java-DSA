import java.util.*;
public class Arraylistberacer1 {
    public static void main(String args[]){
        //*************Sorting asscending and descending */
        // ArrayList<Integer>list=new ArrayList<>();
        // list.add(9);
        // list.add(7);
        // list.add(10);
        // //Collections.sort(list);------asscending order
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);
        
        //***********Multi dimensional arraylist */
        // ArrayList<ArrayList<Integer>>mainList= new ArrayList<>();
        // ArrayList<Integer>list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // mainList.add(list);
        // ArrayList<Integer>list2=new ArrayList<>();
        // list2.add(3);list2.add(4);
        // mainList.add(list2);
        // System.out.println(mainList);
        // for(int i=0;i<mainList.size();i++){
        //     ArrayList<Integer>currList=mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();

        // }
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
    for(int i=0;i<mainList.size();i++){
        ArrayList<Integer>currList=mainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
    }


    }
}
