import java.util.*;
public class ActivitySelectionTwo {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {6,2,4,7,9,9};
        int activities[][] = new int [start.length][end.length];
        for(int i=0;i<start.length;i++){
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }
        // lambda function
        Arrays.sort(activities,Comparator.comparingDouble(o->o[1]));
         int maxAct = 1;
         int last = activities[0][1];
         for(int i=1;i<end.length;i++){
            if(activities[i][0]>=last){
                maxAct++;
                last = activities[i][1];
            }
         }
         System.out.println(maxAct);
    }
}
