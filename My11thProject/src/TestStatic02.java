/*
 * 1. 규칙을 갖고 있는 학생 번호를 static 제한자(수정자)를 사용해서 stack에 올리고 여러개의 객체가 하나를 참조하도록 한다.
 *  -방금 전 예쩨는 하나의 객체가 5개의 번호를 저장
 *  - 지금 새로운 예쩨는 학생 번호 하나 당 하나의 객체가 대응되는 예제
 *  클래스명 객체명1 = new 클래스명(); -> 내부적으로 번호를 1로 저장.
 */
public class TestStatic02 {

	private static int m_sno = 1;
	//각각의 값 1,2,3,4,5 중 하나의 값을 가져올 int
	private int m_no=0;
	TestStatic02(){
		System.out.println("기본 생성자 메소드가 호출됨");
		System.out.println("현재 모든 객체가 함께 사용하고 있는 m_sno의 값을 출력");
		System.out.println("값은 " + m_sno);
		//공유 변수인 m_sno의 값이 변하기 전에 현재 값을 인스턴스 변수인 m_no에 저장하기.
		m_no = m_sno;
		TestStatic02.smethod();
	}
	//생성자를 활용해서 static int m_sno의 값을 특정 객체와 연결하기
	// - 현재 m_sno의 값을 객체에 저장하기.
	private static void smethod() {
		System.out.println("smethod() 메소드가 호출됨");
		System.out.println("현재 멤버변수인 m_sno의 값:" + m_sno);
		m_sno++;
		System.out.println("현재 멤버변수인 m_sno의 값:" + m_sno);
		
	}
	
	public void showNo() {
		System.out.println("현재 학생 번호는 " + m_no);
	}
	//->값이 중요 첫번째 객체가 사용할 값. 1번.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestStatic02.smethod();//static으로 만든 단 하나의 메소드.
		
		int a = 1;
		System.out.println(a);
		a++;
		System.out.println(a);
		a+=3;
		System.out.println(a);
		TestStatic02 o= new TestStatic02();
		TestStatic02 o2= new TestStatic02();		
		TestStatic02 o3= new TestStatic02();	
		TestStatic02 o4= new TestStatic02();	
		TestStatic02 o5= new TestStatic02();
		o.showNo();
		o2.showNo();
		o3.showNo();
		o4.showNo();
		o5.showNo();
		
	}

}
