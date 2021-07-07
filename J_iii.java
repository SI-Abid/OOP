import java.util.Scanner;
/**
 * this
 * is
 * a
 * comment
 */
public class J_iii {
    public static void main(String[] args) {
        
        System.out.println("Hello world");

        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("(inside for loop) Iteration number "+(i+1));
        }
        while (n-->0) {
            System.out.println("(inside while loop) Reverse iteration: "+n);
        }

        scan.close();
    }
}
