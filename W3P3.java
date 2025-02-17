package DAA;

import java.util.Arrays;
import java.util.Scanner;

public class W3P3 {

    public static boolean findDuplicate(int[] arr, int n) {
        Arrays.sort(arr);  // nlogn

        for(int i = 1; i < n; i++) {  // n
            if(arr[i] == arr[i-1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = findDuplicate(arr, n);
        if(ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
