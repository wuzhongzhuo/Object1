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
	//1.	����һ����ֵ,���������������������ֵ��2349�����Ϊ9432
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
	
	//ð������
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
	//���������������������������Լ������С������
	public static void method2() {
		int i=10;
		int j=6;
		int k=i>j?j:i;
		for(int m=k;m>0;m--) {
			if(i%m==0&&j%m==0) {
				System.out.println("���Լ��Ϊ"+m);
				break;
			}
		}
	}
	//����С������
	public static void method3() {
		int i=12;
		int j=6;
		int h=i<j?j:i;
		int m=h;
		while(h<=(i*j)) {
			if(h%i==0&&h%j==0) {
				System.out.println("��С������Ϊ��"+h);
				break;
			}
			h+=m;
		}
	}
	//�������ˮ�ɻ���
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
	//һ����λ�����жϴ����Ƿ��ǻ���������12321�ǻ�������12341���ǻ�����
	public static void method5() {
		int i=12345;
		int a=i/10000;
		int b=(i%10000)/1000;
		int c=(i%1000)/100;
		int d=(i%100)/10;
		int e=i%10;
		if(a==e&&b==c) {
			System.out.println(i+"�ǻ�����");
		}else {
			System.out.println(i+"���ǻ�����");
		}
	}
	//��1��2��3��4���ĸ�������ɶ��ٸ���λ�������ظ���
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
