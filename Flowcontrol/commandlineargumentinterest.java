package Flowcontrol;

public class commandlineargumentinterest {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("invalid");
		}
		// TODO Auto-generated method stub
	 
     int age=Integer.parseInt(args[1]);
     if(args[0].equalsIgnoreCase("female") && (age >= 1 && age <= 52)) {
    	 System.out.println("The percentage of interest is 8.2%");
     }
     else if(args[0].equalsIgnoreCase("female") && (age >= 59 && age <= 100)) {
    	 System.out.println("The percentage of interest is 9.2%");
     }
     else if(args[0].equalsIgnoreCase("male") && (age >= 1 && age <= 52)) {
    	 System.out.println("The percentage of interest is 8.4%");
     }
     else if(args[0].equalsIgnoreCase("male") && (age >= 59 && age <= 100)) {
    	 System.out.println("The percentage of interest is 9.2%");
     }
     else {
    	 System.out.println("invalid");

      }
	}
}