package paixu;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paixu {
	public static void main(String[] args) {
		//冒泡；排序
		int[] arr= {7,2,9,6,10};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			
		}
		for(int s:arr)
			System.out.println(s+",");
		
		//数组扩容
		List list=new ArrayList();
		System.out.println(list.size());
		list.add(2);
		System.out.println(list.size());
		list.add(1, 4);

		System.out.println(list.get(1));
		
		/*char str='a';
		char str1='b';
		System.out.println(str+str1);*/
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		System.out.println("输入的内容为："+str);
		
		/*int str3=scanner.nextInt();
		System.out.println("输入的内容为："+str3);*/
		/*String str2=scanner.nextLine();
		System.out.println("输入的内容为："+str2);*/
	}
	
	
	
}
