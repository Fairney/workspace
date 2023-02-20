
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.awt.Robot;
public class ifEx {

	public static void main(String[] args) {
		double a = Math.random();
//		String chulsu;
//		String yeongHee;
//		if(a<=0.33) {
//			chulsu = "가위";
//		}
//		else if(a>0.33)
//		{
//			chulsu = "바위";
//		}
//		else
//			chulsu = "보";
//		
		Scanner sc = new Scanner(System.in);
//		System.out.println("영희가 낼 것을 쓰시오");
//		yeongHee = sc.next();
		
		int score = (int)(Math.random()*10)+1;
		int score2 = (int)(Math.random()*10+1);
		System.out.println(score);
		System.out.println(score2);
		
		Random b = new Random();
		int c = b.nextInt();
		System.out.println("정수형 난수는 " + c);
		/*
		 * nextInt( 정수 값);
		 * - 난수를 만들 때 기본 범위가 변경: 0 ~ 정수 값 -1
		 * - 예) 정수 값을 5로 작성하면 0 ~ 4 까지의 범위 중에서 무작위로 하나의 정수
		 */
		int d = b.nextInt(5) + 1;//nextInt(n)->0에서 n-1 사이의 정수값이 무작위로 나옴. 
		System.out.println(d);
		
		/*
		 * 컴퓨터와 사람 간의 가위/바위/보 게임 규칙을 만들기
		 * 가장 직관적인 방법은 String으로 쓰기.
		 * 	- 사람이 직접 입력하는 방식.
		 *  - String human;
		 */
		//먼저 Scanner 클래스를 사용해서 입력 받기: "가위"/"바위"/"보"
		int computerRandom;
		String computerTurn;
		System.out.print("가위/바위/보 중에서 하나만을 입력하세요.");
		String human = sc.nextLine();

		if(human.equals("가위") ||human.equals("바위") ||human.equals("보"))
		{
			System.out.println("사람이 낸 것은 " + human);//중괄호를 쓰지 않으면 명령문이 두개였을때 위에 것만 해당되고 명령문2는 남남이 돼서 무조건 실행된다.
			System.out.println("사람이 낸 것은 가위 바위 보 중에 하나를 내었습니다");
			Random rand = new Random();
			
		}
		else {
			System.out.println("사용자가 정해진 값을 입력하지 않으셨습니다.");
			/*
			 * 이 위치에 작성할 수 있는 if 조건문의 종류 : if(조건식)/else if(조건식)/else
			 */
			System.out.println("else 블럭을 실행");
			System.out.println("사용자가 낸 것은 가위/바위/보 도 아닌 다른 것");
		}
			
		/*
		 * 프로그램에서 사용자로 부터 입력 받을 값을 정하기
		 * -"가위", "바위", "보"(문자열)
		 * -if 조건문을 추가하기
		 * - 형식)
		 * if(human.equals("가위") ||human.equals("바위") ||human.equals("보"))
		 */
		/*
		 * 컴퓨터도 문자열로 처리
		 * -난수: 숫자 -> 문자열로 변환하는 명령어가 필요
		 * 예) Random b = new Random();
		 * 
		 * String computer;
		 * 정수형 변수가 또 필요: 이유는 nextInt(3)+1
		 * ->3은 값의 총 갯수: 이유는 "가위","바위","보"의 갯수가 3개
		 * int t = b.nextInt(3)+1;
		 * -1 ~3 중에서 하나의 정수 값이 변수 t에 대입
		 * 변수 computer의 값을 정하기
		 * - 기준: 변수 t의 값에 따라서 서로 다른 문자열을 대입
		 * 개발자가 알고리즘을 구현(규칙을 정하기)
		 * 1) 만약 변수 t의 값이 1이 된다면 "가위" 문자열 값을 변수 computer에 대입하기
		 * - if(t == 1) computer = "가위";
		 * 2) 만약 변수 t의 값이 2가 된다면 "바위" 문자열 값을 변수 computer에 대입하기
		 * - else if( t==2) computer = "바
		 */
		
		/*
		 * 컴퓨터가 "가위"/"바위"/"보" 중에서 하나를 내도록 명령어를 추가하기
		 * - 난수로 처리하기
		 */
		String computer = "";
		int t = b.nextInt(3)+1;
		if(t == 1 ) computer = "가위";
		else if(t == 2) computer = "바위";
		else if(t == 3) computer = "보";
		System.out.println("컴퓨터가 낸 것은 " + computer);
		
		boolean r1 = human.equals("가위") && computer.equals("가위");
		boolean r2 = human.equals("바위") && computer.equals("바위");
		boolean r3 = human.equals("보") && computer.equals("보");
		if(r1 || r2 || r3) {
			System.out.println("무승부");
		}
		else{
			if(human.equals("가위")&& computer.equals("바위")) {
				System.out.println("사람 패배");
				System.out.println("컴퓨터 승리");
			}
			else if(human.equals("가위")&& computer.equals("보")) {
				System.out.println("사람 승리");
				System.out.println("컴퓨터 패배");
			}
			else if(human.equals("바위")&& computer.equals("보")) {
				System.out.println("사람 패배");
				System.out.println("컴퓨터 승리");
			}
			else if(human.equals("바위")&& computer.equals("가위")) {
				System.out.println("사람 승리");
				System.out.println("컴퓨터 패배");
			}
			else if(human.equals("보")&& computer.equals("가위")) {
				System.out.println("사람 패배");
				System.out.println("컴퓨터 승리");
			}
			else if(human.equals("보")&& computer.equals("바위")) {
				System.out.println("사람 패배");
				System.out.println("컴퓨터 승리");
			}
		}
	}	

}
