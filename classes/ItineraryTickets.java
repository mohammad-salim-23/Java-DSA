import java.util.*;

public class ItineraryTickets {
     public static String getstart(HashMap<String,String>tickets){
        HashMap<String,String>revmap = new HashMap<>();
        for(String key:tickets.keySet()){
            revmap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){
            if(!revmap.containsKey(key)){
                return key;//starting point
            }
        }
        return null;
    }
    public static void main(String args[]) {
    HashMap<String,String>tickets = new HashMap<>();
    tickets.put("Chennai","Bengaluru");
    tickets.put("Mumbai","Delhi");
    tickets.put("Goa","Chennai");
    tickets.put("Delhi","Goa");
    String start = getstart(tickets);
    System.out.print(start+" ");
    for(String star:tickets.keySet()){
        System.out.print(tickets.get(start)+" ");
        start=tickets.get(start);
    }
    }
}
