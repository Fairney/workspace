/*
 * 생성자(Constructor)
 * ->클래스 명과 이름이 같은 메소드(함수)
 * -역할: 멤버 변수의 초기값( 시작값 ) 을 정해줍니다.
 */
//새로운 Academy 클래스를 정의: 주의사항으로 public 예약어는 불가능
//- 이유: public class는 하나만 존재) 이유: .java의 파일 이름으로 사용되기 때문)
// - 현재 파일 이름: TestConstructor.java
class Academy{
	 int studentNo = 1;
	 String studentName = "홍길동";
	 public Academy(){
		 //기본생성자.
		 System.out.println("실행 여부를 확인하기 위한 명령문");
		 //기본생성자의 생성 방법
		 studentName = "박맹수";
		 studentNo = 2;
		 //Academy a = new Academy();
	 }
	 public Academy(String name, Integer number){//매개변수를 갖는 생성자의 형식 - 목적: 객체마다 멤버 변수에 사로 다른 값을 저장
		 //값은 다른 클래스의 함수에서 받아옴
		 //값을 ㅈ받아오는 매개변수를 선언해야 합니다.
		 //- 매개변수: 멤버변수와 동일하게 선언(이름은 다른 이름)
		 //매개변수를 받는 생성자.
		 System.out.println("외부의 함수에서 받아온 값을 화면에 표시(확인)");
		 System.out.println("이름:" + name + ", 번호:" + number);
		 //외부에서 받은 값을 멤버변수 각각에도 저장(대입)해야 합니다.
		 // - 형식: 멤버변수이름 = 매개변수이름;
		 this.studentName = name;
		 this.studentNo = number;
		 System.out.println("변경된 학생 이름:" +studentName+", 번호:"+studentNo);
		 //Academy b = new Academy(name1, number1);
	 }
}
/*
 * 위에서 새로 정의한 매개변수를 갖는 생성자를 실행하는 명령어의 형식
 * 클래스명 객체명 = new 클래스명(매개변수 할당 수);
 * -할당 매개변수1: String name 매개변수에 보관할 값
 * -할당 매개변수2: int no 매개변수에 보관할 값
 * - 실제 예: Academy d = new Academy("이순신". 2);
 */
public class TestConstructor {

	
	

	public static void main(String[] args) {
		Academy a = new Academy();
		Academy b = new Academy();
		Academy c = new Academy();
		System.out.println("1. 객체 이름 a=====================================================");
		System.out.println(a.studentNo);
		System.out.println(a.studentName);
		
		System.out.println("2. 객체 이름 b=====================================================");
		System.out.println(b.studentNo);
		System.out.println(b.studentName);
		
		System.out.println("3. 객체 이름 c=====================================================");
		System.out.println(c.studentNo);
		System.out.println(c.studentName);
		
		
		Academy d = new Academy("홍길동",4);
		Academy e = new Academy("홍닐동",5);
		Academy f = new Academy("홍딜동",6);
		
		System.out.println("4. 객체 이름 d*****************************************************");
		System.out.println(d.studentNo);
		System.out.println(d.studentName);
		
		System.out.println("5. 객체 이름 e******************************************************");
		System.out.println(e.studentNo);
		System.out.println(e.studentName);
		
		System.out.println("6. 객체 이름 f******************************************************");
		System.out.println(f.studentNo);
		System.out.println(f.studentName);
		
		
	}

}
