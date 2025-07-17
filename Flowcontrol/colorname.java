package Flowcontrol;
import java.util.Scanner;
public class colorname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       char c=sc.next().charAt(0);
       switch (c) {
       case 'r':
    	   System.out.println("red");
    	   break;
       case 'b':
    	   System.out.println("blue");
    	   break;
       case 'g':
    	   System.out.println("green");
    	   break;
       case 'o':
    	   System.out.println("orange");
    	   break;
       case 'y':
    	   System.out.println("yellow");
    	   break;
       case 'w':
    	   System.out.println("white");
    	   break;
       default:
    	   System.out.println("invalid code");
       }
       
	}

}