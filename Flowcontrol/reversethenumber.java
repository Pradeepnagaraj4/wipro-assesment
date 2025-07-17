package Flowcontrol;


import java.util.Scanner;

public class reversethenumber {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int sum=0;
     while(n!=0) {
    	 int rev=n%10;
    	 System.out.print(rev);
    	 n=n/10;
      }
	}
}