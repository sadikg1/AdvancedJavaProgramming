package firstLab;
class Counter {
    private int count = 0;
    private Object lock = new Object();
    
    // Synchronized method
    public synchronized void incrementSync() {
        count++;
    }
    
    // Method with synchronized block
    public void incrementWithSyncBlock() {
        synchronized(lock) {
            count++;
        }
    }
    
    public int getCount() {
        return count;
    }
}

public class SadikSynchronize {

	public static void main(String[] args) {
		Counter counter = new Counter();
        
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementSync();
                counter.incrementWithSyncBlock();
            }
        });
        
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementSync();
                counter.incrementWithSyncBlock();
            }
        });
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final count: " + counter.getCount());
    }

	}

