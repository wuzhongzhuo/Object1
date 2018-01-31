package catclass;

public class Test {
	public static void main(String[] args) {
		Mainboard mainboard=new Mainboard();
		/*I3 i3=new I3();
		I5 i5=new I5();
		I9 i9=new I9();*/
		//Cpu指向的是new出的I3,I5,I9
		Cpu i3=new I3();
		Cpu i5=new I5();
		Cpu i9=new I9();
		
		//mainboard.setI3(i3);
		//mainboard.setI5(i5);
		
		mainboard.setCpu(i9);
		mainboard.method();
	}
}
