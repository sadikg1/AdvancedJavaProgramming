package firstLab;
class Sleeper implements Runnable {
    public void run() {
        try {
            System.out.println("Sleeper is going to sleep for 2 seconds");
            Thread.sleep(2000);
            System.out.println("Sleeper woke up");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Yielder implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Yielder yielding");
            Thread.yield();
            System.out.println("Yielder running again");
        }
    }
}

class SharedFlag {
    private boolean flag = false;
    
    public synchronized void waitForFlag() throws InterruptedException {
        while (!flag) {
            wait();
        }
    }
    
    public synchronized void setFlag() {
        flag = true;
        notify();
    }
}

class Waiter implements Runnable {
    private SharedFlag flag;
    
    public Waiter(SharedFlag flag) {
        this.flag = flag;
    }
    
    public void run() {
        try {
            System.out.println("Waiter is waiting for flag");
            flag.waitForFlag();
            System.out.println("Waiter received notification");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Notifier implements Runnable {
    private SharedFlag flag;
    
    public Notifier(SharedFlag flag) {
        this.flag = flag;
    }
    
    public void run() {
        try {
            Thread.sleep(3000);  // Sleep for 3 seconds before notifying
            System.out.println("Notifier is notifying");
            flag.setFlag();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SadikMultiThreadingEg {

	public static void main(String[] args) {
		SharedFlag flag = new SharedFlag();
        
        Thread sleeper = new Thread(new Sleeper());
        Thread yielder = new Thread(new Yielder());
        Thread waiter = new Thread(new Waiter(flag));
        Thread notifier = new Thread(new Notifier(flag));
        
        sleeper.start();
        yielder.start();
        waiter.start();
        notifier.start();

	}

}
