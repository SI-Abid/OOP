public class Clock extends Thread {
    private int hours, minutes;
    private static String timeString = "00:00";
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

    public static String getTime() {
        return timeString;
    }
}