package pkg1;
/*
 * 1. Object 클래스에서 갖고 있는 toString()메소드를 재정의
 * 1) 이해를 위해서 getter() 메소드를 사용
 * 2) toString() 메소드를 재정의
 */
class Person{
	String name;
	int m_age;
	String m_bt;
	
	//4) 다른 클래스로부터 값을 입력받는 생성자를 정의
	// - 입력 순서: 이름, 나이, 혈액형 매개변수 선언할 때 참고
	
	public Person(String name, int m_age, String m_bt) {
		this.name= name;
		this.m_age = m_age;
		this.m_bt = m_bt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM_age() {
		return m_age;
	}
	public void setM_age(int m_age) {
		this.m_age = m_age;
	}
	public String getM_bt() {
		return m_bt;
	}
	public void setM_bt(String m_bt) {
		this.m_bt = m_bt;
	}
	/*
	 * toString() 메소드를 재정의(따시  작성_
	 * 1) 형식
	 * @Override
	 * public String toString(){
	 * 	return "문자열";
	 * //"문자열": 멤버 변수의 값을 읽는 명령어(멤버 변수 이름을 사용 또는 getter())
	 * }
	 */
//	public String toString() {
//		return name +" " + m_age+ " " + m_bt;
//	}
	@Override
	public String toString() {
		String result = "";
		String name = getName();
		int age = getM_age();
		String bt = getM_bt();
		//반환 값의 기본 형식: 값1 + 구분자 + 값2 + 구분자 + 값3
		// - 구분자가 없으면 하나로 붙어버려서 알아볼 수가 없ㅇ게 됩니다.
		// - 구분자: 일반적으로는 하나의 공백 문자를 많이 사용
		// - 하지만, 엑셀 문서의 내용 처럼쉼표(,) 문자도 많이 사용한다.
		//- 반환 값의 순서: 이름값+","+나이값+","+혈액형
		result = name + "," + age + "," + bt;
		return result;
	}
	
	
}//end of Person class

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("이름", 49, "A");
		//getName() 메소드를 호출하면 이름 하나만 가져올 수 있음
		//Stringname은 지역 변수로 main()메소드 내부에서만 모니터 화면에(사용자에게) 이름을 보여주기
		System.out.println(p.toString());
		p.setM_age(29);
		p.setName("David");
		p.setM_bt("B");
		System.out.println(p.toString());
		int age = p.getM_age();
		String pname = p.getName();
		Character bt = p.getM_bt().charAt(0);
		System.out.println("사람의 이름은 : "+age );
		System.out.println("사람의 나이는 : "+pname);
		System.out.println("사람의 혈액형은 : " + bt);
		
		/*
		 * Person ㅋ르래스에서 재정의한 toString() 메소드를 호출하는 방법 2가지
		 * 1.System.out.println(객체참조변수명);
		 * 2.toString() 메소드를 바로 사용하기.
		 */
		System.out.println(p);
		String value = p.toString();
		System.out.println(value);
		
		//toString() 메소드의 반환값: 모든 멤버변수의 값
		// = 가져온 전체 값에서 다시 나누고 싶은 경우(개별적으로 낱개 값으로 분리)
		// - String 클래스가 갖고 있는 split() 메소드를 사용( 호출)
		//- split 메소드의 형식
		// public String[] split(문자열형식의 구분자){}
		//문자열 형식의 구분자 : toString() 메소드에서 return 이름 + "," ...;
		// - 쉽표(,) 기호를 사용(일치시켜야한다.)
		String[] arr =value.split(",");
		/*
		 * value.split("구분자기호)메소드의 기능
		 *  - 변수 value 가 갖고 있떤 전체 문자열의 값에서 구분자를 기준으로 나누어 추출하여 요소를 나누고, 그 요소를 배열에 집어넣는다.
		 *  쉽표() 기호를 구분으로 하여 왼쪽과 오른쪽에 있는 이름, 나이, 혈액형 값을 추출(뽑아오기 해서
		 *  뽑은 값들을 String[] 배열에 차례대로 저장
		 */
		//String[] 배열인 arr의 각각의 방에 들어있는 값을 읽어와서 화면에 표시하는
		//향상된 for문을 작성하기
		for(String value2 : arr) {
			System.out.println(value2);
		}
	}

}
