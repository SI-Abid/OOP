package Saiham;

public class OverloadTest {
    public static void main(String[] args) {
        
        print();
        print("Saiham");
        print("Munni",5);
        
    }
    public static void print() {
        System.out.println("Hello World");
    }
    public static void print(String name) {
        System.out.println("Hello "+name);
    }
    public static void print(String name, int count) {
        while(count-->0){
            System.out.println("Hello "+name);
        }
    }
}
