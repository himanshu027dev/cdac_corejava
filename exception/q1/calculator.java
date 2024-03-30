package q1;
public class calculator {
    

    public int caldouble(int i)throws MyArithException{
        if(i==0){
            throw new MyArithException("ZERO NOT ALLOWED");
        }
        else if(i<1){
            throw new MyArithException("Value is less than 0");
        }
        
        return 2*i;
     
    }
    
    
}
