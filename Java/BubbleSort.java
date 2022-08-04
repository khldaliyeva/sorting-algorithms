import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        System.out.println("Enter " + len + " elements:");
        for (int i = 0; i != len; ++i) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();  // Done with reading

        bubbleSort(arr);
        System.out.println("Sorted array:");
        System.out.print(arr[0]);  // Assuming <code>len</code> is always greater than 0
        for (int i = 1; i != len; ++i) {
            System.out.print(" " + arr[i]);
        }
    }

    static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i != len - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j != len - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
