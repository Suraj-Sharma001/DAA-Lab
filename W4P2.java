package DAA;

import java.util.Random;
import java.util.Scanner;

public class W4P2 {

    static int comparisons = 0;
    static int swaps = 0;

    // Partition function
    static int partition(int[] arr, int low, int high) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        int pivot = arr[pivotIndex];

        // Swap pivot with the last element
        swap(arr, pivotIndex, high);
        swaps++;

        int i = low - 1;
        for (int j = low; j < high; j++) {
            comparisons++;
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                swaps++;
            }
        }

        // Place pivot in its correct position
        swap(arr, i + 1, high);
        swaps++;

        return i + 1;
    }

    // QuickSort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Utility function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.print("Enter size of array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Reset counters
            comparisons = 0;
            swaps = 0;

            // Perform QuickSort
            quickSort(arr, 0, n - 1);

            // Output results
            System.out.print("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Number of comparisons: " + comparisons);
            System.out.println("Number of swaps: " + swaps);
        }

        scanner.close();
    }
}
