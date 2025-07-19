package Arrays;
import java.util.Scanner;

public class WithoutTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 10) {
                result[index++] = arr[i];
            }
        }

        System.out.print("Output: ");
        for (int num : result) System.out.print(num + " ");
    }
}
