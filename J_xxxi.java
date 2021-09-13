
class Super {
    int val;
    String loc;
    void show() {
        System.out.println("Oh no! a duplicate??");
    }
}

interface InterJ {
    void show(String s);
    void show();
    String Author = "Saiham Islam";
}

interface InterK {
    void sum(int a, int b);
}

class TestClass extends Super implements InterJ, InterK {
    public void show() {
        System.out.println("Hello World is shown");
    }
    public void show(String s) {
        System.out.println(s+" is shown");
    }
    public void sum(int n, int m) {
        System.out.println("Sum is "+(n+m));
    }
}

public class J_xxxi {
    public static void main(String[] args) {

        TestClass tc = new TestClass();

        tc.show();      // superclass show is overridden by subclass show()
        tc.sum(10,20);
        
    }
}
