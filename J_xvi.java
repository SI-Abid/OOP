import java.util.Scanner;

class Number {
    int num;
    Number(int num) {
        this.num = num;
    }
    public String toString() {
        return Integer.toString(num);
    }
    public String toBinary() {
        return Integer.toBinaryString(num);
    }
    public String toOctal() {
        return Integer.toOctalString(num);
    }
    public String toHex() {
        return Integer.toHexString(num);
    }
    public int toDecimal() {
        return num;
    }
}

public class J_xvi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        Integer num = scan.nextInt();
        Number n = new Number(num);
        System.out.println("The number " + n + " in decimal is " + n.toDecimal());
        System.out.println("The number " + n + " in binary is " + n.toBinary());
        System.out.println("The number " + n + " in octal is " + n.toOctal());
        System.out.println("The number " + n + " in hex is " + n.toHex());
        
        Integer num2 = Integer.parseInt("A2Z", Character.MAX_RADIX);
        System.out.println("Decimal value of A2Z in base 36 is: "+num2);
        
        scan.close();
    }
}
