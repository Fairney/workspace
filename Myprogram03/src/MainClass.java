
public class MainClass {
	
	/*
	 * 1. 기본 자료형인 int를 사용해서 정수 10을 변수에 저장/불러오기/모니터에 표시
	 * 1) 먼저 변수를 선언하는 명령어를 작성
	 *  - 형식: 자료형 변수이름;
	 *   -자료형: int, string, double,
	 *    변수 이름: 알파벳 소문자, 대문자, 숫자,$, _(밑줄 문자) 가능. 비영어권 글자
	 *     -예) a(사용가능) A(사용 가능), _a(사용 가능), 아(사용 가능), $a(사용 가능) a3(사용 가능) 3a(불가능-숫자는 맨앞에 오면 변수가 되지 않음)
	 *          예약어(사용 불가능-int, string, public, class)
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 변수 선언 명령어를 먼저 작성
		int a,b,c;
	    // 2. 초기화 = 대입연산자 사용
		// - 기능: 변수에 특정 데이터를 저장(대입 또는 할당)
		// - 형식: 변수명 = 데이터(값);
		// - 변수명: 위에서 선언한 변수 이름과 같게 작성해야 한다.
		a = 100;
		b = 100;
		//100은 사이다로 비유. a는 컵. a는 이제 사이다가 들어간 병과 같다.
		// 3. 연산
		c = a+b;
		System.out.println(c);
		
		/*
		 * 변수 a의 기본적으로 정해져 이쓴 최소값과 최대값을 확인하는 예제
		 * - 이유: 커볻 크기를 갖고 있듯이 변수도 눈에도 보이지 않지만 메모리 장치
		 * 내부에서 크기를 갖고 있습니다.
		 * - 자바에서는 java.lang.Integer 클래스를 제공.
		 *  - int 자료형과 의미가 같음
		 *   -클래스에서 더 자세히 다룰 예정.
		 *   
		 * */
		System.out.println(java.lang.Integer.MAX_VALUE);
		//최대값
		System.out.println(java.lang.Integer.MIN_VALUE);
		//최소값.
		
		final int A = 200;
		
		// A= 300;
		// Integer.MAX_VALUE + 1; -> 덧셈 계산 -> 값(결과)-> 컴파일러가 숫자의 범위를 재조정->기본적으로 값의 범위를 현재 범위에서 더 넓힘
		//-> int 자료형 보다 더 값의 범위가 큰자료형 long으로 변환 -> 값이 짤리는 현상을 없애기 위함(값의 유실)
		// Integer.MAX_VALUE + 1L ->L의 의미는 int -> long으로 변환 - int +long -> long +long(upcasting)
		//Integer.MAX_MAX_VALUE +1;
		//숫자 뒤에 엘(l) 또는 대문자 (L)을 사용하기
		long c1 = 1L;
		//int d = 1L; //방의 크기는 int인데 들어갈 것이 long이라 규격에 맞지 않음.
		// Integer.MAX_VALUE 최대값이 저장되는 메모리 공간의 구조는 원형 큐 ->최대값 +1 은 최소값. 최소값 - 1 은 최대값.
		System.out.println((Integer.MAX_VALUE+1));
		System.out.println((Integer.MIN_VALUE-1));
		//Long Wrapper 클래스
		System.out.println((Long.MAX_VALUE));
		System.out.println((Long.MIN_VALUE));
		
		String name;
		name = "홍길동";
		System.out.println(name);
		
		String name2;
		name2 = "홍길동2";
		System.out.println(name2);
	}

}
