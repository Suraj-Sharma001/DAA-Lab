import java.util.ArrayList;
import java.util.Scanner;

public class W2P2 {

    public static ArrayList<Integer> solve(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n-2; i++) {
            for(int j = 1; j < n-1; j++) {
                for(int k = 2; k < n; k++) {
                    if(arr[i] + arr[j] == arr[k]) {
                        ans.add(i);
                        ans.add(j);
                        ans.add(k);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = solve(arr, n);
        for(int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        sc.close();
    }
}
