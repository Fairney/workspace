
public class MainClass03 {

	public static void main(String[] args) {


		//1. 변수 없이 정수 비교하기
		/*
		 * 예1) 10 > 20
		 * 예2) 20 > 10
		 * 예3) 10 > 10
		 */
		System.out.println(10>20);
		System.out.println(20>10);
		System.out.println(10>10);
		
		System.out.println('a'>'b');
		System.out.println('b'>'a');
		System.out.println('b'>'b');
		
		//예7) 문자열을 서로 비교하는 경우에는 String 클래스의 내부 함수인 equals()를 사용해야 합니다.
		//- "홍길동"과 "홍길동"이 모두 같은 문자로 구성되어 있는 지를 비교하기
		/*
		 * -> 내부적으로는 첫 글자부터 서로 비교.
		 *  -> '홍'과 '홍'이 같은지를 비교
		 *   -> 결과는 true
		 *    -> 두 번째 문자인 '길'과 '길'이 같은지를 비교
		 *     - 결과는 true
		 *      -> 마지막 문자인 '동' 과 '동'이 같은지를 비교
		 *       -결과는 true
		 *       
		 */
		System.out.println("홍길동".equals("홍길동"));
		//틀린 이름을 equals() 함수로 비교하기
		//예) "김"과 "기"를 서로 같은지를 비교 -> 다르므로 false
		System.out.println("김".equals("기"));
		
		//마지막 글자가 다른 경우에도 결과는 false
		//예) 홍길동과 홍길순을 서로 하나씩 비교 -> 마지막 글자는 동과 순 -> 다르므로 false
		System.out.println("홍길동".equals("홍길순"));
		//퀴즈: "홍길 "과 "홍길동"
		System.out.println("홍길 ".equals("홍길동"));
		
		//알파벳 소문자와 대문자를 사용해서 문자열을 비교하기
		//1) 같은 소문자 또는 대문자 간에 서로 비교하기
		//예) "ab"와"ab"를 서로 비교하기
		String a = "ab";
		String b = "ab";
		boolean c = a.equals(b);
		System.out.println(c);
		
		/*
		 * 위의 명령어의 실행 순서: a.equals(b) 함수를 실행하고 결과값을 true, false를 만들어서 변수 c에 저장합니다.
		 * 
		 * 알파벳 소문자와 대문자를 비교
		 * "a" 와 "A"를 비교
		 */
		a = "a";
		b = "A";
		c = a.equals(b);
		System.out.println(c);
		
//		예)y(Y)또는 n(N) 또는 yes 또는 no 또는 예 또는 아니요 등 ->저는 사용자로부터 알파벳 소문자 y와 대문자 Y를 묶어서 처리
//		->프로그램 안에서 함께 처리(구분하지 않고)
		
//		-> 사용자가 알파벳 소문자 y또는 알파벳 대문자 Y를 입력하면 같은 명령어를 실행하고 싶은 경우
		//equalsIgnoreCase() 문자열 전부가 같다.
		c = a.equalsIgnoreCase(b);
		System.out.println(c);
		System.out.println("y".equalsIgnoreCase("Y"));
		//"y"와 "Y"를 1 대 1 대응 관계로 비교: equals()함수를 사용
		// -ASCII 코드 값으로 비교 -> false
		System.out.println("y".equals("Y"));
		System.out.println((int)'y');
		System.out.println((int)'Y');
		
		/*
		 * 나머지 5개 크기 비교(관계) 연산자를 사용하기
		 * 
		 * <, >, <=, >=
		 */
		System.out.println(10<20);
		
		//같은 지를 비교하려면 ==
		/*
		 * 10 == 10 (결과는 true):서로 값이 같은지를 비교
		 * 변수명 = 값: 값을 변수에 대입(저장)
		 * 변수명 == 값 또는 변수명 : 변수의 값을 꺼내와서 값과 같은지를 비교
		 */
		System.out.println(10==10);//컴파일 하지 않아도 참이라고 알려주는 노란 밑줄이 그어진다.
		
		int d = 10;
		int e = 10;
		System.out.println(d == e);
		
		/*
		 * 퀴즈: 지금까지 2개의 값을 서로 비교
		 * -만약 3개의 값을 비교하고 싶다.
		 * 주의사항 변수가 필요
		 */
		int f = 10;
		
		boolean g = (d==e);
		boolean h = (d==f);
		
//		boolean h = f == true;
//		boolean i = g == true;
//		System.out.println(h == true);
//		System.out.println(i == true);
		
		
		System.out.println(d==e && d==f);
		System.out.println(g==h);
		
		System.out.println(10>20);
		System.out.println(10>=20);
		System.out.println(10!=20);
		
	}

}
