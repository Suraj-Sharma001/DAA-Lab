package DAA;
import java.util.Scanner;


public class W1P1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the key element to search: ");
            int key = sc.nextInt();

            int comparisons = 0;
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (arr[i] == key) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Present " + comparisons);
            } else {
                System.out.println("Not Present " + comparisons);
            }

            sc.close();
        }
    }
