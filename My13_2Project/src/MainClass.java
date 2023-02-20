/*
 * 1. 상속 관계에 있는 클래스 간의 형 변환(클래스 간의 이동)
 * 1) 사람 클래스 정의
 * 2) 학생 클래스 정의
 * 3) 강사 클래스 정의
 * 	-상속 개념을 사용하지 않음
 */
//사람 클래스 정의

class Person{
	private String name = "홍길동";
	private String name2;

	public Person() {
		name2 = "이름없음";
	}
	public Person(String name, String name2)
	{
		this.name = name;
		this.name2 = name2;
	}
	public void show() {
		System.out.println("첫번째 이름 " + name + ",\n두 번째 이름 : "+name2);
	}
}

class Student{
	private String name = "세종대왕";
	public void show() {
		System.out.println("학생 객체의 이름은 " + name);
	}
}
class Teacher{
	private String name = "손흥민";
	public void show() {
		System.out.println("강사 객체의 이름은 " + name);
	}
}
//상속 개념을 사용해서 사람, 학생, 강사 클래스를 정의하기
/*
 * 1. 클래스 계층 구조를 정의하기
 * 1) 부모 클래스를 먼저 정의: 공통(Common 클래스를 정의
 * Common(Person 사람 클래스 역할)
 * Student2 Teacher2
 * 
 */
class Common{
	String name = "";
}
class Student2 extends Common{
	//Common 클래스를 상속 받았으므로 Student2 클래스 내부에도 Common 클래스가 갖고잇는
	//멤버변수가 존재, 단, private 멤버변수는 제외.
	//String name = "";
	public Student2() {
		name = "학생이름1004";
	}
	public void show() {
		System.out.println("학생 이름:" + name);
	}
}
class Teacher2 extends Common{
	public Teacher2() {
		this.name = "강사이름";
	}
	public void show(){
		System.out.println("강사이름: " + name);
	}
	/*
	 * 상속 관계에 있는 부모와 자식 클래스를 한 문장으로 표현하면
	 * -A is B
	 * 예) 사람 객체는 생물이다.
	 * -A: 사람객체
	 * -B: 생물
	 *  -동격(동등)
	 *  =기본적으로 부모 클래스와 자식 클래스는 같다.
	 *  -같다: 메모리 공간의 전체 크기
	 *   -메모리에 멤버변수가 같게 생성.
	 *   -메소드는 클래스 영역에 따로 생성(한 번만 생성)
	 *   -크기: int(4바이트), double(8바이트)
	 *   -기본 자료형을 사용해서 형 변환 연산을 수행할 수 있뜻이 부모 클래스와 자식 클래스도가능
	 *   -형식: 부모클래스명 객체명 = 자식클래스명;
	 */
}
public class MainClass {
	public static void main(String[] args) {
		//사람 객체를 생성하기
		Person a = new Person();
		Person b = new Person("이순신","장군");
		a.show();
		b.show();
		/*
		 * 기본적으로 부모 클래스와 자식 클래스는 같습니다.
		 * -메모리 장치 내부에 있는 멤버변수
		 */
		Common cm = new Student2();//업 캐스팅
		/*
		 * Common cm: 스택 영역에 생성(하나의 변수)
		 * 2) new Student2(): 힙 영역에 새로운 객체가 생성->기본 생성자가 호출-> 새로 만들어진 객체의 주소가 반환.
		 */
		//Common 클래스에서 선언한 멤버변수라고 가정
		String name3 = "이름1";
		//Student 클래스에서 선언한 멤버변수라고 가정하겠습니다.
		String name4 = "이름2";
		System.out.println("지역 변수 name3의 값:" + name3);
		System.out.println("지역 변수 name4의 값:" + name4);
		name3 = name4;
		System.out.println("지역 변수 name3의 값:" + name3);
		System.out.println("지역 변수 name4의 값:" + name4);
		//위의 변수의 대입과정은 Common a = new Student();와 과정이 비슷하다.
		Common cb = new Student2();//String name = name;
		System.out.println(cb.name);
		/*
		 * 상속 관계에 있는 부모 클래스 이름을 사용하는 형식
		 * 1.부모클래스이름 객체이름 = new 부모클래스이름();
		 * 2.부모클래스이름 객체명 = new 자식클래스이름();
		 */
		//Student2 st = (Student2) new Common();
	}
}
