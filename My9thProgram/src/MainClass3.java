
public class MainClass3 {

	//1) 하나의 정수를 보관할 수 있는 변수를 선언(클래스 내부)
	int a = 100; //MainClass3 클래스를 사용하는 모든 객체가 값이 동일
	Integer b = new Integer(100);
	
	//멤버변수인 c를 선언 + 초기화
	
	//-> int 자료형을 사용, 값은 임의의 정수값을 지정해 보세요.
	MainClass3(int d){
		System.out.println("클래스 외부에서 사용함 (실행함)");
		a =d;
	}
	
	//toString() 함수의 명령어를 다시 작성-> 이유: 클래스명@숫자값 값을 다른 값으로 변경.
	public String toString() {
		// TODO Auto-generated method stub
		return a+"";
	}

	int c = 100;
	Integer c2 = new Integer(20);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2)MainClass3 클래스를 사용하기 위한 객체를 생성하기
//		System.out.println(b); 클래스 영역에 있어서 차단당함.
		MainClass3 c = new MainClass3(20);	//객체 참조 변수라고 칭한다.
		//3) MainClass3 내부에서 선언한 int a = 100;를접근하기 위해서는 점(.)연산자를 사용해야함 -> 반수명 + 점 연산자 + 내부변수명(멤버변수명_
		System.out.println(c);
		MainClass3 a = new MainClass3(30);
		System.out.println(c.a);
		System.out.println(a.a);//a: main()함수에서 선언한 변수 이름(검정색), 파란색은 MainClass에서선언한 변수.
		c.a = 20;
		a.a= 100;
//		System.out.println(c.a);
//		System.out.println(a.a);
//		System.out.println(c.a);
//		System.out.println(a.a);
	}

}
