package DAA;

import java.util.Scanner;

public class W3P1 {

    public static void insertionSort(int[] arr, int n) {
        int cnt = 0;
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key) {
                cnt++;
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Total comparsion are: " + cnt);
    }

    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr, n);
        for(int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}