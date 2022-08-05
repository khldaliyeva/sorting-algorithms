import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i < len; ++i) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();  // Done with reading

        insertionSort(arr);
        System.out.println("Sorted array:");
        System.out.print(arr[0]);  // Assuming <code>len</code> is always greater than 0
        for (int i = 1; i < len; ++i) {
            System.out.print(" " + arr[i]);
        }
    }

    static void insertionSort(int[] arr) {
        int len = arr.length;
        for (int i = 1; i < len; ++i) {
            if (arr[i] > arr[i - 1]) continue;
            int toBeInserted = arr[i];
            arr[i] = arr[i - 1];
            int shiftCounter = 1;
            for (int j = i - 2; j >= 0; --j) {
                if (arr[j] > toBeInserted) {
                    arr[j + 1] = arr[j];
                    ++shiftCounter;
                }
            }
            arr[i - shiftCounter] = toBeInserted;
        }
    }
}
