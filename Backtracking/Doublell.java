import java.util.*;
public class Doublell{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
   
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
            
        }
        System.out.println("null");
    }
     public static Node head;
    public static Node tail;
    public static void main(String args[]){
        Doublell ll=new Doublell();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.print();
    }
}