package catclass;

public class Dog {
	private String name;
	private int age;
	private String sex;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void dog() {
		System.out.println(name+"是这懒猪"+age+"岁"+"爱好公");
	}
	public static void Dog1() {
		System.out.println("我好像在哪见过你");
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("小花子");
		dog.setAge(10);
		dog.setSex("母");
		dog.dog();
		//1.静态方法在main方法里直接类名.方法运行
		/*Dog.Dog1();*/
		//2.也可以直接这样调方法名
		Dog1();
		
	}
}
