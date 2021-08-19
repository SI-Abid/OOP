import java.io.IOException;

class Final {
    int doom;
    Final() {
        doom=100;
    }
    void dooming() {
        System.out.println("Doooooooooooooom");
    }
    protected void finalize() {
        System.out.println("Finalizing dot dot");
    }
}

public class Mid {
    public static void main(String[] args) {
        final int age = 1000;
        try {
            System.out.println("ALways "+age+" years old.");
            demoException();
        } catch (Exception e) {
            //TODO: handle exception
        } finally {
            System.out.println("Always gets executed.");
        }
        Final f = new Final();
        f.dooming();
        f=null;
        System.gc();    //calling the moyla wala
    }
    public static void demoException() throws IOException {
        System.out.println("A");
    }
}