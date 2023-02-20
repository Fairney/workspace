/*
 * 1. 산술 연산자
 * 1) 혼합(Mix) 연산: 숫자의 자료형이 다른 경우
 *  -예) 정수1 연산자 실수1, 실수1 연산자 정수1
 *  - 값은 임의대로 정해서 사용하시면 됩니다.
 *  - 주의사항: 값의 범위 안에서 사용
 * */
public class MainClass {

	public static void main(String[] args) {
		//1) 10+3.5
		System.out.println((10 + 3.5));
		//2) 13.5 + 아무수
		System.out.println((913.5 + 0.5));
		//3) 우선 순위(Priority)를 생각해야합니다.
		System.out.println((913.5 + 0.5 - 10.5 * 3.5 / 5 % 2));
		System.out.println((913.5 * (0.5 + 2.5)));
		System.out.println(((913.5 * 0.5) + 2.5));
		//4)변수를 활용하여 계산식을 만들고 실행하기
		// - 변수는 값의 자료형에 따라서 결정됩니다.
		//가. 정수 10을 보관할 변수 a를 선언 + 초기화
		int a = 10;
		//나. 실수 3.14를 보과날 변수 b를 선언 + 초기화
		double b = 3.14;
		//다. 변수 a의 값 + 변수 b의 값을 새로운 변수인 c에 대입(저장 또는 할당)
		double c  = a+b;
		//라. 계산 결과를 화면에 표시하기.
		System.out.println(c);
		//마. 실수 값 3.14를 정수형 변수 a에 대입하기
		a = (int)3.14;
		/*
		 * 소괄호 기호 안에 자료형ㅇ을 사용하면 강제 형 변환 명령어가 됩니다.
		 * - 주의사항: 같은 종류의 값 끼리만 가능
		 * - 예) 숫자는 숫자끼리
		 * 형식: () 안에 대입 연산자 왼쪽의 변수의 자료형을 작성(입력)
		 *  -예) a==(int)3.14;
		 *   =해석 실수 값 3.14를 정수형으로 변환((int)3.14)
		 *    -그리고 나서 = 연산자가 동작
		 *     -바뀐 정수 3을 변수형 변수인 a에 저장(대입)
		 *      현재 변수 a가 갖고 있던 값은 지워짐(초기화)
		 */
		 System.out.println(a);
		 
		 char d = 'a';
		 System.out.println(d);
		 //(int)'a' 명령어 의 의미: 소문자a의 ASCII 코드 값으로 변환.
		 System.out.println((int)d);//임시로 변형하는 것 뿐이다. 만약 int형을 (int)를 써서 하면 어떻게 되나? 똑같이 int형이 나올뿐이다.
		 //https://ko.wikipedia.org/wiki/ASCII
		 //'a' +1 
		 // -> 컴파일러는 소문자 a의 ASCII 코드 값을 사용 -> 97을 ㅇ릭어옴
		 //-> int
		 int e = 'a' + 1;
		 // - 덧셈 결과는 98 -> 98은 ASCII코드 'b'의 값이다.
		 System.out.println(e);//98출력
		 System.out.println((char)e);//코드 값에 해당하는 문자를 구하는 명령어(char)ASCII코드값
		 // - 예 (char)98 -> 주의사항 : 98은 ASCII 코드 값 중의 하나 -> 'b'
		 // -> abcd...z 순서로 나열
		 System.out.println(d);
		 System.out.println((char)d);
//		 int i = 0;
//		 
//		 while((char)('a'+ i) != 'z')
//		 {
//			 i++;
//		 }
//		 System.out.println(('a' + i));
		 //1) 변수 없이 명령어를 작성
		 //ASCII 코드 값의 데이터 형: int
		 //강제 형 변환 연산자인(데이터형)값/식...
		 //-문제를 해석: 소문자 z의 ASCII 코드 값을 10진수 (정수형)로 구하세요.
		 //-(int)'z' - >'z'의 데이터 형을 먼저 해석 -> char 형으로 판단 -> (int)를 실행해서 char형을 int형으로 변환.
		 System.out.println((int)'z');
		 //결과: 122
		 //2) 변수를 사용해서 명령어를 작성
		 // -> 현재 프로그램에서 선언되어 있는 여러 변수 중에서 정수형 변수를 찾기(함께 사용)
		 // - 이유: 변수의 선언 명령어를 작성하지 않음.
		 // - 변수 이름 e와 a가  int: 둘 중의 하나를 선태꾸
		 e = (int)'z';
		 //또는 a = (int)'z';
		 System.out.println(e);
		 //실행 결과 : 122
		 e = 'z';//컴파일러가 122로 읽어들어옴.
		 //1. 컴파일러는 번역시에 소문자 'z'의 'ASCII' 코드 값인 10진수 122를 읽어와서
		 // 'z' 위치에 덮어씁니다.
		 // e=122;
		 //e= 122;//같은 결과.
		 System.out.println(e);
		 System.out.println((int)'Z');
		 
		 //퀴즈-형식의 문제가 언제 사용되는지를 설명->반복문을 사용해서 모든 알파벳 소문자들을 화면에 표시하세요.
	}

}
