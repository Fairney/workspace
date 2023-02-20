import java.util.Scanner;
import java.lang.Math;
public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("오늘은 5일차 오늘의 기분은 매우 배고픔 + 피곤 + 금요일 좋아~ 최고로 좋아~");
		
		//1) 기본 형식
		/*
		 * if(조건식) 명령문;
		 */
		if(true) System.out.println("안녕하소~");
		if(true)
			System.out.println("만나서 반갑소~");
		if(false) System.out.println("조건식이 거짓입니다");//Dead Code;
		//if(10) System.out.println("조건식이 안돼요"); 논리값이 아님.
		//2. ㅈ건식에 변수명도 사용 가능, 그 대신 boolean 형 변수명
		boolean a = true;
		if(a) System.out.println("논리형 변수 이름 a를 사용");
		//3. 값의 크기를 비교할 때 사용한 비교(관계) 연산자도 조건식에 사용 가능
		// - 이유: 연산 결과가 true 또는 false 중의 하나
		// - 총 6개의 연산자: <, >, >=, <=, ==, !=
		if(a == true) System.out.println("논리형 변수 조건식 == 사용");
		if(a != false) System.out.println("논리형 변수 조건식 != 사용");
		//4. 논리 연산자인 논리 곱 연산자(&&), 논리 합 연산자(||) 
		//논리 부정 연산자(!)
		boolean b = true;
		if(a== true && b == true)System.out.println("논리곱 && 사용");
		if(a== true || b == true)System.out.println("논리곱 || 사용");
		// - 사용 예) (Graphical User Interface) 방식의 프로그래밍: 버튼
		//  - 특정 변수와 버튼을 서로 연결(바인딩)시켜서 사용자가 버튼을 눌렀으면 true로 변수의 값을 바꾸고, 아직 버튼을 누르지 않ㄴ은 경우에는 기본값인 false
		// - 형식) 단항(Unary) 연산자이므로 !식 또는 !값
		// - 예) !true 또는 !true == true
		// - 이항 연산자인 +는 값1 연산자 값2
		if(true == true && true == true) System.out.println("모든 조건이 참");
		if(true == false && true == true) System.out.println("거짓이 포함");
		
		if(true == true || true == true) System.out.println("모든 조건이 참");
		if(true == false || true == true) System.out.println("하나라도 참");
		if(!a){}else{System.out.println("논리형 부정식 ! 사용 조건식 부정");}
		
		// 예1) 1 + 2 + 3 + ... + 100
		// 예2) 1 - 2 + 3 - ...(번갈아가면서 서로 다른 연산을 수행)
		//  -boolean 형의 변수와 함께 사용: boolean 변수명 = true 또는 false;
		//  -변수의 처음 값이 true이면 뺄셈 계산을 수행
		//   -계산을 수행한 후에는 false로 변경해야 합니다.
		if(!!a){}else{System.out.println("논리형 부정식 ! 사용 조건식 참");}
		
		System.out.println("학\r");
		System.out.println("\n");
		System.out.println("학");
		char sequenceA = '\r';
		char sequenceB = '\n';
		System.out.println((int)sequenceA);
		System.out.println((int)sequenceB);
		
		/*
		 * Scanner 클래스의 nextLine() 함수를 사용하면 '\r' + '\n' 문자를
		 * 임시 변수(버퍼: Buffer: 완충장치)
		 * Scanner 클래스의 내부에서 관리하는 1차원 배열
		 * 이유: 사용자가 키보드를 사용해서 입력한 값을 변수로 빨리 가져오기 위함.
		 * 프로그램에서 키보드 장치로 직접 접근하는 속도는 너무 느리기 때문
		 * RAM 장치에 Scanner 클래스 영역에 새로운 변수를 추가
		 * 이유2: 사용자가 입력한 값을 지울 수 있도록 하기 위함
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		int i;
		System.out.println("boolean 값을 넣어보시지");
		try {
		a = sc.nextBoolean();
		System.out.println(a);
		System.out.println("Integer 값을 넣어보시지");
		i = sc.nextInt();
		System.out.println("사용자가 입력한 정수값은 : " + i);
		
		/*
		 *  사용자로부터 입력 받은 국어 점수의 범위를 판단하기
		 *  - if 조건문을 사용해서 만약 국어 점수가 0 보다 작은 경우에는
		 *    모니터 화겸ㄴ에 음수를 입력했습니다. 메시지를 표시하기.
		 */
		if(i<0)
			System.out.println("음수를 입력하셔써!");
		else
			System.out.println("양수를 입력하셔써!");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("깔깔");
		}
		
		/*
		 * 국어 점수의 선택 알고리즘(Algorithm) 구상하기
		 * 1. 사용자로부터 국어 점수를 정수로 입력 받기
		 * 2. 1번에서 입력 받은 국어 점수를 정수형 변수에 저장하기
		 * 3. 2번에서 선언한 정수형 변수의 값을 꺼내와서 0이상이고 100이하인지를 검사(판단)
		 * -60점 미만인 경우에는 불합격 메시지를 화면에 표시하기
		 * -60점 이상인 경우에는 합격 메시지를 화면에 표시하기
		 * -일반적으로 미만과 이상은 겹처서는 안됨
		 * -만약 조건이 겹치는 경우네느 if(조건식1){명령문;}if(조건식){명령문2}
		 * -실행 흐름이 달라짐 if -if의 실행흐름: 모든 조건식을 다 실행많을 수록 성능이 느려질 수 있음)
		 * if-else if 또는 if -else의 실행흐름: 첫번째 조건식이 true이면 첫번째 명령문을 실행하고
		 * 아래부분의 else if 도는 else 부분을 무시한다.
		 * 만약 첫번째 조건식이 거짓: 첫번재 명령문을 무시하고 두번째 조건식을 실행
		 * -성능은 빨라짐
		 * 
		 * 주의사항
		 * if(조건식1) 명령문; //정상
		 * if(조건식1);
		 *  -조건식1: 실행 -> 역할은 명령문을 실행할지 여부를 판단(보조) -> 오류(실행되지 않음)
		 *  
		 *  실행할 문장이 여러개인 경우에는 꼭! {} 블럭 명령어를 작성해야 합니다.
		 *  - 형식
		 *  if(조건식1){
		 *  명령문1;
		 *  명령문2;
		 *  }
		 */
