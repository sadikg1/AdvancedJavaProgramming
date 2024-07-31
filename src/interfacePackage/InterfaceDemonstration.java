package interfacePackage;
interface Student{
	int a=10 ;
	//Everything are same mentioned below
//	public static final int b=10;
//	public static int c=10;
//	public int d=10;
//	static int e=10;
//	final int f=10;
	
	void method1();//by default public abstract 
	public abstract void method2();
}
interface College extends Student{
	void method1();//allowed
//	int method1();//not allowed
	int a=50;
}
class Admin{//class extends class, class implements interface, interface extends interface
	
}
public  abstract class InterfaceDemonstration extends Admin implements Student,College {//if abstract is used method 2 need not to be mentioned in this class

	public static void main(String[] args) {
//		Student st= new Student();//not valid
		System.out.println("Student a: "+Student.a);
		System.out.println("College a: "+College.a);
	}

	@Override//indication that the method is already in the base class/intefrace
	public void method1() {
		System.out.println("This is method1");
		
	}

	

}
