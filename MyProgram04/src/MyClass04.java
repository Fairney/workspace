//1. 논리 연산자를 사용해서 여러 값들을 비교하는 명령어를 하나의 명령어로 합치기
import java.util.*;
public class MyClass04 {

	
	public static void main(String[] args) {
		int a, b, c= 10;
		//c = b =a =10;
		//제일 오른쪽에 있는 a = 10
		//값은 가장 오른쪽에 위치해있어함.
		//-주의사항: 값 10이 변수와 변수 사이에 끼어들면 오류 : c = b = 10 = a(값은 제일 오른쪽에 위치)
		// 10 = a;(오류)
		
		/*
		 * 논리 연산자의 종류
		 * 
		 * 1) 논리 곱 연산자: AND 연산자
		 * 	-기능: 비교(관계) 명령어의 결과가 모두 true인 경웨만 true
		 *  -기호: &&
		 *  -사용 방법: 비교(관계) 명령어1 && 비교(관계) 명령어2
		 *  -예제: 10 == 10 && 20 == 20
		 */
		System.out.println(10 == 10 && 20 == 20);
		
		/*
		 * 논리: Logical
		 * 	-true 또는 false을 판단
		 *  - 사용하는 곳: if 조건문에서 조건(상황 또는 실생활에서 일어날 수 있는 사건)
		 *  -예) 철수가 시험을 볼 예정
		 *  -국어, 영어 시험을 볼 예정
		 *  - 만약 국어 시험 점수가 70점 이상
		 *  - 만약 영어 시험 점수가 70점 이상
		 *  	-2개의 조건을 모두 만족하는 경우에 부모님께 여행을 가도되는지를 허락을 받을 예쩡.
		 *  	-조건들을 명령어로 작성해야 함
		 *  	-논리 연산자를 사용하면 하나의 명령어로 완성
		 *  	-한 줄로 완성(명령어의 간소화 또는 간결화 또는 압축)
		 */
		
		/*
		 * 사용자로부터 국어 점수와 영어 점수를 입력 받기
		 * -Scanner 클래스를 사용하기
		 * -nextInt() 함수를 사용
		 * 1. 먼저 Scanner 클래스를 선언
		 * 2. 사용자가 볼 수 있도록 국어 점수 입력 안내 메시지를 화면에 표시하기 
		 */
		Scanner sc = new Scanner(System.in);
//		System.out.println("국어 점수를 입력하세요");
//		int kor = sc.nextInt();
//		System.out.println("영어 점수를 입력하세요");
//		int eng = sc.nextInt();
//		
//		boolean result = kor>=70 && eng >= 70;
//		
//		System.out.print(result);
//		if(kor >= 70 && eng>=70)
//		{
//			System.out.println("달려가! 어머니한테 허락받으러!");
//		}
//		else
//			System.out.println("도망가! 어머니한테서!");
		
		
//		System.out.print("점수를 입력하세요.");
//		int kor2 = sc.nextInt();
//		
//		boolean result2 = kor2 < 0 || kor2 > 100;//논리 합 연산자의 기능 국어점수가 0~100 범위 바깥에 있는지를 검사.
//		//만약 국어 점수가 음수 30이면 kor2<0 || kor2 > 100 명령어의 실행 결과는 true
//		//지금은 80점 이므로 false
//		System.out.println(result2);
//		boolean result3 = kor2 >= 0&& kor2 <= 100;//논리 곱 연산자의 기능: 국어 점수가 0~100 범위 안에 있는 지를 검사
//		System.out.println(result3);
//		/*
//		 * 논리합 연산자인 
//		 * \\ 기호를 사용하면 필터 기능을 구현 가능
//		 * - 예제에서는 올바른 국어 점수가 0 이상이고 100 이하이므로
//		 *  - || 기호를 사용해서 0미만 또는 100초과 인 경우는 걸러내어야 합니다.
//		 */
//		 //논리 곱 연산자를 사용하면 올바른 국어 점수를 검사
//		boolean result4 = kor2 >= 0&& kor2<=100;
//		System.out.println(result4);
//		sc.close();//잊지 말기.
		
		
		
	}

}
