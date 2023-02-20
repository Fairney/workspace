package pkg5;

public class Main {
//방금 정의한 RealFD 클래스를 사용하기
	public static void main(String[] args) {
		RealFD a = new RealFD();
		a.drive();
		a.fly();
		a.jump(50);
		System.out.println(a.PI);

	}

}
