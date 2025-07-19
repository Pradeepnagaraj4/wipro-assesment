package Arrays;
import java.util.Scanner;

public class minmaxarray {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int max = arr[0], min = arr[0];

	        for (int num : arr) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }

	        System.out.println("Maximum = " + max);
	        System.out.println("Minimum = " + min);
	    }
	

}
