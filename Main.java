import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] words = line.split("");
        for (String string : words) {
            System.out.println(string);
        }
        int i=0;
        do {
            i++;
        }while(i<10);
        in.close();
    }
}
// +s.substring(1)