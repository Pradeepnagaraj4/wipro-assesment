package Flowcontrol;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int pal=0;
     while(n!=0) {
    	 int sum=n%10;
    	 pal=pal*10+sum;
    	 n=n/10;
     }
     if(pal==n) {
    	 System.out.println("It is a palindrome");
     }
     else {
    	 System.out.println("It is not a Palindrome");
     }
	}

}