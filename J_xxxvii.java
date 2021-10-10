import java.util.ArrayList;

public class J_xxxvii {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        
        for (String s : args) {
            list.add(Integer.parseInt(s));
        }
        for (Integer i : list) {
            System.out.println(i);
        }

    }
    
    public static int[] arrayOfSum(int[] a) {
        
        int[] b={0};
        for(int i=1; i<=a.length; i++) {
            b[i]= b[i-1]+a[i-1];
        }
        return b;
    }
    public static String reverse(String text) {
        
        String[] str = text.split(" ");
        // ArrayList<String> list = new ArrayList<>( Arrays.asList(str));
        text = str[str.length-1];
        // return String.join(" ", str);
        for (int i = str.length-2; i >= 0; i--) {
            text += " " + str[i]; 
        }
        return text;
    }

    public static int log2(int x) {
        int y=0;
        while(x>1) {
            x>>=1;
            y++;
        }
        return y;
    }
}
