class Confuser {
    String name = null;
}
public class J_xxvii {
    public static void main(String[] args) {
        Confuser a,b,c;
        a = new Confuser();
        b = new Confuser();
        c = new Confuser();
        System.out.println(a+" "+b+" "+c);
        
        b=a;    // b is a reference to a
        a=b;    // a is a reference to b which is a reference to a
        c=a;    // c is a reference to a which is a reference to b which is a reference to a
        // a b c all are a reference to the same object which is a
        System.out.println(a+" "+b+" "+c);
    }
}
