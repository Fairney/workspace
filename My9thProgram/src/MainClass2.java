/*
 * 1. 객체 지향 개념은 데이터(값)을 피부처럼 외부로부터 보호 기능(Capsule)
 */
public class MainClass2 {

	public static void main(String[] args) {
		//2. Wrapper 클래스인 Integer를 사용해서 정수를 보호하는 기능이 내장
		// - 첫 ㅓㄴ째 기능: 생성자(Constructor) 함수
		// - 생성자를 사용하는 형식: 클래스명 변수명 = new 클래스명(정수값);
		// - 비교) int 변수명 = 정수값;
		//함수 내부에 100이 들어가서 100이 내부에서 integer클래스에 의해 int a= 100이수행된다.(간접)
		Integer a = new Integer(100);
		// 정수 100은 a를 통해 쉽게 꺼내올 수 있다.
		//직접 변수 b에 100이 대입된다.
		int b = 100;//사용하기에는 편하나 캡슐화 되지 않아서, 보안상 취약하다. Integer을 사용해서 클래스 내부에 보관하는 방법이 더 안전한 방법.
		
		System.out.println(a); //a.toString();
		
		a= 200;
		
		System.out.println(a);//a.toString();
		String c = "비밀번호값";
		char[] d = {'비','밀','번','호','값'};
		//기본 자료형-원시 자료형.
		//String : 클래스 이름
		// - 기본 원리: 기본 값을 변경하는 것을 막음, 새로운 값을 저장할 수 있는 메모리 공간을 만듦.
		System.out.println(c.hashCode());
		c = "새로운값";
		System.out.println(c.hashCode());
		c = "비밀번호값";
		System.out.println(c.hashCode());
		//- hash(검색)+ code(코드): 데이터 검새을 최대한 빨리 위한 방법ㅂ(알고리즘)
		//- 컬렉션에서 자세히 다룰 예쩡
		// - hashcode() 함수의 기능: 메모리에 있는 값의 주소를 읽어와서 새로운 숫자 값을 생성을 하는 기능을 한다.
		// - 이유 : 원래 있는 값을 보호하기 위해서. 접근을 막기 위해서.
		System.out.println(d[0]);
		System.out.println(d);
		System.out.println(d[1]);
		d[0] = '마';
		System.out.println(d[0]);
		
		Character e = new Character('a');
		System.out.println(e.hashCode());
		e= 'f';
		System.out.println(e.hashCode());
		e = 'a';
		System.out.println(e.hashCode());
	}

}
