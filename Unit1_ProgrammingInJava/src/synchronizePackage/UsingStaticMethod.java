package synchronizePackage;

class CSITBookSyncStatic {
	static int totalseats = 48;

	public static synchronized void book(int reqseats) {
		if (reqseats <= totalseats) {
			System.out.println("Seats booked = " + reqseats);
			totalseats = totalseats - reqseats;
			System.out.println("Seats available = " + totalseats);
		} else {
			System.out.println(reqseats + " seats not available");
			System.out.println("Seats available = " + totalseats);
		}
	}
}

class Mythread1 extends Thread {
	CSITBookSyncStatic b;
	int seats;

	Mythread1(CSITBookSyncStatic b, int seats) {
		this.b = b;
		this.seats = seats;
	}

	public void run() {
		b.book(seats);
	}
}

public class UsingStaticMethod extends Thread {
	public static void main(String[] args) {
		CSITBookSyncStatic esewa = new CSITBookSyncStatic();
		Mythread1 ram = new Mythread1(esewa, 12);
		Mythread1 shyam = new Mythread1(esewa, 10);
		Mythread1 hari = new Mythread1(esewa, 15);
		ram.start();
		shyam.start();
		hari.start();
		CSITBookSyncStatic khalti = new CSITBookSyncStatic();
		Mythread1 k1 = new Mythread1(khalti, 12);
		Mythread1 k2 = new Mythread1(khalti, 10);
		Mythread1 k3 = new Mythread1(khalti, 15);
		k1.start();
		k2.start();
		k3.start();
	}
}
