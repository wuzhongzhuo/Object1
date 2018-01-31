package xiancheng.jiekou;

public class Piao extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count1=40;
		while(count1>0) {
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*System.out.println(getName()+"ÒÑÂô³ö"+count1+"ÕÅÆ±");
			count1--;*/
		}
	}
}
