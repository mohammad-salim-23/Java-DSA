import java.util.ArrayList;

public class ActivitySelectionOne{
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        // end time basis sorted
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(0);
        int maxAct=1;
        int lastEnd = end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                lastEnd = end[i];
                ans.add(i);
            }
        }
        System.out.println(maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }


    }
}