package exceptionPack;

import java.util.Scanner;

//Exception class is the parent class for all the sub exception class
class AgeException extends Exception{//custom Exception
	public AgeException(String message) {
		super(message);
	}
}
public class CustomException {
	static boolean proceed=true;
	public static void myAge(int age) throws AgeException{
		if (age<=0) {
			throw new AgeException("Age less than Zero Exception");
		}
		else {
			System.out.println("Valid Age");
			proceed=false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		do {
			System.out.println("Enter your age: ");
			int age=input.nextInt();
			try {
				myAge(age);
				
			}
			catch(AgeException ex) {
				System.err.println("Exception is "+ex);
				System.out.println("Enter proper data");
			}
			finally {
				System.out.println("I always execute");
				//finally always executed but if the program is terminated forcefully using System.exit(0);
				//it is not excuted
				}
		}while(proceed);
		
		
		

	}

}
