package Arrays;
import java.util.Scanner;

public class EvenOddReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int idx = 0;
        // Add even numbers first
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) result[idx++] = arr[i];
        }
        // Then odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) result[idx++] = arr[i];
        }

        System.out.print("Reordered array: ");
        for (int num : result) System.out.print(num + " ");
    }
}
