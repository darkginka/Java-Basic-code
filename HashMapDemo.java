import java.util.*;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<Integer, String>();
    map.put(101, "London");
    map.put(102, "Berlin");
    map.put(103, "Oslo");
    map.put(104, "Washington DC");
    
 
for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  


    //System.out.println(capitalCities.get(101)); 
  }
}