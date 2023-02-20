package Study;
import java.util.Scanner;
public class MainClass {
/*
 * 첫번째 예제: 5명 학생의 국어 점수들을 변수에다가 저장.
 * 설계(구상하기)
 * 가. 데이터(값)와 함수(기능)
 * 데이터(값): 5명 학생의 국어 점수들을 보관할 수 있는 변수가 필요.
 * 서로 다른 이름을 갖는 변수가 필요해서 선언을 ㄹ해야 합니다.
 */
/*
 * 현재 작성한 프로그램에 사용자 입력을 추가하기.
 * 1.추가할 내용:핸드폰 번호
 * 또는 0xx-xxxx-xxxx, 0xx xxxx xxxx
 */
	
	
	
	public static void main(String[] args) {
		int a = 10,b=20,c=30,d=40,e=50;
		
		int sum=0;
		
		//2.5명 학생들의 국어 점수들을 개별저긍로보관할 수 있는 5개의 변수들을 선언 + 초기화)
		//- 1명이 전학온 경우 : 위에 새로운 변수를 하나만 선언 + 초기화
		// - 50명이 한꺼번에 전학온 경우: 서로 다른 이름을 갖는 변수 이름ㅇ르 50개 추가 + 초기화.
		// -변수으 갑슫릉ㄹ 사용해서 1등, 꼴등, 평균 점수 등을 구함.
		//입력 시간이 소요되어 다른 처리 명령어를 작성할 수 있는 시간이 점점 줄어드는 문제를 안ㄱ 되고, 기본적으로는 반복문에서 반복적으로 처리할 문장 부분에 작성이 불가능.
		System.out.println("변수 a의 값: "  + a);
		System.out.println("변수 b의 값: "  + b);
		System.out.println("변수 c의 값: "  + c);
		System.out.println("변수 d의 값: "  + d);
		System.out.println("변수 e의 값: "  + e);
		
		//3. 배열을 사용해서 5명 학생의 국어 점수들을 컴퓨터에 기억 시키기
		int[] arr01 = {10,20,30,40,50};
		//for문을 사용해서 총점 구하기.
		for(int i = 0; i<arr01.length; i++) {
			sum+=arr01[i];//총점 합치기
			System.out.println("방 번호)인덱스 또는 첨자):" +i + "국어점수: " + arr01[i]);
			
		}
		System.out.println("5 명 학생의 모든 국어 점수를 합한(총점) 결과: " + (arr01[0]+arr01[1]+arr01[2]+arr01[3]+arr01[4]));
		//
		System.out.println(sum);
		System.out.println((float)(sum/(double)arr01.length));
		
		//6. 평균 구하기
		//- 계싼식: 총점(모든 학생들의 국어 점수를 합한 값) /학생 수
		//-예) 150/5 ..a. 결과는 30
		//- 주의사항: 정수 / 정수 ... 결과는 정수
		// 나눗셈 계산시에 나누어 떨어지지 않은 경우: 소수점 아래 값을 구할 수 없게 됨(지금 상태)
		//  - 만약 정수를 실수로 변환하시려면: 150.0/5 또는 150 / 5.0
		
		
		/*
		 * 여러가지 배열을 선언하는 형식들을 살펴보도록 하겠습니다.
		 * 1. 자료형[] 배열이름 = {n, n1....n};
		 * 2, 만약 5명 사람 이름 들을 보관할 수 있는 배열을 선언하기 (초기화 포함)
		 * String[] arr02 = {"a", "b","c","d","e"};
		 * 전체 이름 수를 확인하는 방법: 1) 눈으로 세는 방법, 2) 자바에서 leng 명령어를 제공.
		 * length: 컴파일러가명령어를 번역 할 때 자동으로 만들어주는 변수명
		 * -사용 형식) 배열이름 + 점 연산자 = length -> 5
		 */
		System.out.println("전체이름 갯수: " + arr01.length);

		int index = 5;
		if(index >=0 && index < arr01.length) {
			System.out.println(arr01[index]);
		}
		else
			System.out.println("없는 방 번호를 사용하셨습니다.");
		
		
		//스마트폰에 있는 연락처 관리 프로그램에서 사용하는 방식을 비슷하게 구현
		//- 현재 연락처에 등록되어 있는 사람 수를 사용자로부터 입력받는다.
		String[] arr03;
		String[] arr04;
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		arr03 = new String[size];
		arr04 = new String[size];
		if(size > 0) {
			
			System.out.println("새로 만들어진 배열의 방 갯수는 " + arr03.length);
		}
		else if(size==0){
			System.out.println("사용자가 입력한 방의 갯수는 0입니다.");
		}
		else
			System.out.println("방의 갯수를 음수로 입력함");
		
		//////////////////////////////////////////////////////////////
		if(size == 0) {
			System.out.println("방이 없으므로 입력 받을 수 없습니다.");
		}
		else {
			//Scanner 클래스가 내부에 갖고 있떤 사용자가 입력한 엔터 키 값을 지우는 명령어를 작성
			//s.nextLine(); 또는 String 변수명 = s.nextLine();
			//차이점: s.nextLine(); -> 엔터 키 값을 지움(특정 변수에 대입하지 않기 때문)
			sc.nextLine();//대입하지 않으면 임시변수를 만들어서 넣고 버려버린다. 즉 임시변수를 제거.
			//이유: 엔터 키 값은 사용할 필요가 없으므로.
			//nextLine() -Scnanner 클래스 내부에 갖고 있는 사용자가 입력한 값을 가져오기-모든 값을 가져옵니다., 엔터키의 값도 가져온다.
			//nextInt() 정수만
			//위에서 new String[size] 명령어가 실행되어 배열 내부에 size 갯수 만큼 만들어진 방을 사용
			//- 이유: 연락처 중에서 사람의 이름을 방에 저장하기 위해서 입니다.
			//for문에서 초기식은 방 번호를 결정 -> 0은 첫번째 방.
			for(int index2 = 0; index2 < size; index2++) {
				System.out.println("배열의 방 번호 :" + index2+ "에 보관할 사람 이름을 입력하세요: ");
				String name =sc.nextLine();
				System.out.println("배열의 방 번호 :" + index2+ "에 보관한 사람의 핸드폰 번호를 입력하세요: ");
				//추가로 사용자로 부터 연락처번호를 입력받기
				//- "": 값을 지정하지 않음(빈 문자열 값: Empty String)
				// - 이유 : 실행 오류( 프로그램이 실행하는 도중에 발생하는 오류: 예외처리에서 더 자세히 다룰 예정.
				
				String phoneNum;
				
				
				
				//만약 사용자가 이름을 입력하지 않고 엔터 키만 누른 경우에는 while문을 사용해서
				//꼭 입력하는 안내 메시지를 표시하기
				while(name.isEmpty())
				{
					System.out.println("이름을 입력하시지 않으셨습니다. 다시 입력하세요ㅣ.");
					name = sc.nextLine();
					
				}
				
				do {
					System.out.println("핸드폰 번호를 다시 입력하세요ㅣ.");
					//arr04에 보관하기.
					phoneNum = sc.nextLine();//위에 넣은 값을 초기화한다.
					
					
					}while(phoneNum.isEmpty()==true);
				System.out.println("사용자가 입력한 이름은 " + name);
				System.out.println("사용자가 입력한 핸드폰 번호는 " + phoneNum);
				arr03[index2]=name;
				arr04[index2]=phoneNum;
				System.out.println("배열에 저장된 이름은 " +arr03[index2]);
				System.out.println("배열에 저장된 번호는 " +arr04[index2]);
				}
			
			
			/*
			 * 사용자로부터 입력 받을 항목을 정하기
			 * -스마트폰에 있는 연락처(전화번호) 입력 정보들을 참고
			 * -이름, 전화번호, 이메일, 메모.
			 * 
			 */
			}
	}

}
