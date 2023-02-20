package SoloPackage;

public class StringObject {

	
	static String first = new String("객체");
	static String second = "객체";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(first.equals(second))
		{
			System.out.println("스트링객체와 원시 객체는 같다");
		}
		else
			System.out.println("equals()이걸 써야지");
	}

}
