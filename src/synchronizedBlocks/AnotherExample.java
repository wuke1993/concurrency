package synchronizedBlocks;
/**
 * @author: wuke 
 * @date  : 2017年3月21日 上午11:05:51
 * Title  : AnotherExample
 * Description : 
 */
public class AnotherExample {

	public static void main(String[] args) {
		Counter counterA = new Counter();
		Counter counterB = new Counter();
		
		Thread  threadA = new CounterThread(counterA);
		Thread  threadB = new CounterThread(counterB);
		
		threadA.start();
		threadB.start();
		
		System.out.println(counterA.count);
		System.out.println(counterB.count);
	}
}
/**
 * Thread-0running, count is 0
   Thread-0running, count is 1
   Thread-0running, count is 3
   Thread-1running, count is 0
   Thread-1running, count is 1
   Thread-0running, count is 6
   Thread-1running, count is 3
   Thread-1running, count is 6
   Thread-1running, count is 10
   Thread-1running, count is 15
   Thread-0running, count is 10
   Thread-0running, count is 15
   Thread-0running, count is 21
   Thread-0running, count is 28
   Thread-0running, count is 36
   Thread-0running, count is 45
   Thread-1running, count is 21
   Thread-1running, count is 28
   Thread-1running, count is 36
   Thread-1running, count is 45
 */