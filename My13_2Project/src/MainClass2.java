/*
 * Human 클래스를 정의
 * 기능: 모든 사람 객체의 이름을 선언
 */
class Human{
	String name = "human";
	//멤버변수
	String age = "16";
}
/*
 * Human 클래스를 상속받는 SalesMan
 */
class SalesMan extends Human{
	public SalesMan() {
		name = "SalesMan";
		age = "47";
	}	
	/*
	 * 클래스 내부에서의 메모리 우선순위
	 * 1. 멤버변수, 2. 기본 생성자 3. 매개변수를 받는 생성자 4. 메서드.
	 * 1번이 가장 높은 이유는 메모리를 할당받기 때문
	 */
}
public class MainClass2 {
	public static void main(String[] args) {
		//3.자식 클래스인 SalesMan 클래스를 사용하ㅣ
		//String name = new String("문자열");
		Human a = new SalesMan();
		SalesMan b = new SalesMan();
		System.out.println(a.name);
		System.out.println(b.name);
		
		//5. 부모 클래스를 사용해서 객체 참조 변수를 선언
		Human c = null;
		c = new Human();
		System.out.println(c.name);
		System.out.println(c.age);
		c = new SalesMan();
		/*
		 * 객체 참조 변수인 c를 사용해서
		 * 힙 메모리 영역에 있는 SalesMan 클래스의 객체 주소 값을 대입
		 * -> 즉, c를 이용해서 자식 클래스인 SalesMan 클래스로 이동 가능.
		 */
		System.out.println(c.name);
		System.out.println(c.age);
		
		double a1= 100;
		int b1 = (int)a1;
		int f = (int)3.14;
		/*아래는 오류
		 * int b = 3.14;
		 */
		
		System.out.println(f);
		Human a2 = new SalesMan();
		//강제형변환
		SalesMan sm2 = (SalesMan)a2;//다운 캐스팅
		//아래는 오류 SalesMan sm2 = a2;
	}
}
