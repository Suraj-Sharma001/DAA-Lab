import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class W5P2 {

    public static void twoSum(int[] arr, int n, int key, ArrayList<Integer> ans) {
        // Arrays.sort(arr);   // nlogn
        // int i = 0;
        // int j = n-1;
        // while(i <= j) {   // n
        //     int sum = arr[i] + arr[j];
        //     if(sum == key) {
        //         ans.add(arr[i]);
        //         ans.add(arr[j]);
        //         return;
        //     } else if(sum > key) {
        //         j--;
        //     } else {
        //         i++;
        //     }
        //  }
        //  System.out.println("Element not found!!");

         // Using Map data structure
         Map<Integer, Integer> mp = new HashMap<>();
         for(int i = 0; i < n; i++) {
            int comp = key - arr[i];
            if(mp.containsKey(comp)) {
                ans.add(comp);
                ans.add(arr[i]);
                return;
            }

            mp.put(arr[i], i);
         }
        System.out.println("Element not found!!"); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        twoSum(arr, n, key, ans);
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
