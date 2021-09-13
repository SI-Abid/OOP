
class Myclass {
    
    int a = 10;

    void show() {
        System.out.println("Hello World");
    }

    String alter(String in)
    {
        String out="";
        for (int i = 0; i < in.length(); i++) {
            if(!Character.isAlphabetic(in.charAt(i)))
            {
                out+=in.charAt(i);
                continue;
            }    
            if(Character.isUpperCase(in.charAt(i)))
                out+=(char)((in.charAt(i)-'A'+13)%26+'A');
            else
                out+=(char)((in.charAt(i)-'a'+13)%26+'a');
        }
        return out;
    }

}


public class J_xxx {
    public static void main(String[] args) {

        String a, b;
        a = "Hello World";
        b = "abcdefg ABCDEFG";
        Myclass m = new Myclass();
        System.out.println("Input");
        System.out.println(a);
        System.out.println("\nOutput");
        System.out.println(m.alter(a));
        System.out.println("\nInput");
        System.out.println(b);
        System.out.println("\nOutput");
        System.out.println(m.alter(b));
    }
}
