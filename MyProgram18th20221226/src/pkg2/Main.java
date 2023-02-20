package pkg2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println(a);
		System.out.println(b);
		
		Circle c = new Circle(5,6,8);
		System.out.println(c);
		String cp = c.toString();
		System.out.println(cp);
	}

}
