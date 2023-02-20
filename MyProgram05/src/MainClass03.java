import java.util.Scanner;
public class MainClass03 {

	public static void main(String[] args) {
		//x >= 1 && x <= 100: 변수 x가 가진 값이 1부터 100사이의 값이냐?
		int x = 1;
		
		boolean r = ((x >= 1) && (x <= 100));
		//명령어를 실행하기 전에 변수 x의 위치에 변수 x의 값을 대입해서 생각하기.
		//((1>=1) && (1 <= 100))
		//-> true && true -> 최종 결과는 true
		
		//이건 그냥 써본 것 삼항연산자. x =(x==6) ? x : 6;
		System.out.println(r);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("x에 들어갈 값을 쓰세요");
//		x = sc.nextInt();
//		x = (x==6) ? 10 : 6;
//		System.out.println(x);
		
		//변수 이름 ch는 char 자료형의 앞 두 글자를 땅모
		//ch == 'y' || ch == 'Y : 변수 CH가 가진 문자값이 소문자 'y' 또는 대문자 'Y' 이냐?
		// - 논리 합 연산자인 ||의 기능: 하나라도 true 이면 true
		
		char ch = 'y';
		//또는 char ch = 'Y';
		boolean r2 = ((ch == 'y')||(ch =='Y'));
		// - 'y' == 'y' || 'y' == 'Y'
			//-> ASCII코드 값으로 확인해보자.
		//(int)'y'
		System.out.println((int)ch);
		System.out.println((int)'Y'+32);
		
		System.out.println((int)ch-32);
		System.out.println((int)'Y');
		
		System.out.println('y' - 'Y');
		System.out.println('Y' - 'y');
		
		//ch >= 'a' && ch <= 'z' : 변수 ch가 가진 문자값이 영어 소문자이냐?
		//알파벳 대문자 판단 명령어: ch >= 'A' && ch <= 'Z'
		
		ch = 'a';
		boolean r3 = ch >= 'a' && ch <= 'z';
		System.out.println(r3);
		
		//알파벳 대문자 판단 명령어: ch >= 'A' && ch <='z'
		r3 = ch >= 'A' && ch <= 'Z';
		System.out.println(r3);
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "은 짝수이다");
		}
		else {
			//num을 2로 나눈 나머지가 0이 아니냐? 즉 홀수냐?
			System.out.println(num +"은 홀수다");
		}
		
		if(num % 2 == 1) {
			System.out.println(num + "은 홀수이다");
		}
		else {
			//num을 2로 나눈 나머지가 0이 아니냐? 즉 홀수냐?
			System.out.println(num +"은 짝수다");
		}
		
		
	}

}
