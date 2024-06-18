import java.util.*;
public class DiameterTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam, int ht){
            this.diam=diam;
            this.ht= ht;
        }
    }
    public static Info diam1(Node root){
       if(root==null){
        return new Info(0,0);
       }
       Info leftInfo = diam1(root.left);
       Info rightInfo = diam1(root.right);
       int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
       int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
       return new Info(diam,ht);
    }
        public static int height(Node root){
            if(root== null){
                return 0;
            }
            int leftht = height(root.left);
            int rightht = height(root.right);
            return Math.max(leftht,rightht)+1;
        }
        public static int diam(Node root){//o(n^2)
            if(root==null){
                return 0;
            }
            int leftdiam = diam(root.left);
            int leftht = height(root.left);
            int rightdiam = diam(root.right);
            int rightht = height(root.right);
            int selfdiam = leftht+rightht+1;
            return Math.max(selfdiam ,Math.max(rightdiam,leftdiam));
        }
        public static void main(String args[]){
            Node root = new Node(1);
            root.left= new Node(2);
            root.right = new Node(3);
            root.left.left= new Node(4);
            root.left.right = new Node(6);
              root.right.right = new Node(7);

              System.out.println(diam1(root).diam);

            

        }
    
    
}
