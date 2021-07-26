import java.util.Scanner;

class Searcher {
    public static void linearSearch(int[] array, int item) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item)
                pos = i;
        }
        if (pos == -1) {
            System.out.println("Item " + item + " not found");
        } else {
            System.out.println("Item " + item + " found at index " + pos);
        }
    }
    public static void binarySearch(int[] array, int item) {
        int low = 0;
        int high = array.length - 1;
        int pos = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == item) {
                pos = mid;
                break;
            } else if (array[mid] < item) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (pos == -1) {
            System.out.println("Item " + item + " not found");
        } else {
            System.out.println("Item " + item + " found at index " + pos);
        }
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j])
                    swap(array, i, j);
            }
        }
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
public class task {
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

        Searcher.linearSearch(array, item);
        Searcher.sort(array);
        Searcher.binarySearch(array, item);

        scan.close();
    }
    
}
