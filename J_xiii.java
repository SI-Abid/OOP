class std {
    public static void printf(String ... args) {
        System.out.println(String.join(" ", args));
    }
    public static void printf(Integer ... args) {
        String[] strings = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            strings[i] = args[i].toString();
        }
        System.out.println(String.join(" ", strings));
    }
    public static void printf(Double ... args) {
        String[] strings = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            strings[i] = args[i].toString();
        }
        System.out.println(String.join(" ", strings));
    }
    public static void printf(Boolean ... args) {
        String[] strings = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            strings[i] = args[i].toString();
        }
        System.out.println(String.join(" ", strings));
    }
}
public class J_xiii {
    public static void main(String[] args) {
        std.printf("Hello", "World");
        std.printf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        std.printf(1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1);
        std.printf(true, false, true, false, true, false, true, false, true, false);        
    }
}
