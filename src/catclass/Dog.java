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
		System.out.println(name+"��������"+age+"��"+"���ù�");
	}
	public static void Dog1() {
		System.out.println("�Һ������ļ�����");
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("С����");
		dog.setAge(10);
		dog.setSex("ĸ");
		dog.dog();
		//1.��̬������main������ֱ������.��������
		/*Dog.Dog1();*/
		//2.Ҳ����ֱ��������������
		Dog1();
		
	}
}
