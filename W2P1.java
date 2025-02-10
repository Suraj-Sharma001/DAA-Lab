import java.util.Scanner;

public class W2P1 {

    public static int findKey(int[] arr, int n, int key){
        int st =  0;
        int end = n-1;
        int count = 0;
        int ans = -1;

        while(st <= end) {
            int mid = st+(end-st)/2;
            if(arr[mid] == key) {
                ans = mid;
                count++;
                for(int i = mid-1; i >= 0; i--) {
                    if(arr[i] == key) {
                        count++;
                    } else {
                        break;
                    }
                }
                for(int i = mid+1; i < n; i++) {
                    if(arr[i] == key) {
                        count++;
                    } else {
                        break;
                    }
                }
                break;
            } else if(arr[mid] > key) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }

        if(ans == -1) {
            System.out.println("Key not found");
            return -1;
        }
        System.out.println("Total occurance of key is: " + count);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int ans = findKey(arr, n, key);
        System.out.println("Key found at index: "+ ans);
        sc.close();
    }
}
