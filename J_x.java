class Recursion {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static void print(int n) {
        if (n == 0) {
            return;
        } else {
            print(n - 1);
        }
        System.out.println(n);
    }
}

public class J_x {
    public static void main(String[] args) {
        Recursion.print(10);
        System.out.println(Recursion.factorial(10));
        System.out.println(Recursion.fibonacci(10));        
    }
}
