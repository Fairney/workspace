import java.util.Scanner;

/*
 * 1. 자료형
 * 1) String : 사람의 이름처럼 긴 문자열을 저장
 * 2) char: 한 글자만을 저장(이유: char는 character의 약어로 사전적 의미는 한 글자.)
 * 3) double: 실수 3.1415926535897..를 저장.
 * 4) boolean: 논리 true, false
 * */
public class MainClass2 {

	public static void main(String[] args) {
		String name = "홍길동";
		System.out.println(name);
		
		//2) 남 또는 여와 같이 한 글자만을 변수에 저장
		//1)String 자료형도 가능: 내부적으로 변수의 크기를 값의크기(자릿수) 만큼 재조정(최적화)
		//2) char
		
		String gender = "남";
		String gender2 = "여";
		
		//char 변수명 = '한글자만을 저장';
		// ' ' 작은 따옴표만을 사용해야 한다.
		char cgender = '남';
		char cgender2 = '여';
		System.out.println(gender);
		System.out.println(gender2);
		System.out.println(cgender);
		System.out.println(cgender2);
		
		boolean tf = true;
		System.out.println(tf);
		tf = false;
		System.out.println(tf);
		
		double d = 3.14;//컴파일러가 관리 실수는 큰 쪽을 잡아줌(8바이트)
		System.out.println(d);//float는 개발자가 관리.
		
		//float 자료형을 사용할 때 주의사항: 실수인 3.14 뒤에 float 형을 의미하는 f를 붙여야함
		// -f를 붙이지 않으면 컴파일러가 기본적인 자료형인 double형으로 확장(조정 또는 형 변환)
		// -즉 실수 다음에 f를 붙이면 double 형에서 float 형으로 강제 변환
		float f = 3.4f;
		System.out.println(f);
		
		System.out.println(Double.MAX_VALUE);//사용 방법: Double.MAX_VALUE 문장 단위로 작성.
		System.out.println(Float.MAX_VALUE);//지수 : Exponenet
											//용도: 실수 뒤에 0이 너무 많은 경우
											//e정수->정수 개 만큼의 0을 생략.
											//만약 계산기 프로그램을 구현하는 경우에 초과하는 경우가 발생
											//java.math 패키지에 있는 BigDecimal 클래스
											//최대값과 최소값의 범위를 갖지 않음.
		System.out.println(Float.MIN_VALUE);//E뒤에 있는 것을 나누는 것.1.4/10^45승.
		//1. 실무에서 가장 많이 사용되는 자료형: String -java.math.BigDecimal 글자수를 제한하지않음. 내부에 String을 사용. 실수(float, double 형의 실수를 String 형으로 바꾸어서 보관)
		//예)3.14-> "3.14"
		//예)3.14f-> "3.14f"
		
		System.out.println("3.14"+3.14);
		System.out.println(3.14+3.41);
		System.out.println("3.14"+ "3.15");
		
		String sd = "3.14" + 4.14;
		System.out.println(sd);
		
		//사용자로 부터 키보드를 데이터를 입력받는 경우
		//입력 받는 시점: 프로그램이 실행되는 중간(도중)에 넣는 방법
		//System 클래스가 갖고 있는 in 객체를 사용.
		//java.util 패키지가 갖고 있는 여러 클래스 중에서 Scanner 클래스.
		//사용자로부터 모니터 화면에 보여줄 문자열을 입력 받아서 모니터 화면에 표시하는 예제.
		//Scanner 클래스 이름을 사용하는 방법 2가지: import 명령어를 작성, Scanner 클래스 이름을 사용할 때마다 java.util.Scanner를 앞에 붙이는것.
		//만약 한번만 사용하는 경우에는 후자. 여러번 사용하면 import.
		Scanner scan = new Scanner(System.in);
		scan.close();
		
}

}
