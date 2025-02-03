package DAA;
import java.util.Scanner;

public class W1P2 {

        public static void binarySearch(int[] arr, int key) {
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == key) {
                    System.out.println("Present ");
                    return ;
                } else if (arr[mid] < key) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            System.out.println("Not Present");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of elements in the sorted array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter the sorted array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the key element to search: ");
            int key = sc.nextInt();

            binarySearch(arr, key);

            sc.close();
        }
    }
