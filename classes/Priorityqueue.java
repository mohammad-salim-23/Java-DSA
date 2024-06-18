import java.util.*;
public class Priorityqueue {
    public static void main(String args[]){
    //suto teke boro, asscending order e sajabe
   // PriorityQueue<Integer>pq = new PriorityQueue<>();
   //boro teke suto descending order
   PriorityQueue<Integer>mpq = new PriorityQueue<>(Collections.reverseOrder());
   mpq.add(5);
   mpq.add(9);
   mpq.add(8);
   while(!mpq.isEmpty()){
    System.out.print(mpq.peek()+" ");
    mpq.poll();
   }
   }
}
