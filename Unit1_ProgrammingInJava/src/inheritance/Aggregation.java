package inheritance;
class Address{
	String province, city, country;
	public Address(String province,String city,String country) {
		this.province=province;
		this.city=city;
		this.country=country;
	}
	
}
class Student{
	Address add;
	String name;
	int id;
	public Student(String name, int id, Address add){
		this.name=name;
		this.id=id;
		this.add=add;
	}
	public String displayInfo() {
		return ("The Student name is "+this.name+" of id "+this.id+" is from City "+this.add.city +" Province "+this.add.province+ " Country "+this.add.country);
	}
	
}
class Employee{
	Address add;
	String name;
	int id;
	public Employee(String name, int id, Address add){
		this.name=name;
		this.id=id;
		this.add=add;
	}
	public String displayInfo() {
		return ("The Employee name is "+this.name+" of id "+this.id+" is from City "+this.add.city +" Province "+this.add.province+ " Country "+this.add.country);
	}
	
}
//alt+shft+y
public class Aggregation {//Aggregation has a Has-A relationship

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add=new Address("Bagmati","Lalitpur","Nepal");
		Student std=new Student("Rajan KC",10, add);
		Employee emp=new Employee("Ram Thapa",12,add);
		System.out.println(emp.displayInfo());
		System.out.println(std.displayInfo());

	}

}
