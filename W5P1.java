import java.util.Arrays;
import java.util.Scanner;

public class W5P1 {

    public static void conntingSort(int[] arr, int n) {
        int maxVal = Arrays.stream(arr).max().getAsInt();
        int minVal = Arrays.stream(arr).min().getAsInt();

        int[] count = new int[maxVal - minVal + 1];

        for (int num : arr) {
            count[num - minVal] += 1;
        }

        int maxFreq = 0;
        int maxFreqElement = arr[0];

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i + minVal;
                index++;

                // Track the element with the maximum frequency
                if (count[i] > maxFreq) {
                    maxFreq = count[i];
                    maxFreqElement = i + minVal;
                }

                count[i]--;
            }
        }

        System.out.println("Element with maximum frequency: " + maxFreqElement + " (Frequency: " + maxFreq + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        conntingSort(arr, n);
        for(int i : arr) {
            System.err.println(i + " ");
        }
    }
}
