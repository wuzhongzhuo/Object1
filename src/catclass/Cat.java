package catclass;

public class Cat {
	private String name;
	private int age;
	private char sex;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	public void method() {
		System.out.println(name+"������è��");
	}
	public void method1(){
		System.out.println("С������Ϊ��"+age);
	}
	public void method2(){
		System.out.println("С���Ա�Ϊ��"+sex);
	}
	//��������,����������ͬ
	public int add(int a) {
		return a; 
	}
	public int add(int a,int b) {
		return a+b;
	}
	//�������Ͳ�ͬ
	public String add(String a,String b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}
	//������˳��ͬ
	public int add(int a,String b) {
		return a;
	}
	public int add(String b,int a) {
		return a;
	}
	public static void main(String[] args) {
		
	}
}
