class mythread implements Runnable{
    static void disp(){
        synchronized(mythread.class)
		{
		for(int i=0;i<10;i++)
		{

System.out.println("static "+i+Thread.currentThread());
		
		}
		}
    }
        


    public void run(){
        disp();
    
        
    }
}

public class multithreading{
    public static void main(String[] args) {
         mythread m = new mythread();

        //creating object of the thread class
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        t1.setName("first");
        t2.setName("second");
        
        //starting the thread
        t1.start();
        t2.start();
        
    }

}