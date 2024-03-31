import java.util.*;
import java.util.Map.Entry;

public class q7 {
    public static void main(String[] args) {
        Map<Integer, String> cdac = new HashMap<>();
        cdac.put(102,"Amit");
        cdac.put(103,"Vijay");
        cdac.put(104,"himanshu");
        cdac.put(105,"gaurav");
        cdac.put(106,"chandra");
        cdac.put(107,"ganesh");
        cdac.put(108,"rajan");
        cdac.put(109,"yash");
        cdac.put(110,"kolla");

        //set entries
        Set<Entry<Integer,String>> set=cdac.entrySet();
        
        Iterator<Entry<Integer,String>> i=set.iterator();
        while (i.hasNext()) 
        {  
            System.out.println(i.next());
            // Entry<Integer,String> e = i.next();
           // System.out.println("PRN: " + e.getKey()+" "+"name: "+e.getValue());
        }
        
       
    }    
}
