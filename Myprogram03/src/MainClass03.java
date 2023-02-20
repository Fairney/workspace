//1. 사용자로부터 키보드 입력을 변수로 받는 예제.
//2. Scanner 클래스를 사용: 목적은 사용자로부터 키보드 입력을 받기 위함.
import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Scanner ㅋ르래스 이름을 사용하는 형식.
		// - 클래스이름 변수이름;
		// - 변수 선언 형식과 동일.
		Scanner scan = new Scanner(System.in);
		
		//2)초기화 형식
		// - 변수 이름 = new (연산자) 클래스이름(키보드_참조_변수명);
		// - 키보드_참조_변수명: 참조는 배열(비유: 아파트의 호수 또는 방의 일련 번호)
		// - System.in 변수가 프로그램이 실해될 때 갖게 됩니다.
		//3_ 사용자에게 메시지 입력 요청을 보냅니다.(안내 메시지)
		System.out.print("입력하세요!");
		//String a = scan.nextLine();//nextLine() 함수: 사용자가 입력한 한 줄 전체를 문자열로 갖고 옴.
		// - 사용자는 한 줄에 무언가를 입력하고 입력의 종료를 뜻하는 엔터 키를 눌러야함
		//System.out.println("입력한 내용은?" + a);
		/*
		 * print() 또는 println()함수 안에서 + 기호는 문자열 결합(연결 또는 추가)
		 * -산술 덧셈 계산이 아님
		 * -그러므로 + 기호 왼쪽 또는 오른쪽에 하나 이상의 문자열이 존재해야함.
		 * */
		//nextLine() next(), nextInt() 3개의 함수를 함께 사용하면 입력을 받지 못할 수도 있습니다.
		//nextLine(), next(): 문자 입력 처리에 사용 - > 사용자가 엔터 키를 누르면 엔터 키도 문자로 변환해서 변수에 저장.
		//nextInt - 정수만 가져옴. enter 안가져옴.
		//일반적으로는 nextLine() -> nextInt() 또는 next() - > nextInt()
		
//		System.out.print("공백을 기준으로 화면에 표시할 내용을 입력하세요: ");
//		String user2 = scan.next();
//		System.out.println("사용자가 입력한 내용은 " + user2);
		
		//nextInt()
//		System.out.print("정수만 입력하세요");
//		int user3 = scan.nextInt();
//		System.out.println("정수" + user3);
//		
//		System.out.print("실수만 입력하세요");
//		double user4 = scan.nextDouble();
//		System.out.println("실수" + user4);
		
		//1. 형식
		//String 변수명 = 스캐너변수명.nextLine();
		//System.out.println("사용자가 입력한 모든 값들은" + 변수명);
		//만약 사용자가 입력한 내용이 홍길동 20 3.14 입력후에 엔터 키를 누른 경우
		//변수명을 가진 변수에는"홍길도 20 3.14" 가 저장
		
	    //2. 변수명을 가진 변수가 갖고 있는 값중에서 "홍길동"만 가져오기
		//1 String 클래스가 내부에 갖고 있는 split() 함수를 사용
		//split()-하나의 전체 문자열 중에서 특정 값을 하나 또는 여러 개 가져오는 기능 String[] 변수명= new String[]//String[] 변수명2 = 변수명.split(" ");
//		
		String g1 = scan.nextLine();
		String[] g2 = g1.split(" ");
		System.out.println("사용자가 입력한 이름은 " + g2[0]);
		System.out.println("사용자가 입력한 나이는 " + g2[1]);
		System.out.println("사용자가 입력한 시력은 " + g2[2]);
		/*
		 * 1) 최종 결과는 실수: double 형 실수(기본 자료형)
		 * 
		 * */
		double d = 0.0;
		double e = 0.0;
		//덧셈 계산 결과를 보관할 변수를 선언
		double f = 0.0;
		//사용자가 입력한 정수는 g1[1] 공간에 저장
		d= Double.parseDouble(g2[1]);//형변환으로 string값이 double로 변환
		/*
		 * Double 클래스의 parseDouble() 함수를 사용
		 * g1[2]의 값인 "3.14"을 3.14로 가져온다.
		 * */
		e= Double.parseDouble(g2[2]);
		f = d + e;
		System.out.println(g2[1] + " + " + g2[2] + " = " + f);
		scan.close();
		//Scanner 클래스의 내부 함수인 close를 사용
		//close: 사전적의미는 문을 닫기, 키보드를 사용, 더 이상 키보드를 사용하지 않는 경우에 사용하는 함수.
		//리소스 부족.
		
	}

}
