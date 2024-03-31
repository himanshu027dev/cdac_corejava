interface second{
    void disp4();
}

public class q2 {
    public static void main(String[] args) {
        second s1 =()->{System.out.println("s1");};
        second s2 = ()->{ System.out.print("s2 ");};
        s1.disp4();
        s2.disp4();
    }
    
}
