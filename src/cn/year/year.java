package cn.year;

public class year{
	//�ж��Ƿ�������,�����
  	public static void method1(int year){
	if((year%4==0&&year%100!=0)||year%400==0) {
		
		System.out.print("����");
	}else {
		System.out.print("ƽ��");
		
	}
}
  	public long  method2(int i) {
  		long result=i;
  		 for(int j=2;j<i;j++) {
  			 result=result*j;
  			 
  		 }
  		return result;
  	}
  	//����1~100֮�������
  	public int method3() {
  		int result=0;
  		for(int i=1;i<=100;i++) {
  			result+=method4(i);
  		}
  		return result;
  	}
  	//�ж�һ�����Ƿ���������������������ر������������������0
  	public int method4(int i) {
  		for(int j=2;j<i;j++) {
  			if(i%j==0) {
  				return 0;
  			}
  		}
  		return i;
  	}
  	
	public static void main(String[] args) {
		
		method1(2012);
		
		
		
}

}

