package exceptionPack;

import java.util.InputMismatchException;
import java.util.Scanner;

class Division{
	public static int divide(int num, int deno){
		return num/deno;
	}
}

public class ConceptOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int d,n;
		boolean proceed =true;
		do {
			try {
				System.out.println("Enter the numerator: ");
				n=input.nextInt();
				System.out.println("Enter the denominator: ");
				d=input.nextInt();
				System.out.println("The result of "+n+" divided by "+d+" is: "+Division.divide(n, d));
				proceed=false;
			}
			catch(InputMismatchException ex) {
				System.err.println("Exception is "+ex);
				input.nextLine();
				System.out.println("Enter proper data");
			}
			catch (ArithmeticException ex) {
				System.err.println("Exception is "+ex);
				System.out.println("Enter non-zero denominator");
			}
		}while(proceed);

	}

}
//Exception is an unusual behavior in a program that halts the program.
