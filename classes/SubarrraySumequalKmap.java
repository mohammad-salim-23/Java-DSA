import java.util.HashMap;

public class SubarrraySumequalKmap {
    //k er value er soman koyta subarray ace
     public static void main(String args[]) {
// int arr[]={10,2,-2,-20,10};
int arr[]={1,2,3};
 int k=3;
 int count=0;
 int sum=0;
 HashMap<Integer,Integer>map = new HashMap<>();
 map.put(0,1);
 for(int j=0;j<arr.length;j++){
     sum+=arr[j];
     if(map.containsKey(sum-k)){
         count+=map.get(sum-k);
     }
     map.put(sum,map.getOrDefault(sum,0)+1);
 }
 System.out.print("subarray sum equal to K = "+count);
    }
}
