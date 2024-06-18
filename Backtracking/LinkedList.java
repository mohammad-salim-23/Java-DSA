
public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public int size(){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
            
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
        }
        Node newNode=new Node(data);
        Node tmp=head;
        int i=0;
        while(i<idx-1){
            tmp=tmp.next;
            i++;
        }
        //i=idx-1; 
        newNode.next=tmp.next;
        tmp.next=newNode;
    }
    public int removeFirst(){
        if(size()==0){
            System.out.println("LL is empty");
        }
        else if(size()==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        return val;
        
    }
    public int removeLast(){
        if(size()==0){
            System.out.println("LL is empty");
        }
        else if(size()==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        //prev i=size-2;
        Node prev=head;
        int n=size();
        for(int i=0;i<n-2;i++){
            prev=prev.next;
           
        }
        int val=prev.next.data;
        
        tail=prev;
         tail.next=null;
        return val;
    }
    public int itrSearch(int key){//O(n)
       Node tmp=head;
       int i=0;
       while(tmp!=null){
           if(tmp.data==key){
               return i;
           }
           tmp=tmp.next;
           i++;
       }
       //key not found
       return -1;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public Node findMid(Node head){// slow & fast approach
        Node slow=head;// 1 gor ke agabe
        Node fast=head;// 2 gor kore agabe
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;// slow is my midnode

    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
              return true;
        }
        //step-1 : find mid
        Node midNode=findMid(head);
        //step 2->reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        //step -> 3: check left half and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public boolean isCycle(){
        
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //step 1-> detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //remove cycle :last node.next=null
        prev.next=null;
    }
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
      LinkedList ll=new LinkedList();
    //   ll.addFirst(2);
    //   ll.addFirst(1);
    //   ll.addLast(1);
            head=new Node(1);
            Node tmp=new Node(2);
            head.next=tmp;
            head.next.next=new Node(3);
            head.next.next.next=tmp;
      System.out.println(ll.isCycle());//true
      removeCycle();
      System.out.println(ll.isCycle());//false

    //   ll.addLast(5);
    //   ll.add(2,3);
      //ll.removeFirst();
    //  ll.print();
    //   ll.removeLast();
    //  ll.reverse();
    //  ll.print();
   // System.out.println(ll.checkPalindrome());


    //   System.out.println(ll.itrSearch(3));
    //   ll.print();
    //    System.out.println();
    //   System.out.println(ll.size());
    }
}