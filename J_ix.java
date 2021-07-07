import java.util.Scanner;

public class J_ix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome to java programming, "+name);
        scan.close();
    }
}
