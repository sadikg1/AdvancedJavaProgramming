package innerClasses;
class Outer1{
	private static int data=50;
	static class Inner1{//member class of outer class
		void access() {
			System.out.println("THe data of outer class is "+data);
		}
	}
}

public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1.Inner1 inner=new Outer1.Inner1();
		inner.access();

	}

}
