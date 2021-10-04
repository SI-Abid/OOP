package Saiham;

final class Tag {
    public Tag() {
        System.out.println("I'm immutable");
    }
    public static void who() {
        System.out.println("Tag class");
    }
}
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

public class Main extends B {
    public static void main(String[] args) {
        
        // System.out.println("Hello World");
        // int limit = Trash.MAX;
        // int lower_bound = MIN;
        // System.out.println(CONST.MAX);
        // limit = limit + lower_bound;
        String name = "saiham";
        if(name=="saiham") {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
    public final static int MIN = -Trash.MAX;
}
