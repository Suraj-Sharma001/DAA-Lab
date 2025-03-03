
import java.util.ArrayList;
import java.util.Scanner;

public class W5P3 {

    public static ArrayList<Integer> findCommon(int[] a1, int[] a2, int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if(a1[i] == a2[j]) {
                ans.add(a1[i]);
                i++;
                j++;
            } else if(a1[i] < a2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = findCommon(arr1, arr2, n, m);
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
