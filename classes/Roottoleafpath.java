import java.util.ArrayList;
public class Roottoleafpath {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer>path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printpath(path);
        }
        printRoot2leaf(root.left,path);
        printRoot2leaf(root.right,path);
        path.remove(path.size()-1);
        
    }
    public static void printpath(ArrayList<Integer>path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node (11);
        root.right.right.right = new Node(14);
        ArrayList<Integer>path = new  ArrayList<>();
        printRoot2leaf( root,path);


    }
}
