package q1;
import java.util.*;
public class MyCalcApp {
    public static void main(String[] args) {
        calculator m =new calculator();
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int result=0;
        
        try
		{
			result=m.caldouble(a);
			System.out.println(result);
		}
		catch(MyArithException me)
		{
			System.out.println(me);
		}
		System.out.println("Done");
    }
    
}
