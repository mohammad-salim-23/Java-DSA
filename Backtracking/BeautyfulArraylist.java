import java.util.*;
public class BeautyfulArraylist {
    

    public static ArrayList<Integer> Beauty(int n){
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer>temp= new ArrayList<>();
            for(int i=0;i<ans.size();i++){
                if(ans.get(i)*2-1<=n){
                    temp.add(ans.get(i)*2-1);
                }
            }
            for(int i=0;i<ans.size();i++){
                if(ans.get(i)*2<=n){
                    temp.add(ans.get(i)*2);
                }
            }
            ans=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(Beauty(n));
    }
}

