//덧셈 계산 함수 예제
//정수 덧셈 계산
//실수 덧셈 계산
public class Adder2 {
	
	//본 예제에서는 멤버변수와 생성자를 사용하지 않음.
	//-new 클래스명() 명령어가 실행될 때 오류가 발생하지 않느냐-노노 컴파일러가 기본 생성자를 만들어준다.
	
	
	public double adder(Double a, Double b) {
	
		return a+b;
	}
	public int adder(int a, int b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder2 a = new Adder2();
		int sum;
		double doublesum;
		doublesum = a.adder(2.4,2.5);
		sum = a.adder(3, 4);
		System.out.println((sum) + " "+(doublesum) );
	}

}
