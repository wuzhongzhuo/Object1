package xiancheng.jiekou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
	/*List<String> list=new ArrayList();
	
	//Set<String> set=new HashSet();
	//set.add("z");
	//System.out.println(set.add("z"));
	
	Map<Integer, String> map=new HashMap();
	map.put(1, "a");
	map.put(2, "b");
	map.put(3, "c");
	System.out.println(map.get(1));
	System.out.println(map.get(2));
	System.out.println(map.get(3));
	
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("e");
	//list.add(2, 3);�������list�����size()û�е�2�Ļ����ᱨ��
	System.out.println(list.get(3));
	
	Set<Integer> set=new HashSet();
	
	Cat<String> cat=new Cat();*/
	/*eat();
	drink();
	talk();
	Thread t1=new Thread1();
	Thread t2=new Thread2();
	t1.start();
	t2.start();*/
	/*Runnable r=new Thread3();
	Thread t3=new Thread(r);
	t3.start();*/
	//threadӦ��
	/*Thread t1=new Piao();
	Thread t2=new Piao();
	t1.start();
	t2.start();*/
	//Runnable
	Runnable piao=new Piao1();
	Thread t3=new Thread(piao);
	Thread t4=new Thread(piao);
	t3.start();
	t4.start();
	
}
	public static void eat() {
		System.out.println("�Զ���");
	}
	public static void drink() {
		System.out.println("������");
	}
	public static void talk() {
		System.out.println("˵��");
	}
}
