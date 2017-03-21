package synchronizedBlocks;
/**
 * @author: wuke 
 * @date  : 2017年3月21日 上午10:54:04
 * Title  : Example
 * Description : 
 */
public class Example {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread threadA = new CounterThread(counter);
		Thread threadB = new CounterThread(counter);
		
		threadA.start();
		threadB.start();
		
		System.out.println(counter.count);
	}
}
