package Arrays;
import java.util.*;

public class LargestSmallestTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Smallest two numbers: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest two numbers: " + arr[n - 2] + ", " + arr[n - 1]);
    }
}
