import java.util.Scanner;

public class J_xii {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Scanner scan = new Scanner(System.in);
        clock.start();
        while(true) {
            System.out.print("Enter 1 to check time: ");
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("Time: " + Clock.getTime());
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
