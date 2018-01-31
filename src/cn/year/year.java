package cn.year;

public class year{
	//判断是否是闰年,并输出
  	public static void method1(int year){
	if((year%4==0&&year%100!=0)||year%400==0) {
		
		System.out.print("闰年");
	}else {
		System.out.print("平年");
		
	}
}
  	public long  method2(int i) {
  		long result=i;
  		 for(int j=2;j<i;j++) {
  			 result=result*j;
  			 
  		 }
  		return result;
  	}
  	//计算1~100之间的质数
  	public int method3() {
  		int result=0;
  		for(int i=1;i<=100;i++) {
  			result+=method4(i);
  		}
  		return result;
  	}
  	//判断一个数是否是质数，如果是质数返回本身，如果不是质数返回0
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

