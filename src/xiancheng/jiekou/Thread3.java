package xiancheng.jiekou;

public class Thread3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=1000;i++) {
			try {
				//获取当前线程
				Thread.currentThread().sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("c"+i);
			
		}
	}

}
