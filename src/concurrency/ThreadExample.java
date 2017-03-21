package concurrency;
/**
 * @author: wuke 
 * @date  : 2017��3��20�� ����2:18:47
 * Title  : ThreadExample
 * Description : ���������̵߳�˳��������ģ�����ִ�е�˳�򲢷��������
 */
public class ThreadExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 0; i < 10; i++) {
			new Thread("" + i) { // ��������
				public void run() {
					System.out.println("Thread " + getName() + " running");
				}
			}.start();
		}
	}
}