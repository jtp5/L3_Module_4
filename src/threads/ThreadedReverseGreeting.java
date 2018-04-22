package threads;

public class ThreadedReverseGreeting {
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
	public static void program(int count) {

		int num = count;

		Thread t1 = new Thread(() -> {
			if (count <= 50) {
				program(count + 1);
				System.out.println("Hello from Thread " + num);
			}
		});
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		program(1);
	}
}
