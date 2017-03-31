package concurrency;

/**
 * @author: wuke
 * @date : 2017年3月22日 上午9:47:06 Title : ThreadLocalExample Description :
 *       http://ifeve.com/java-theadlocal/
 */
public class ThreadLocalExample {

	public static class MyRunnable implements Runnable {
		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

		@Override
		public void run() {
			threadLocal.set((int) (Math.random() * 100D));

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

			System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyRunnable sharedRunnableInstance = new MyRunnable();
		
		Thread thread1 = new Thread(sharedRunnableInstance, "Thread 1");
		Thread thread2 = new Thread(sharedRunnableInstance, "Thread 2");
		
		thread1.start();
		thread2.start();
		
		System.out.println("Thread " + Thread.currentThread().getName() + " running!");
		
		// InterruptedException
		thread1.join(); // wait for thread 1 to die
		thread2.join(); // wait for thread 2 to die
		
		System.out.println("Thread " + Thread.currentThread().getName() + " running!");
	}
}