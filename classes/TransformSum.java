import java.util.*;

import org.w3c.dom.Node;
public class TransformSum {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftsite= transform(root.left);
        int rightsite = transform(root.right);
        int data = root.data;
        int newLeft= root.left==null ? 0: root.left.data;
        int newright= root.right==null ? 0: root.right.data;

        root.data = newLeft+leftsite+newright+rightsite;
        return data;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
      public static void main(String args[]){
            Node root = new Node(1);
                root.left= new Node(2);
                root.right = new Node(3);
                root.left.left= new Node(4);
                root.left.right = new Node(6);
                  root.right.right = new Node(7);
               transform(root);
               preorder(root);
           
                  
        }
}
