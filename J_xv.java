class A {
    A() {
        System.out.println("Loading A...");
    }
    public void say() {
        System.out.println(this.toString().replaceAll("@", "(")+"): Hi");
    }
}
class B extends A {
    B() {
        System.out.println("Loading B...");
    }
}
class C extends B {
    C() {
        System.out.println("Loading C...");
    }
}
public class J_xv {
    public static void main(String[] args) {
        A a = new A();
        a.say();
        B b = new B();
        b.say();
        C c = new C();
        c.say();
    }
}
