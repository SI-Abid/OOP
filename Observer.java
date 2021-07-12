import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Observer {
    public static void main(String[] args) {
        File file = new File("report.txt");
        Scanner scanner = new Scanner(System.in);
        try {
            if(file.createNewFile()) {
                System.out.println("File created.");
            }
            FileWriter fw = new FileWriter(file, true);
    
            String dateString = "\n\t\tDate: " + new java.util.Date();
            fw.write(dateString+"\n\n");
            
            System.out.print("Enter your full-name: ");
            String name = scanner.nextLine();
            
            fw.write("\t\tAuthor: "+name+"\n\n");

            // input string unless it is null
            System.out.println(" ---- Enter your message below ---- ");
            while(true) {
                String line = scanner.nextLine();
                
                if(line.equals(""))  break;
                
                fw.write(line+"\n");
            }
            
            scanner.close();
            fw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
