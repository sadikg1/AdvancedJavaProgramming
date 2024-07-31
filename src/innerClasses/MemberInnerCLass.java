package innerClasses;
class OuterClass{
	private int data=50;
	class Inner{//member class of outer class
		void access() {
			System.out.println("THe data of outer class is "+data);
		}
	}
}
public class MemberInnerCLass {
	public static void main(String[] args) {
		OuterClass out=new OuterClass();
		OuterClass.Inner in=out.new Inner();
		in.access();

	}

}
