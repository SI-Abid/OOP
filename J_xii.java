import java.util.Scanner;

class Clock extends Thread {
    private int hours, minutes;
    private String timeString = "00:00";
    public boolean running = true;
    private boolean paused = false;

    @Override
    public void run() {
        while (running) {
            if (!paused) {
                minutes++;
                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                    if (hours == 24) {
                        hours = 0;
                    }
                }
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timeString = String.format("%02d:%02d", hours, minutes);
            // System.out.println(Thread.currentThread().getId() + " -> " + hours + ":" + minutes);
        }
    }

    public String getTime() {
        return timeString;
    }
    
}

public class J_xii {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.print("Enter 1 to check time: ");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Time: " + clock.getTime());
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
        // Stop the current thread
        clock.running = false;
        scan.close();
    }
}
