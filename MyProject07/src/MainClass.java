
public class MainClass {//반복문(Loop 또는 Ierate Statement)
/*
 * for문
 * -중첫 for 문
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 기본 주업 for문 예제");
		
//		for(int a = 1; a<=5; a++) {
//			//변수 a의 역할: 표 구조에서 줄(행)을 결정: 1줄, 2줄, 3줄, 4줄, 5줄
//			for(int b = 1; b<=3; b++) {
//				//변수 b의 역할: 표 구조에서 칸(열)을 결정: 1열,2열,3열)
//				//출력 명령어를 작성: 변수 a와 b의 값의 변화.
//				
//				System.out.println("변수 a의 값: "+a+", 변수 b의 값: " +b);
//			}
//		}
//		
//		for(int a2 = 1; a2<= 9; a2++)//변수는 변하는 값 (1,2,3,4,5,6,7,8,9)
//				{
//					//2단을 화면에 반복적으로 표시하는명령문
//					//- 형식: 2x변하는 값 = 곱셈결과.
//					System.out.println("2x"+ a2 + "=" + (2*a2));
//				}
		
		System.out.println("***3단***");
		for(int a = 1; a <= 9; a++) {
			System.out.println("3x"+a+"="+(3*a));
		}
		
		System.out.println("");
		
		System.out.println("***4단***");
		for(int a = 1; a <= 9; a++) {
			System.out.println("4x"+a+"="+(4*a));
		}
		
		System.out.println("");
		
		System.out.println("***5단***");
		for(int a = 1; a <= 9; a++) {
			System.out.println("5x"+a+"="+(5*a));
		}
		
		System.out.println("");
		
		System.out.println("***6단***");
		for(int a = 1; a <= 9; a++) {
			System.out.println("6x"+a+"="+(6*a));
		}
		
		System.out.println("");
		
		System.out.println("***7단***");
		for(int a = 1; a <= 9; a++) {
			System.out.println("7x"+a+"="+(7*a));
		}
		
		System.out.println("");
		
		System.out.println("***8단***");
		for(int a = 1; a <= 9; a++) {
			System.out.println("8x"+a+"="+(8*a));
		}
		
		System.out.println("");
		
		System.out.println("***9단***");
		for(int a = 1; a <= 9; a++) {
			System.out.println("9x"+a+"="+(9*a));
		}
		/*
		 * 중첩 for문을 사용해서 위에서 작성한 여러 for문을 같은 위치로 모으기(Collection)
		 * for(int a = 1; a<= 9; a++){//변수 a의 값은 같은 줄에서 변하지 않은 값을 제어.
		 * 	for(int b = 2; b<=9; b++{//변수 b의 값은 같은 줄에서 변하는 값을 제어
		 * 	}
		 * }
		 */
		System.out.println("");
		
		for(int a = 1; a<= 9; a++) {
			for(int b =2; b<=9; b++) {
				System.out.print(b + "x" + a+ "="+(a*b)+ " ");
			}
			System.out.println();
		}
		System.out.println("");
		
		
		for(int first =2; first<=9; first++) {
			for(int second = 1; second<=9; second++) {
				if(second==1) {
					System.out.print("***"+first+"단***");
				}
				System.out.print(first + "x" + second + "=" + first*second + " ");
				}
			System.out.println("");
      }	
		System.out.println();
		
		for(int a = 2; a<= 9; a++) {
			System.out.print(" *"+a+"단*" );
		}
		System.out.println();
		for(int first2 =1; first2<=9; first2++) {
			
			for(int second2 = 2; second2<=9; second2++) {
				System.out.print(second2 + "x" + first2 + "=" + first2*second2 + " ");
				}
			System.out.println("");
		}	
		
		
		
		
		/*
		 * while문
		 * 1. 기본형식
		 * 주의사항: 변수 선언 명령어는 while(조건식) 위에 작성해야 합니다.
		 *  - 위에서 선언한 변수 이름과 다른 이름을 만들어야 합니다.
		 *  int i = 1;
		 *  while(i<=10){
		 *  System.out.println(i+ " 출력");
		 *  i++;//또는 ++i;
		 *  2. 실질적으로 while문은 조건식 하나를 사용해서 반복 여부를 결정할 때 사용.
		 *  예)사용자로부터 키보드 입력-계속하시려면 y를 입력하시고,중단하시려면 n을 선택하세요.
		 *  프로그램 작성시에 작성한 내용을 파일에 저장하지 않은 경우
		 *   -메시지 창(다이얼로그: 작은 창)
		 *   초기식,증감식이 없어도 반복 실행 흐름을 생성 가능
		 *   조건식 하나만을 사용
		 *   값이 true. false면 벗어남.
		 *   -형식
		 *   while(true,false, 비교(관계),논리식
		 *   예제)
		 *   while(true){
		 *   System.out.println("무한루프");
		 *   }->프로그램이 논리적으로 종료되지 않는 무한 반복문 구조(infinity loop structure)
		 *   System.out.print("실행되나용");
		 *   
		 */
		int i =1;
		while(i<=10)
		{
			System.out.println(i+ "출력");
			i++;
		}
		for(int i2=1; i2<=10;i2++) {
			System.out.println(i2+ "출력");
		}
		
		//while문을 사용해서 무한 반복문을 작성: 절대로 종료되지 않은 반복문
		//- 사용자가 강제로 종료-> 콘솔창에서 사각빨간 button을 클릭.
		int i3 = 0;
		while(true) {
			
			i3++;
			System.out.println("넌 빠져나갈수 없다!"+i3);
			
		}
		//System.out.println("클");dead code
		/*
		 * for문은 주로 수열(순열) 프로그램을 구현할 때 사용
		 * -원리:범위를 갖는 숫자(문자)를 다룰 때 사용
		 * while 문은 주로 범위를 모르는 경우에 사용: 조건식 하나를 가지고 명령어를 구현
		 * 
		 */
	}

}
