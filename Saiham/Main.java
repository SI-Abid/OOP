package Saiham;

class Trash {
    public final static int MAX = 1000000000;
}

interface CONST {

    public static int MAX = 2000000000;

    public void bodyLess();

}

class Body implements CONST {
    public void bodyLess() {
        System.out.println("Matha ekjagat\nBody arek jagat");
    }
}

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        int limit = Trash.MAX;
        int lower_bound = MIN;
        System.out.println(CONST.MAX);
        limit = limit + lower_bound;

    }
    public final static int MIN = -Trash.MAX;
}
