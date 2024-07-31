
public class CompleteExampleOOP {
	//variables,methods, objects
	int num;
	void setVariable(int num) {//non return method
		this.num=num;//instance variable initialization
	}
	int getVariable() {//return type method:(i.e int)
		return num;//integer value return by function
	}
	int fibonacci(int n) {//recursive function
		if(n==0||n==1)
			return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	int factorial(int n) {//recursive function
		if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
	}
	public static void main(String[] args) {//main method
	//object creation or instantiation
	CompleteExampleOOP ceoop=new CompleteExampleOOP();
	ceoop.setVariable(5);
	System.out.println(ceoop.getVariable());
	System.out.println("Factorial of 5: "+ceoop.factorial(5));
	System.out.println("Fibonacci seruies upto 10 is ");
	for (int i=0;i<10;i++) {
		System.out.print(ceoop.fibonacci(i)+" ");
	}

	}

}
