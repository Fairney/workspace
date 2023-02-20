/*
 * 사람 클래스를 새로 정의(선언)
 */
public class Person {
	//멤버변수를 선언할 수 있는 영역
	
	//생성자 메소드를 정의할 수 있는 영역
	//1) 사람 이름을 보관할 수 있는 멤버변수를 선언 + 초기화
	private String name = "name";
	Integer tall;
	String bloodType;
	double vision;
	
	public Person() {
		//기본 생성자를 정의
		//명령어를 추가해 보세요!: 출력 명령어/ 위에서 선언한 멤버변수 a의 값을 변경
		//1) 출력 명령어: System.out.println(멤버변수명);
		//2)멤버변수 a의 값을 변경하는 명령어: 멤버변수명 = 새로운값;
		System.out.println("Person 클래스 기본 생성자 입니다.");
		System.out.println("이 생성자에서는 우리나라의 표준 사람의 값을 보여줍니다.");
		tall = 173;
		bloodType="A";
		vision = 0.5;
		name = "김";
		
	}
	public Person(String name, Integer tall, String bloodType, double vision) {
		System.out.println("여기는 입력한 값을 그대로 출력해줍니다.");
		this.name = name;
		this.tall = tall;
		this.bloodType= bloodType;
		this.vision = vision;
	}

	public static void main(String[] arg) {
		//기본 생성자를 실행하기
		//- 형식 : 클래스명 객체명 = new 클래스명();
		Person a = new Person();
		Person b = new Person("누구쎄용?",170,"RH+ A",-5);
		System.out.println(a.name + " " + a.tall + " " + a.bloodType + " " + a.vision);
		System.out.println(b.name + " " + b.tall + " " + b.bloodType + " " + b.vision);
	}
}