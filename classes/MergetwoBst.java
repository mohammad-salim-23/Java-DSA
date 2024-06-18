import java.util.*;
public class MergetwoBst {
    static class Node{
        Node left;
        Node right;
        int data;
        Node (int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
       
        inorder(root.left);
         System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static Node createBST(ArrayList<Integer>inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid-1);
        root.right = createBST(inorder,mid+1,end);
        return root;
    }
    public static void getinorder(Node root, ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        getinorder(root.left , arr);
        arr.add(root.data);
        getinorder(root.right,arr);
       
    }
    public static Node merge(Node root1,Node root2){
      //inorder seq BST1
      ArrayList<Integer>arr1 = new ArrayList<>();
        getinorder(root1,arr1);
        //inorder seq BST2
        ArrayList<Integer>arr2 = new ArrayList<>();
        getinorder(root2,arr2);
        //merge
        ArrayList<Integer>finalArr = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.size()  && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            finalArr.add(arr1.get(i));
                i++;
        }
        while(j<arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }
        return createBST(finalArr, 0 , finalArr.size()-1);
    }
    public static void main(String args[]){
      //BST 1
      Node root1= new Node(2);
      root1.left = new Node (1);
      root1.right = new Node(4);
      //BST2
      Node root2 = new Node(9);
      root2.left = new Node(3);
      root2.right = new Node(12);
      
      Node root = merge(root1, root2);
      inorder(root);
    }
}
