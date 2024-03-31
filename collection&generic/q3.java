import java.util.*;
public class q3 {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        ((LinkedList<Integer>)l).addFirst(500);
        l.add(1,400);
        ((LinkedList<Integer>)l).addLast(1000);

        ListIterator<Integer> li = l.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }


    }

    
}
