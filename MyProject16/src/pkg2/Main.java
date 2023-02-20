package pkg2;

/*
 * 인터페이스를 정의(선언)
 * 
 */

interface MyInterface1{
	//1. 상수를 정의
	public static final int A = 100;
	//2. 추상 메소드를 정의
	public abstract int add(int a, int b);
}
interface MyInterface2{
	//상속받은 interface의 메소드를 중복을 쓰면 안된다.
	//새로운 인터페이스를 정의할 때 주의사항
	//1.기존에 사용하고 있는 인터페이스의 상수명과 메소드명을 정리(참고)
	//-이유: 다중상속(한꺼번에 자식 클래스로 복사)
	//- 상수명은 다른 이름을 사용
	// - 메소드명은 같은 이름을 사용가능-하지만, 매개변수의 자료형과 갯수가 달라야 함(메소드 중복)
	public abstract double add(double a, double b);
}

/*
 * 위에서 정의한 MyInterface1과 MyInterface2를 동시에 사옥받는 새로운 클래스를 정의하기
 * 1) 형식
 * class 새로운 이름 implements 인터페이스이름1, 인터페이스2{
 * 
 * }
 */
class MyClass1 implements MyInterface2,MyInterface1{

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass1 a = new MyClass1();
		int result = a.add(10, 20);
		double result2 = a.add(1.34, 5.12);
		System.out.println(result + "," + result2);
	}

}
