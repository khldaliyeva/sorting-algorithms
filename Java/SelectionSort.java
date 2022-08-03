import java.util.Scanner;

public class SelectionSort {
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

        selectionSort(arr);
        System.out.println("Sorted array:");
        System.out.print(arr[0]);  // Assuming <code>len</code> is always greater than 0
        for (int i = 1; i != len; ++i) {
            System.out.print(" " + arr[i]);
        }
    }

    static void selectionSort(int[] arr) {
        int len = arr.length;
        int[] tempArr = new int[len];
        for (int i = 0; i != len; ++i) {
            int minIndex = 0;
            for (int j = 1; j != len; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            tempArr[i] = arr[minIndex];
            arr[minIndex] = Integer.MAX_VALUE;
        }

        System.arraycopy(tempArr, 0, arr, 0, len);
    }
}
