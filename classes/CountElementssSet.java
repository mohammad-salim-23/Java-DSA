import java.util.HashSet;
public class CountElementssSet {
    public static void main(String[] args) {
        int arr[]={4,3,2,1,4,5,7,7};
      HashSet<Integer>set=new HashSet<>();//O(1)
     for(int i=0;i<arr.length;i++){
         set.add(arr[i]);
     }
   System.out.println(set.size());
     
    }
}
