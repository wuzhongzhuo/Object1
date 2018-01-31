package catclass;

public class baozhaung {
	public static void main(String[] args) {
		Integer a=6;
		Integer b=6;
		System.out.println(a==b);
		//Èç¹û³¬³ö-128~127
		Integer c=129;
		Integer d=129;
		System.out.println(c.intValue()==d.intValue());
	}
}
