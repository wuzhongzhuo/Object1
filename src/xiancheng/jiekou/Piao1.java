package xiancheng.jiekou;

public class Piao1 implements Runnable{
	int count=40;
	Object lock=new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		while(count>0) {
				synchronized(lock) {
					try {
						Thread.currentThread().sleep(1000);;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"ÒÑÂô³ö"+count+"ÕÅÆ±");
					count--;
					
				}
		}
	}

}
