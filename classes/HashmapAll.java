import java.util.*;
public class HashmapAll {
    public static void main(String args[]){
        HashMap<String,Integer>hm = new HashMap<>();
        //put-> o(1)
        hm.put("Bangladesh",20);
        hm.put("India",100);
        hm.put("Srilanka",10);
        System.out.println(hm);
        LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();//insertion order, jevabe input niba oivabe output dibe
        //put-> o(1)
        
        lhm.put("India",100);
        lhm.put("Bangladesh",20);
        lhm.put("Srilanka",10);
         System.out.println(lhm);
       TreeMap<String,Integer>tm = new TreeMap<>();//sorted order
       
      
        tm.put("India",100);
        tm.put("Srilanka",10);
         tm.put("Bangladesh",20);
         System.out.println(tm);

        //get ->o(1)
    //     System.out.println(hm.get("Bangladesh"));//bangladesh er value return kore dibe
    //     System.out.println(hm.get("Pakistan"));//null return korbe, karon eita nai
    //     //containskey->o(1)
    //     System.out.println(hm.containsKey("India"));
    //     //remove o(1)
    //     System.out.println(hm.remove("Srilanka"));
    //       System.out.println(hm);
    //  System.out.println(hm.size());
     
    //Iterate
    // Set<String>keys = hm.keySet();
    // System.out.println(keys);
    // for(String k:keys){
    //     System.out.print(" key = "+k+", value = "+hm.get(k));
    // }
     

    }
}
