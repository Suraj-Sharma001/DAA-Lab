package DAA;

import java.util.Scanner;

public class W1P3 {

    public static void jumpSearch(int[] arr, int key) {
        int n = arr.length;

        if (n == 0)
            return ;

        int i = 1;
        while (i < n && arr[i] < key)
            i *= 2;

        int left = i / 2;
        int right = Math.min(i, n - 1);

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key) {
                System.out.println("Found");
                return;
            } else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
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

        jumpSearch(arr, key);

        sc.close();
    }
}
