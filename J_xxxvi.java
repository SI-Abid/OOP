
class MyThread implements Runnable {

    Thread t;
    
    MyThread(String name) {
        t = new Thread(this, name);
        System.out.println("Child thread "+t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread -"+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");        
    }
    
}

public class J_xxxvi {

    public static void main(String[] args) {
        new MyThread("Child");

        // Thread t = Thread.currentThread();

        // t.setName("My thread");
        // System.out.println("Current thread: "+t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread - "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Exiting main thread");
    }
}
/*
Throwable
  |
  - Exception
  |     |
  |     - IOException
  |     - SQLException
  |     - ClassNotFoundException
  |     - RuntimeException
  |     |       |
  |     |       - ArithmaticException
  |     |       - NullPointerException
  |     |       - NumberFormatException
  |     |       - IndexOutOfBoundException
  |     |       |       |
  |     |       |       - ArrayIndexOutOfBoundException
  |     |       |       - StringIndexOutOfBoundException
  |     |       +
  |     +
  - Error

*/