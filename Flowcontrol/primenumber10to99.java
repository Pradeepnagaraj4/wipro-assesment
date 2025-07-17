package Flowcontrol;

public class primenumber10to99 {
         public static void main(String args[]) {
        	 for(int i=10;i<=99;i++) {
        		 boolean isprime=true;
        		 for(int j=2;j<Math.sqrt(i);j++) {
        			 if(i%j==0) {
        				 isprime=false;
        				 break;
        			 }
        		 }
        		 if(isprime) {
        			 System.out.print(i + " ");
        		 }
        	 }  
         }
}