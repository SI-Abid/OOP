/**
 * J_xx
 */
public class J_xx {

    public static void main(String[] args) {
        for (int i = 3; i < 10000; i*=3) {
            System.out.println(i + " = " +Integer.toBinaryString(i)+"(2)");
            System.out.println(i + " = " +ternary(i)+"(3)");
        }
    }
    public static String ternary(int x)
    {
        String t= "";
        while(x!=0)
        {
            t+= Integer.toString(x%3);
            x/=3;
        }
        // reverse t 
        StringBuilder sb = new StringBuilder(t);
        sb.reverse();
        return sb.toString();
    }
}