//		int kor, eng;
//		kor = 0;
//		try {
//			
//		kor=sc.nextInt();
//		}catch(Exception e) {
//			
//		}
//		finally {
//		if(kor >=0 && kor <= 100) {
//			if(kor< 60)
//				{System.out.println("불합격");}
//			else
//				{System.out.println("합격");}
//		}
//		else
//			System.out.println("잘못 입력하셨습니다");
//		
//		
//		}
		//화면에 메시지를 출력하면 콘솔 창이 자동으로 화면에 나타나게 됩니다.
		System.out.println("국어 값을 입력하시오");
		i = sc.nextInt();
		if(i>100) {
			System.out.println("100 보다 큰 수를 입력하셨습니다");
		}
		if(i < 60)
			System.out.println("불합격입니다.");
		else if(i>=60) {
			System.out.println("합격입니다.");
		}
		
		if(i<60)
			System.out.println("불합격입니다.");
		
		if(i>=60)
			System.out.println("합격입니다");
		
		/*
		 * 논리곱 연산자를 사용해서 사용자가 입력한 국어 점수가 0 이상이고
		 * 100 이하인지를 판단하기
		 * - 만약 조건이 맞다면 위에서 작성한 합격과 불합격 여부를 추가로 판단하기
		 * 
		 */
		if(i >= 0 && i <= 100) {
			if(i < 60)
				System.out.println("불합격입니다");
			else if(i >= 60)
				System.out.println("합격입니다.");
		}
		sc.close();
		
	}

}
