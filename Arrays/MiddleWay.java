package Arrays;
import java.util.Scanner;

public class MiddleWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter 3 elements for first array:");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter 3 elements for second array:");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }

        int[] middle = { a[1], b[1] };

        System.out.println("Middle elements array:");
        for (int num : middle) {
            System.out.print(num + " ");
        }
    }
}
