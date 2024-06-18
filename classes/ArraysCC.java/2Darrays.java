import java.util.*;
public class 2Darrays {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("found at key ("+i+" "+j+")");
                    return true;
                }
            }
        }
        System.out.print("key not found");
        return false;
    }
    //************Search in sorted matrix*************** */
     public static boolean staircaseSearch(int matrix[][],int key){
       int row=0,col=matrix[0].length-1;
       while(row<matrix.length && col>=0){
           if(matrix[row][col]==key){
               System.out.println("found key at ("+row+","+col+")");
               return true;
           }
           else if(key<matrix[row][col]){
               col--;
           }
           else{
               row++;
           }
       }
       System.out.print("Not found");
       return false;
   }
    public static void main(String[] args) {
       int matrix[][]=new int[3][3];
       int n=matrix.length,m=matrix[0].length;
       Scanner sc=new Scanner(System.in);
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               matrix[i][j]=sc.nextInt();
           }
       }
       int key=6;
       search(matrix,key);
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }
    }
}
