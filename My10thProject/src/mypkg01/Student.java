package mypkg01;

public class Student {

	//2. 학생 번호를 보관할 수 있는 멤버변수를 선언 + 초기화
	public int number = 1;
	public String name = new String("원하는것");
	//3.default 접근 제한자를 사용
	int age = 20;
	static String grade = new String("A+");
	Double[] gradePoint = new Double[]{3.1,3.2}; 
	private int age2 = 30;
	//-> 즉, 선언한 클래스 내부에서만 사용 가능
	// -> 다른 클래스에서는 사용 불가능. 해당 클래스 내부에서만 사용 가능.
	//  -> 패키지도 같아도 사용 불가.
	// -> 관리의 용이함(자바에서 권장사항)
	
	public int getStudentAge2() {
		return age2;
	}
}
