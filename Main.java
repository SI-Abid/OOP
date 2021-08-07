import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        int asum = 0, bsum = 0;
        for (int i = 0; i < n; i++) {
            asum += a[i];
            bsum += b[i];
        }
        System.out.println(abs(asum - bsum));
        scan.close();
    }
    static int abs(int a) {
        return a < 0 ? -a : a;
    }
}