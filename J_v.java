import java.util.Scanner;

class Math {
    public static int square(int x) {
        return x * x;
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public static double square(double x) {
        return x * x;
    }

    public static double cube(double x) {
        return x * x * x;
    }
}

public class J_v {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an whole number: ");
        int a = scan.nextInt();
        System.out.print("Enter a floating number: ");
        double b = scan.nextDouble();
        System.out.println("Square of " + a + " = " + Math.square(a));
        System.out.println("Cube of " + a + " = " + Math.cube(a));
        System.out.println("Square of " + b + " = " + Math.square(b));
        System.out.println("Cube of " + b + " = " + Math.cube(b));
        scan.close();
    }
}
