package synchronizedBlocks;
/**
 * @author: wuke 
 * @date  : 2017��3��21�� ����10:50:35
 * Title  : Counter
 * Description : 
 */
public class Counter {
	long count = 0;
	
	public synchronized void add(long value) {
		this.count += value;
	}
}
