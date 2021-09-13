
interface IF {
    void whereAmI();
    void whoAmI();
}

abstract class first implements IF {
    public void whereAmI() {
        System.out.println("At home");
    }
}
/**
 * cant make object of interface or abstract class
 * so a normal class is needed
 */
class Child extends first {
    public void whoAmI() {
        System.out.println("Java coder");
    }
    void nonIface() {
        System.out.println("Callable by Child object");
    }
}

public class J_xxxii {
    public static void main(String[] args) {
        
        IF iface = new Child();

        iface.whereAmI();
        iface.whoAmI();
        // iface.nonIface();   // not callable

        Child c = new Child();

        c.nonIface();
        c.whereAmI();
        c.whoAmI();
        
    }
}
