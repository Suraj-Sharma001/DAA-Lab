package DAA;

import java.util.Scanner;

public class W3P2 {

    public static void selectionSort(int[] arr, int n) {
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                    cnt++;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("Total comparsion are: "+ cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr, n);
        for(int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}

