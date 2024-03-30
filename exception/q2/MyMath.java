package q2;

public class MyMath {
    public int disp(int num) throws NumberNotDivisibleBySevenException {
        if (num % 7 != 0) {
            throw new NumberNotDivisibleBySevenException("Number is not divisible by seven");
        } else 
            return num;
        
    }
}

