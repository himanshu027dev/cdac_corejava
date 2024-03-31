import java.util.*;
public class q1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> listnum = new ArrayList<>();
        Scanner s =new Scanner(System.in);
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            int num =s.nextInt();
            listnum.add(num);
        }
        ListIterator<Integer> itr=listnum.listIterator();
        //forward iteration
        System.out.println("Numbers in forward direction:");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(); 

        // Backward iteration
        System.out.println("Numbers in backward direction:");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }

    
}
