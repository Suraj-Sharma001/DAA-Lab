package DAA;

import java.util.Random;
import java.util.Scanner;

public class W4P3 {

    // Function to partition the array
    static int partition(int[] arr, int low, int high) {
        Random rand = new Random();
        int pivotIndex = rand.nextInt(high - low + 1) + low;
        int pivot = arr[pivotIndex];

        // Swap pivot with the last element
        swap(arr, pivotIndex, high);

        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        // Place pivot in its correct position
        swap(arr, i, high);

        return i;
    }

    // QuickSelect function to find the Kth smallest element
    static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pi = partition(arr, low, high);

            if (pi == k - 1) {
                return arr[pi]; // Kth smallest element found
            } else if (pi > k - 1) {
                return quickSelect(arr, low, pi - 1, k); // Search in the left subarray
            } else {
                return quickSelect(arr, pi + 1, high, k); // Search in the right subarray
            }
        }
        return -1; // Kth element not found
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

            System.out.print("Enter K: ");
            int k = scanner.nextInt();

            if (k > n || k <= 0) {
                System.out.println("not present");
            } else {
                // Find Kth smallest element
                int kthSmallest = quickSelect(arr, 0, n - 1, k);
                System.out.println("Kth smallest element: " + kthSmallest);

                // Find Kth largest element
                int kthLargest = quickSelect(arr, 0, n - 1, n - k + 1);
                System.out.println("Kth largest element: " + kthLargest);
            }
        }

        scanner.close();
    }
}
