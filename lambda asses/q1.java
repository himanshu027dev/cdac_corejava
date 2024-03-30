class Display {
    // Method to display values from 1 to 10
    public void disp() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100); // Sleep to simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class q1 {
    public static void main(String[] args) {
        // Create an instance of the Display class
        Display display = new Display();

        // Create two threads with a Runnable implementation using lambda expressions
        Thread thread1 = new Thread(() -> {
            synchronized (display) { // Synchronize on the display object to prevent interference
                display.disp();
            }
        }, "Thread 1");

        Thread thread2 = new Thread(() -> {
            synchronized (display) { // Synchronize on the display object to prevent interference
                display.disp();
            }
        }, "Thread 2");

        // Start both threads
        thread1.start();
        thread2.start();
    }
}
