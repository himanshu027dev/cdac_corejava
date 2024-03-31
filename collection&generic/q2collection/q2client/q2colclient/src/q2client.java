import devpack.q2dev;
public class q2client{
    public static void main(String[] args) {
        q2dev<String> d = new q2dev<>();
        d.setAnytype("gello");
        System.out.println("Value of x: " + d.getAnytype()); // 10
        System.out.println("dev object ="+d);
    }
}