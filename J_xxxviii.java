import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class J_xxxviii {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        File inFile = new File(sc.nextLine());

        try {
            
            Scanner read = new Scanner(inFile);
            FileReader reader = new FileReader(inFile);
            while(read.hasNext()) {

                System.out.println(read.nextLine());
                
            }
            read.close();
            
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            
            while(reader.ready()) {
                
                System.out.print((char)reader.read());

            }
            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }

}
