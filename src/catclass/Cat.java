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
		System.out.println(name+"正在走猫步");
	}
	public void method1(){
		System.out.println("小潘年龄为："+age);
	}
	public void method2(){
		System.out.println("小潘性别为："+sex);
	}
	//方法重载,参数个数不同
	public int add(int a) {
		return a; 
	}
	public int add(int a,int b) {
		return a+b;
	}
	//参数类型不同
	public String add(String a,String b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}
	//参数的顺序不同
	public int add(int a,String b) {
		return a;
	}
	public int add(String b,int a) {
		return a;
	}
	public static void main(String[] args) {
		
	}
}
