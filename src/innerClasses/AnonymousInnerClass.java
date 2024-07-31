package innerClasses;
abstract class Anonymous{
	public abstract void display();//signature
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
//		How to use abstract Anonymous class
		Anonymous an= new Anonymous() {	
			@Override
			public void display() {
				System.out.println("This is a method of Anonymous Class");
				
			}
		};
		an.display();
		Anonymous an1= new Anonymous() {	
			@Override
			public void display() {
				System.out.println("This is a method of second Anonymous Class");
				
			}
		};
		an1.display();

	}

}
