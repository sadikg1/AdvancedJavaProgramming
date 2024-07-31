package innerClasses;
class A{
	static final int a;//if final variable is not initialized then it can be initialized through the constructor or within a ststic block
//	A(){
//		a=30;
//	}
	//or
	static{//static block
		a=30;
	}
}
class B extends A{
	
	
}
//1. Final Class cannot be inherited or subclassed
//2. final method cannot be override
//3. once the final variable is assigned that cannot be modified re-assigned and must be initialized at the time of declaration 
//4. if final variable is not initialized then it can be initialized through the constructor or within a static block
public class FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
