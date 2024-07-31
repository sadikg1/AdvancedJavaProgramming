import java.util.Scanner;
public class OOPConcept {//Class
	//variable
	int a;//instance variable
	static int b;
	void display() {//member function-bind with object
		System.out.println(a);
	}
	static void test() {
		System.out.println("Test Only");
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
//		OOPConcept obj= new OOPConcept();
//		obj.a=20;
//		b=30;//static-no objects are required to access
//		obj.display();//function call
//		test();
		 
		 System.out.print("Enter the number to find factorial: ");
		 int a=input.nextInt();
	     Factorial fobj = new Factorial();
	     System.out.println("Factorial of "+a+" is: "+fobj.Fact(a));
		

	}

}
