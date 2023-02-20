package mypkg01;

public class Adder {
	int a,b,c;
	
	public int add(int a, int b) {
		c= a + b;
		return c;//메모리에 남아있음.
	}
	
	public void add2(int a, int b) {
		c= a + b;
		System.out.println(a + " + " +b + " = " + c);
		
	}
	/*
	 * 함수를 정의할 때 void 값으로 할 경우
	 * -하는 경우  return 값; 또는 return 변수명; 또는 return 계산식;
	 * 또는 return 함수명(); 을 쓸 수 없다. return
	 * 예1) return 10;
	 *  return c;
	 *  return10 + 10
	 *  return 함수명();
	 * 불가.
	 */
	public int method01(){
		return 10;//위가 중요 위 아래 위위 아래.
	}
	
	public double method02(){
		return 0.3;
	}
	public String method03() {
		return "메소드03번" + "뭐" + ", 떫냐";
	}
	public Character method04() {
		return '뭐';
	}
	
	public String method05(String v1, String v2) {
		return v1 + "," + v2;
	}
	
	public String method06() {
		//char 배열의 값을 사용할 때 읽기만 가능
		//읽기 외에 값을 사용해서 연산을 하고 싶은 경우 -> toString() -> String 클래스의 함수를 사용	
		char[] arr = {'a','b','c'};
		return arr.toString();
	}
	public static void main(String args[]) {
		//1. 객체를 생성
		Adder a = new Adder();
		//2. add() 함수를 사용(이름을 사용했기 때문에 호출 명령어)
		int fb = a.add(10, 20);
		
		String arr01;
		//3. 변수 fb는 add() 함수 내부에 있던 return c 명령어가 실행된 후에
		//변수 c의 값이 자동으로 대입됩니다. (이유: add() 함수가 종료될 때 값을 가져오기 때문)
		System.out.println("10 더하기 20 = " + fb);
//		int f = a.add2(20, 30);//return값이 없으므로 오류가 난다.
		a.add2(20, 30);//
		a.add2(30, 50);
		String value = a.method06();
		char ch01 = value.charAt(0);
		System.out.println("반환값의 첫 번째 문자:" + ch01);
		char ch02 = value.charAt(1);
		System.out.println("반환값의 두 번째 문자:" + ch02);
		//->toString 함수가 자동으로 실행되어서 이런 현상이 나오기 때문. 함수 내부의 toString.
		// - 해시(Hash): 변수가 갖고 있는 값을 찾을 때 제일 빨리 찾는 알고리즘
		// - 코드: 숫자 값(16진수)
		//	-> 해결 방법: java.util.Arrays 클래스가 존재
		//		toString()
		String value02 = java.util.Arrays.toString(new char[] {'a','b','c'});
		System.out.println(value02);
		System.out.println(value02.charAt(0));
		System.out.println(value02.charAt(1));
	}
}
