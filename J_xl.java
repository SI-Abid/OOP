class Dropper implements Runnable {
    int interval, duration;
    Thread t;
    public Dropper(String name, int interval, int duration) {
        this.interval = interval;
        this.duration = duration;
        t = new Thread(this, name);
        t.start();
    }
    public void run() {
        for(int i = 0; i < (duration*12)/interval; i++) {
            try {
                System.out.println("Time for: "+t.getName()+" "+Clock.getTime());
                Thread.sleep(toMs(interval));
            }
            catch(InterruptedException e) {
                System.out.println("Dropper interrupted");
            }
        }
        System.out.println(t.getName()+" finished");
    }
    int toMs(int interval) {
        return interval * 5000;
    }
}

public class J_xl {
    // create a new J_xl method
    public static void main(String[] args) {
        try {
            
            Clock clock = new Clock();
            clock.setDaemon(true);
            clock.start();
            new Dropper("Drop 1",2,4);
            Thread.sleep(2000);
            new Dropper("Drop 2",4,4);
            Thread.sleep(2000);
            new Dropper("Drop 3",6,4);
            Thread.sleep(2000);
            new Dropper("Drop 4",12,4);
        }
        catch(IllegalThreadStateException e) {
            System.out.println("Dropper already finished");
        }
        catch(InterruptedException e) {
            System.out.println("Dropper interrupted");
        }
    }
}