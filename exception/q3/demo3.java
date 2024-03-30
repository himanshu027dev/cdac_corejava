package q3;

import java.util.*;
public class demo3 {
    public void show1()throws MyException{
        show2();
    }
    public void show2()throws MyException{
        show3();
    }
    public void show3() throws MyException{
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>10){
            throw new MyException("Input is too large");
        }else
        System.out.println("The input number is "+a);
    }

    public static void main(String[] args) throws MyException {
        demo3 d3 = new demo3();
        try{
            d3.show1();

        }catch(MyException mo){
            System.out.println(mo.getMessage());
        }
    }
    
}
