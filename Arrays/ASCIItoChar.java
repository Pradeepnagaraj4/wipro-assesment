package Arrays;
import java.util.Scanner;

public class ASCIItoChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] ascii = new int[n];

        System.out.println("Enter ASCII values:");
        for (int i = 0; i < n; i++) {
            ascii[i] = sc.nextInt();
        }

        System.out.println("Corresponding characters:");
        for (int val : ascii) {
            System.out.print((char) val + " ");
        }
    }
}
