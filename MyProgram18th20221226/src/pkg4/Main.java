package pkg4;

public class Main {
	public static void main(String[] args) {
		Rect2 a = new Rect2(10,20);
		Rect2 b = new Rect2(10,20);
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		boolean c = a.equals(b);
		System.out.println(c);
		
		Rect2 d = new Rect2(10,30);
		c = a.equals(d);
		System.out.println(c);
	}
}
