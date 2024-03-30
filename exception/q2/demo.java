package q2;

public class demo {
    public static void main(String[] args) {
        MyMath math = new MyMath();
        try {
           System.out.println(math.disp(14)) ; // Example number, change as needed
        } catch (NumberNotDivisibleBySevenException e) {
            System.out.println(e.getMessage());
        }
    }
}

