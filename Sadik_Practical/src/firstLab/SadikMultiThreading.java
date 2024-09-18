package firstLab;
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Extending Thread) - Value: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Implementing Runnable) - Value: " + i);
            try {
                Thread.sleep(500); // Pausing the thread for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SadikMultiThreading {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
       
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
        
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (Main Thread) - Value: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

	}

}
