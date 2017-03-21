package synchronizedBlocks;
/**
 * @author: wuke 
 * @date  : 2017年3月21日 上午10:50:35
 * Title  : Counter
 * Description : 
 */
public class Counter {
	long count = 0;
	
	public synchronized void add(long value) {
		this.count += value;
	}
}
