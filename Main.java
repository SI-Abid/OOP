import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + 1 + ": ");
            array[i] = scan.nextInt();
        }
        System.out.print("Enter your item to be searched: ");
        int item = scan.nextInt();
        int pos = -1;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] == item)
                pos = i;
        }
        if (pos == -1) {
            System.out.println("Item " + item + " not found");
        } else {
            System.out.println("Item " + item + "found at index " + pos);
        }
        scan.close();
    }
}
