import java.util.HashSet;
public class UnionandIntersectionSet {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer>set = new HashSet<>();
        //Union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set.size());//Union size
        //Intesection
        set.clear();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int cnt=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                cnt++;
                set.remove(arr2[i]);
            }
        }
        System.out.println(cnt);
       }
}
