import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class q4 {
    public static void main(String[] args) {
        List<Integer> cowal = new CopyOnWriteArrayList<Integer>();
        cowal.add(10);
        cowal.add(20);
        cowal.add(30);

        Iterator<Integer> i = cowal.iterator();
        
        while (i.hasNext()){  
            System.out.println(i.next());
            cowal.add(50); 
        }
        System.out.println("*********************************");
        i =  cowal.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }  
    }
    
}
