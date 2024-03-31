interface MyInterface{
    void fun();
}

public class q3 {
    static <T extends MyInterface> void perform(T ref) {
        ref.fun();
    }
    public static void main(String[] args) {
        MyInterface  obj2 = () -> System.out.println("Inside Interface obj2");
        MyInterface  obj1 = () -> System.out.println("Inside Interface obj1");
    
        perform(obj1);
        perform(obj2);
                // You can also directly pass lambda expressions without assigning them to variables

                
        perform(() -> System.out.println("Performing third operation"));
    }

}
