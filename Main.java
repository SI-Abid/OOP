import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        
        Scanner scan = new Scanner(System.in);

        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        
        scan.nextLine();                    // skip newline 
        String str = scan.nextLine();

        int sum = a + b;
        int mul = a * b;

        System.out.println("sum = " + sum);
        System.out.println("mul = " + mul);
        System.out.println("str = " + str);

        scan.close();
    }
}
