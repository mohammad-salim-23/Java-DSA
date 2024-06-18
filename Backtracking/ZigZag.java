import java.util.LinkedList;
public class ZigZag {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
          
      
    public void zigzag(){
        if(head==null || head.next==null){
            return ;
        }
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       Node mid=slow;
        //2nd half reverse
        Node curr= mid.next;
        mid.next = null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        //alternate merge
        Node nextL;
       Node nextR;
        while(left!=null && right!=null){
            left.next=right;
            nextL=left.next;
            right.next=nextL;
            nextR=right.next;
            left=nextL;
            right=nextR;
            
        }
        
        
    }
     public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node head;
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
    
   ll.print();
   ll.zigzag();
   ll.print();
}
   
}