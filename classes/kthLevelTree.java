
public class kthLevelTree {
    static class Node{
        Node left,right;
        int data;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void leveltree(Node root, int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        leveltree(root.left,level+1,k);
        leveltree(root.right,level+1,k);
    }
    public static void main(String args[]){
        Node root = new Node(1);
            root.left= new Node(2);
            root.right = new Node(3);
            root.left.left= new Node(4);
            root.left.right = new Node(6);
              root.right.right = new Node(7);
             leveltree(root,1,3);
              
    }
}
