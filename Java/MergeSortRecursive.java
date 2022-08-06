import java.util.Scanner;

public class MergeSortRecursive {
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

        mergeSort(arr);
        System.out.println("Sorted array:");
        System.out.print(arr[0]);  // Assuming <code>len</code> is always greater than 0
        for (int i = 1; i < len; ++i) {
            System.out.print(" " + arr[i]);
        }
    }

    static void merge(int[] lArr, int[] rArr, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lArr.length && j < rArr.length) {
            if (lArr[i] < rArr[j]) {
                arr[k] = lArr[i];
                ++i;
            } else {
                arr[k] = rArr[j];
                ++j;
            }
            ++k;
        }

        // Only one of the following two while blocks will execute
        while (i < lArr.length) {
            arr[k] = lArr[i];
            ++i;
            ++k;
        }

        while (j < rArr.length) {
            arr[k] = rArr[j];
            ++j;
            ++k;
        }
    }

    static void mergeSort(int[] arr) {
        int len = arr.length;

        if (len < 2) return;

        int midIndex = len / 2;
        int[] lArr = new int[midIndex];
        int[] rArr = new int[len - midIndex];

        System.arraycopy(arr, 0, lArr, 0, midIndex);
        System.arraycopy(arr, midIndex, rArr, 0, len - midIndex);

        mergeSort(lArr);
        mergeSort(rArr);
        merge(lArr, rArr, arr);
    }
}
