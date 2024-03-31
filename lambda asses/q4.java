interface Calculator{
    public int multiply(int a,int b);

}
public class q4 {
    public static void main(String[] args) {
        Calculator cal =(int a,int b)->{return a*b;};
        System.out.println("result"+" "+cal.multiply(3, 4));    
    }
}
