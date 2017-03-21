package synchronizedBlocks;
/**
 * @author: wuke 
 * @date  : 2017年3月21日 上午10:52:06
 * Title  : CounterThread
 * Description : 
 */
public class CounterThread extends Thread{
    protected Counter counter = null;
    
    public CounterThread(Counter counter) {
    	this.counter = counter;
    }
    
    public void run() {
    	for(int i = 0; i < 10; i++) {
    		counter.add(i);
    		System.out.println(this.getName() + "running, count is " + counter.count);
    	}
    }
}
