import java.util.*;
class HashSet {
    public static void main(String[] args) {
    //   HashSet<String>cities=new HashSet<>();//O(1)
    //   cities.add("Dhaka");
    //   cities.add("Mumbai");
    //   cities.add("Chennai");
    //   System.out.println(cities);
    //   System.out.println(cities.size());
    //   cities.clear();
    //   System.out.println(cities);
    //**********LinkedHashSet-> TC:o(1)
    // LinkedHashSet<String>cities=new LinkedHashSet<>();//jevabe insert korbe obabe output
    //   cities.add("Dhaka");
    //   cities.add("Mumbai");
    //   cities.add("Chennai");
    //   System.out.println(cities);
    //************TreeSet ->TC:o(logn)
       TreeSet<String>cities=new TreeSet<>();//sorted order e output dibe 
      cities.add("Dhaka");
      cities.add("Mumbai");
      cities.add("Chennai");
      System.out.println(cities);
     
    }
}