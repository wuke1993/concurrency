package concurrency;
/**
 * @author: wuke 
 * @date  : 2017年3月20日 下午2:18:47
 * Title  : ThreadExample
 * Description : 尽管启动线程的顺序是有序的，但是执行的顺序并非是有序的
 */
public class ThreadExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 0; i < 10; i++) {
			new Thread("" + i) { // 匿名子类
				public void run() {
					System.out.println("Thread " + getName() + " running");
				}
			}.start();
		}
	}
}