package innerClasses;

public class InstanceCounter {

	private static int numInstances = 0; // static variable

	protected static int getCount() { // static method
		return numInstances;
	}

	private static void addInstance() {
		numInstances++;
	}

	InstanceCounter() { // constructor
		InstanceCounter.addInstance(); // calling static method of InstanceCounter
	}

	public static void main(String[] arguments) {
		System.out.println("Starting with " + InstanceCounter.getCount() + " instances");
		for (int i = 0; i < 500; ++i) {
			new InstanceCounter();
		}
		System.out.println("Created " + InstanceCounter.getCount() + " instances");
	}

}
