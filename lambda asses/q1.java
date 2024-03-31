interface First{
    void disp1();
    default void disp2(){
        System.out.println( "This is the default method of First interface" );
    }
    static void disp3(){
        System.out.println("static");
    } 
}
public class q1 {
    public static void main (String[] args){
        First f1 = ()->{};
        f1.disp1();
        f1.disp2();
        First.disp3();
    }
    
}
