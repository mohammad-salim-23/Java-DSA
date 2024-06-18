import java.util.*;
public class BinaryTreeB {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
          static int idx=-1;
          public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left= buildtree(nodes);
            newNode.right= buildtree(nodes);
            return newNode;
          }
          public static void preorder(Node root){
            if(root==null){
                return;
            }
           System.out.print(root.data+" ");
           preorder(root.left);
           preorder(root.right);

          }
          public static void inorder(Node root){
            if(root==null){
                return;
            }
          
           inorder(root.left);
            System.out.print(root.data+" ");
           inorder(root.right);

          } 
           public static void postorder(Node root){
            if(root==null){
                return;
            }
          
        postorder(root.left);
           
           postorder(root.right);
             System.out.print(root.data+" ");

          } 
          public static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node>q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                         q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
          }
          public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
          }
          public static int countnodes(Node root){
            if(root==null){
                return 0;
            }
            int lc = countnodes(root.left);
            int rc= countnodes(root.right);
            int sc = lc+rc+1;
            return sc;
          }
          public static int sumnodes(Node root){
           
            if(root==null){
                return 0;
            }
            
            int ls = sumnodes(root.left);
            int rs = sumnodes(root.right);
            int sum = ls+rs+root.data;
            return sum;
          }
    }
    public static void main(String args[]){
        //int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         int nodes[]={1,2,-1,-1,3,-1,4,-1,5,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root= tree.buildtree(nodes);
    // int ht= tree.height(root);
    int cnt= tree.sumnodes(root);
     System.out.println(cnt);
    
    }
}
