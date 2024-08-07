package inheritance;
abstract class Car{
	final int wheels=4;
	public Car() {
		System.out.println("This is car Constructor");
	}
	public void vehicleType() {
		System.out.println("Type:Car");
	}
}
abstract class Honda extends Car{
	public Honda() {
		System.out.println("This is Honda Constructor");
	}
	public void brand() {
		System.out.println("Brand:Honda");
	}
	public void speed() {
		System.out.println("Capacity: 100 km/hr");
	}
}
class HondaCivic extends Honda{
	public HondaCivic() {
		System.out.println("This is HondaCivic Constructor");
	}
	@Override//Identification for the overridden method
	public void speed() {//method overridden
		System.out.println("Capacity: 150 km/hr");
	}
	
}
public class MultiLevel {

	public static void main(String[] args) {
		HondaCivic hc=new HondaCivic();
		System.out.println("Wheels= "+hc.wheels);
		hc.vehicleType();
		hc.brand();
		hc.speed();


	}

}
