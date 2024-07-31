
public class WhyConstructor {
	int length, breadth;
//	void setData(int length, int breadth) {
//		this.length=length;
//		this.breadth=breadth;
//	}
//	void setData(int length) {
//		this.length=this.breadth=length;
//	}
	public WhyConstructor(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	WhyConstructor(int length) {
		this.length=this.breadth=length;
	}
	int Area() {
		return(length*breadth);
	}

	public static void main(String[] args) {
		WhyConstructor sq= new WhyConstructor(5);
		WhyConstructor rect= new WhyConstructor(5,10);
		System.out.println("Area of square = "+sq.Area());
		System.out.println("Area of a rectangle = "+rect.Area());
		

	}

}
