package firstLab;
interface Vehicle {
    void start();        // Method to start the vehicle
    void stop();         // Method to stop the vehicle
    void accelerate(int speed);  // Method to accelerate the vehicle to a specific speed
    void brake();        // Method to apply brakes
    void honk();         // Method to honk the horn
}

// Implement the Vehicle interface in the Car class
class Car implements Vehicle {
    private int speed;

    // Implement the start method
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    // Implement the stop method
    @Override
    public void stop() {
        speed = 0;
        System.out.println("Car has stopped.");
    }

    // Implement the accelerate method
    @Override
    public void accelerate(int speed) {
        this.speed = speed;
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    // Implement the brake method
    @Override
    public void brake() {
        speed -= 10; // Decrease speed by 10 km/h
        System.out.println("Car is braking. Current speed: " + speed + " km/h.");
    }

    // Implement the honk method
    @Override
    public void honk() {
        System.out.println("Car is honking: Beep! Beep!");
    }
}

public class SadikInterfaceExample {
	

	public static void main(String[] args) {
		Car myCar = new Car();
        myCar.start();        // Start the car
        myCar.accelerate(60); // Accelerate to 60 km/h
        myCar.brake();        // Apply brakes
        myCar.honk();         // Honk the horn
        myCar.stop();         // Stop the car

	}

}
