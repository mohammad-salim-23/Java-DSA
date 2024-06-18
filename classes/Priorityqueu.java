import java.util.*;
public class Priorityqueu {
    
    //pq for objects
    static class Student implements Comparable<Student>{//overriding
         String name;
         int rank;
         public Student(String name , int rank){
            this.name = name;
            this.rank = rank;

         }
         @Override
         public int compareTo(Student s2){
            return this.rank - s2.rank;
         }
    }
    public static void main(String args[]){
        //PriorityQueue<Integer>pq = new PriorityQueue<>();//asscending order
        PriorityQueue<Student>pq = new PriorityQueue<>();//desending order
       pq.add(new Student("Salim",1));
       pq.add(new Student("Hadi",2));
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+" : "+pq.peek().rank);
            pq.remove();
        }
    }
}
