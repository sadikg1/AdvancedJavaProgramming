package firstLab;

import java.io.*;
class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SadikSerializationExample {

	public static void main(String[] args) {
		Person person = new Person("Sadik", 20);

        // Write object to file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"))) {
            out.writeObject(person);
            System.out.println("Object written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read object from file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"))) {
            Person readPerson = (Person) in.readObject();
            System.out.println("Object read from file: " + readPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

	}

}
