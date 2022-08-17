import java.util.Scanner;

public class QuickSort {
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

        quickSort(arr, 0, len - 1);
        System.out.println("Sorted array:");
        System.out.print(arr[0]);  // Assuming <code>len</code> is always greater than 0
        for (int i = 1; i < len; ++i) {
            System.out.print(" " + arr[i]);
        }
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pIndex = start;
        for (int i = start; i < end; ++i) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;

                ++pIndex;
            }
        }

        int temp = arr[pIndex];
        arr[pIndex] = pivot;
        arr[end] = temp;

        return pIndex;
    }
}
