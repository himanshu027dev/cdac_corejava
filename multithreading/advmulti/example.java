import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.*;
class myapp implements Runnable{
    
    ReentrantLock  ulock = new ReentrantLock(); 

    public void run(){
        
        perform();
        

    }
    void perform(){
        
            
            for(char aph = 'A';aph <= 'J';aph++){
                ulock.lock();
            System.out.println(aph +"\t"+ Thread.currentThread());         
            }ulock.unlock();
            
        
        
        
    
    }
  }


public class example {
    public static void main (String[] args){
        ExecutorService exec = Executors.newFixedThreadPool(2);
        for(int i = 0;i<2;i++){
            exec.execute(new myapp());
        }
        exec.shutdown();
        System.out.println("done");
    }
}