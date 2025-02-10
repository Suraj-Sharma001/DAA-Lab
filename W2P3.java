import java.util.Scanner;

public class W2P3 {

    public static int solve(int[] arr, int n, int key) {
        int count  = 0;
        for(int i = 0; i < n-1; i++) {
            for(int j = 1; j < n; j++) {
                if(arr[i] - arr[j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = solve(arr, n, key);
        System.out.println("Total occurance of pair is: " + ans);
        sc.close();
    }
}
