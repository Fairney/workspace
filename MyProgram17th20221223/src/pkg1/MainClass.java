package pkg1;

public class MainClass {
	//프로그램이름: MyProgram20221223
	/*
	 * 예외처리
	 *  - 예외: 실행 오류
	 *  - 처리 -> 대비(준비)
	 *  
	 *  1) 예제1: 산술 예외 상황을 만들기
	 *   - 사용자가 입력한 정수를 0으로 나누는 계산 발생 정수
	 */
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
//		int a= 0;
//		int b,result;
//		result = 0;
//		int c = 0;
//		b=0;
//		
//		System.out.print("하나의 정수를 입력하세요");
//		c = sc.nextInt();
//		if(c == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
//		else {
//			result = b/c;
//		}
		sc.close();
		
		/*
		 * 배열을 사용하는 경우에도 실행 오류가 발생할 수 있습니다.
		 * 형식) 자료형[] 배열명 = new 자료형[방의갯수];
		 * int[] arr =new  int[3];
		 * -> arr[0], arr[1], arr[2]
		 * -> arr[변수명]: 위험한 명령ㅐ
		 */
		
//		a = sc.nextInt();
//		
//		System.out.println(a/0);
//		
//		System.out.println("사용자가 입력한 값은 " + a);
//		System.out.println("");
//		sc.close();
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//System.out.println(arr[3]);
		
		for(int s : arr)
			System.out.println(s);
		for(int i =0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//String 클래스 클래스가 갖고 있는 charAt()함수를 사용하기
		//-charAt() 메소드의 기능: 내부적으로 갖고 있는 char 배열에서 하나의 문자를 반환
			//char: 하나의 문자, at: 전치사 -> String 클래스 내부에 있는 char 배열에서 가져옴
		//	"문자열".charAt(char배열의 방번호 또는 인덱스 또는 첨자);
		// "abcd" 문자열은 char 배열에 다음 처럼 저장되어 있습니다.
		// -{'a','b','c','d'};
		char[] arr2 = {'a','b','c','d'};
		//'a' 문자를 읽으려면 arr2[0]
		System.out.println("배열 arr2의 첫 번째 문자는 " + arr2[0]);
		//'b' 문자를 읽으려면 arr2[1]
		System.out.println("배열 arr2의 두 번째 문자는 " + arr2[1]);
		//'c' 문자를 읽으려면 arr2[2]
		System.out.println("배열 arr2의 세 번째 문자는 " + arr2[2]);
		//'d' 문자를 읽으려면 arr2[3]
		System.out.println("배열 arr2의 네 번째 문자는 " + arr2[3]);
		System.out.println("=====================================");
		int index2 = 4;
		if(index2>=0&& index2 < arr2.length) {
			System.out.println("방 번호는 0 이상이고 " + arr2.length + " 보다 하나 작음");
			System.out.println(arr2[index2]);
		}
		else
			System.out.println("사용할 수 없는 방 번호 입니다.");
		
		//charAt() 메소드를 사용해서 "abcd" 문자열에서 첫번째 문자인 a를 가졍괴
		
		char value = "abcd".charAt(0);//시험.
		value = "abcd".charAt(1);
		System.out.println("abcd 문자열에서 두 번째 문자를 꺼내오면 " + value);
		value = "abcd".charAt(2);
		System.out.println("abcd 문자열에서 세 번째 문자를 꺼내오면 " + value);
		value = "abcd".charAt(3);
		System.out.println("abcd 문자열에서 네 번째 문자를 꺼내오면 " + value);
		//System.out.println("없는 방번호인 4를 사용해서 문자를 읽어옵니다." +arr2[4]);//오류
		System.out.println("======================================================");
		//value = "abcd".charAt(4);
		//System.out.println("없는 방번호인 4를 사용해서 문자를 읽어옵니다." + value);//오류
		
		/*
		 * 실행 오류가 발생하면 프로그램이 강제 종료가 된다. 이것을 비정상적인 종료라고 칭한다.
		 * 더 이상 실행을 할 수 없다. 그러니 이런 경우를 대비에서 try-catch를 해야한다.
		 * 예외처리를 하면 이어서 실행을 할 수 있다.(오류)
		 */

		/*
		 * 1) 예외처리의 기본 문법
		 * - 형식 : try 블럭(중괄호 기호 시작과 끝 {})
		 *  - 내부적으로 if조건문이 생성됩니다.
		 */
		try {
			//실행오류가 발생할 가능성이 있는 코드를 작성
			//프로그램이 실행될 때 자바에서 예외가 발생하는 것을 알아차린 다음에
			//실행흐름을 catch 블럭 내부로 강제 이동
			int result = 3/0;
		}catch(Exception e) {//업캐스팅
			//변수 e에는 예외 관련정보가 저장
			//-getMessage()메소드를 사용하면 예외 관련 정보를 읽을 수 있습니다.
			//printStackTrace() 메소드는 예외 메소드 호출 관련 내용을 모두 볼 수 있습니다.
			System.out.println("예외발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			//try 블럭 내부에서 실행 오류가 발생하는 경우에 ㄷ이동할 지점을 작성
			//catch 블럭의 형식
			//-catch (예외종류를 선언) {명령어;}
			// - 이유: 모든 실행 오류의 부모 클래스이기 때문이다.
			// ArithticException
		}finally {
			System.out.println("실행 끝");
		}
		
		//- 사용자는 가져오고 싶은 문자의 위치인 인덱스를 지정해야 합니다.
		// - 형식) char 변수명 = "abcd".charAt(0);
		// - "값": 컴파일 시에 String 클래스를 사용해서 힙 메모리에 객체를 생성
			String d = "abcd";
			String e = new String("abcd");
			System.out.println(d);
			System.out.println(e);
	}
		
}
