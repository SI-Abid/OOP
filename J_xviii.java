import java.util.Scanner;

class Triagle {
    static void drawDownwardPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            int j = 3*i-3;
            while(j-- > 0) {
                System.out.print(" ");
            }
            int k = i;
            while(k<n)
                System.out.printf("%2d ", k++);

            while(k>i-1)
                System.out.printf("%2d ", k--);
    
            System.out.println();
        }
    }
}

public class J_xviii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Triagle.drawDownwardPyramid(n);
        scanner.close();
    }
}
