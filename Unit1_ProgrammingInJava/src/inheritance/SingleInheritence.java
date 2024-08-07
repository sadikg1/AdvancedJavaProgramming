package inheritance;
class Room{
	int length, breadth;
	public Room() {//default constructor
		this.length=this.breadth=0;
		
		
	}
	public Room(int length, int breadth) {//parameterized constructor
		this.length=length;
		this.breadth=breadth;
		
	}
	int area() {
		return length*breadth;
		
	}
}
class BedRoom extends Room{//single inheritance
	int height;
	public BedRoom() {//default constructor
		this.height=0;
	}
	public BedRoom(int length, int breadth, int height) {
		super(length, breadth);//passes to base constructor
		this.height=height;//initialize
	}
	int volume() {
		return length*breadth*height;
	}
	
}
//Inheritance: It is a feature of OOP, which extends or pass the properties of super class automatically 
//or implicitly
//Super class and sub class- an object of sub class acquires the properties of object super class.

public class SingleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BedRoom broom= new BedRoom(5,4,6);
		int vol=broom.volume();
		int area= broom.area();
		System.out.println("Volume of bedroom is "+vol);
		System.out.println("Area of bedroom is "+area);
		

	}

}
