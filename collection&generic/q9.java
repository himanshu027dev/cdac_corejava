import java.io.*;
import java.util.*;
import java.lang.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> iccrank = new HashMap<>();
        for(int i=1;i<=5;i++){
            String s;
            System.out.println("Type the name of" +"  "+ i+"  "+"rank Player");
            s=sc.nextLine();
            iccrank.put(i,s);
        }
        System.out.println("enter rank to see the name");
        int j;
        j=sc.nextInt();
        if(!iccrank.containsKey(j)){
            System.out.println("only top 5 avaliable ");
        }else{
            System.out.println("The player is: "+iccrank.get(j));
        }
    }
        
        
}
