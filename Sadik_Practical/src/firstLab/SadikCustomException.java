package firstLab;
import java.util.Scanner;
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}
public class SadikCustomException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter your age: ");
			int n= scanner.nextInt();
            checkAge(n);
        } catch (UnderAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Must be 18 or older");
        }
        System.out.println("Access granted");
	}

}
