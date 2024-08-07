package inheritance;
//Inheritance: IS-A must be matched e.g Subclass IS-A Super class
class Animal{
	public void eat() {
		System.out.println("I eat food");
	}
}
class Tiger extends Animal{
	public void roar() {
		System.out.println("Tiger hai tuu Roarrrrr.......");
	}
	@Override
	public void eat() {
		System.out.println("Masu khayegaaa apun");
	}
	
}
class Dog extends Animal{
	public void bark() {
		System.out.println("Kuttaa hai tu Bhawww bhaw.....");
	}
	@Override
	public void eat() {
		System.out.println("Apun dono masu aur bhat khayega.");
	
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog d= new Dog();
		Tiger t=new Tiger();
		d.bark();
		d.eat();
		t.roar();
		t.eat();
		

	}

}
