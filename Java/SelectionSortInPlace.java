import java.util.Scanner;

public class SelectionSortInPlace {
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
        for (int i = 0; i != arr.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j != arr.length; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (arr[i] == arr[minIndex]) continue;

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
