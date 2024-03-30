package q5;

public class demo5 {
    public static void main(String[] args) {
        
        try (MyResource mr = new MyResource(101)) 
        {
            mr.disp();
        
        } catch (ResourceNotAllocatedException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
    
}
