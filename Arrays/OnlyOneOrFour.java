package Arrays;
import java.util.Scanner;

public class OnlyOneOrFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        boolean only14 = true;

        for (int num : arr) {
            if (num != 1 && num != 4) {
                only14 = false;
                break;
            }
        }

        System.out.println("only1or4 = " + only14);
    }
}
