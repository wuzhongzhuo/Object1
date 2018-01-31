package cn.year;

public class homework {
	private static int temp;

	public static void main(String[] args) {
		method();
		System.out.println();
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
	}
	//1.	输入一个数值,输出它的逆数，即输入数值：2349，输出为9432
	public static void method() {
		int i=2349;
		int a,b,c,d,e;
		a=i/1000;
		b=(i%1000)/100;
		c=(i%100)/10;
		d=i%10;
		e=d*1000+c*100+b*10+a;
		System.out.print(e);
	}
	
	//冒泡排序
	public static void method1() {
		int[] a= {2,5,7,9,12};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(int s:a) {
			System.out.print(s+",");
			}
			System.out.println();
		}
		
		
	}
	//输出两个数，求出这两个数的最大公约数和最小公倍数
	public static void method2() {
		int i=10;
		int j=6;
		int k=i>j?j:i;
		for(int m=k;m>0;m--) {
			if(i%m==0&&j%m==0) {
				System.out.println("最大公约数为"+m);
				break;
			}
		}
	}
	//求最小公倍数
	public static void method3() {
		int i=12;
		int j=6;
		int h=i<j?j:i;
		int m=h;
		while(h<=(i*j)) {
			if(h%i==0&&h%j==0) {
				System.out.println("最小公倍数为："+h);
				break;
			}
			h+=m;
		}
	}
	//输出所有水仙花数
	public static void method4() {
		for(int i=100;i<=999;i++) {
			int a=i/100;
			int b=(i%100)/10;
			int c=i%10;
			if(i==(Math.pow( a, 3)+Math.pow(b, 3)+Math.pow(c, 3))) {
				System.out.println(i);
			}
		}
	}
	//一个五位数，判断此数是否是回文数。如12321是回文数，12341不是回文数
	public static void method5() {
		int i=12345;
		int a=i/10000;
		int b=(i%10000)/1000;
		int c=(i%1000)/100;
		int d=(i%100)/10;
		int e=i%10;
		if(a==e&&b==c) {
			System.out.println(i+"是回文数");
		}else {
			System.out.println(i+"不是回文数");
		}
	}
	//由1、2、3、4这四个数能组成多少个三位数（不重复）
	public static void method6() {
		int[] arr= {1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			int a=arr[i];
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					int b=arr[j];
					for(int k=0;k<arr.length;k++) {
						if(i!=k&&j!=k) {
							int c=arr[k];
							int m=a*100+b*10+c;
							System.out.print(m+" ");
						}
						
					}
				}
				
			}
		}
	}
}
