package cn.year;

public class person {
	public static void main(String[] args) {
		/*year p1=new year();
		p1.method1(2017);*/
		
		year p2=new year();
		
		long a=p2.method2(20);
		System.out.println(a);
		
		int b=p2.method3();
		System.out.print(b);
	}
}
