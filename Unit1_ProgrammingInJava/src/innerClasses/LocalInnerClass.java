package innerClasses;
class LocalOuter{
//	int data=100;
	void methodLocal() {
		int data=100;
		class LocalInner{
			void print() {
				System.out.println("Data = "+data);
			}
			
		}
		LocalInner li= new LocalInner();
		li.print();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalOuter out =new LocalOuter();
		out.methodLocal();

	}

}
