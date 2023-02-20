import java.util.Random;
import java.util.Scanner;
public class MainClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		switch(a) {
		case 1:
			System.out.println("나는 1입니다.");
			System.out.println("나는 1입니다.");
			System.out.println("나는 1입니다.");
			break;
		case 2:
			System.out.println("나는 1입니다.");
			break;
		}
	int score = 0;
	String grade;
	switch(score/10){
	case 9:
		grade = "A";
		break;
	case 8:
		grade = "B";
		break;	
	case 7:
		grade = "C";
		break;
	default:
		grade = "F";
		break;
	}
	System.out.println(grade);
	
	//case문을 작성하는 경우
	/* 여러 경우의 수를 한꺼번에 쓰는 법.
	 * case 0:case 1:case 2:case 3:case 4:case 5:
	 * grade = "F";
	 * Break;
	 */
	
	/*
	 * switch ~case문의 이해를 위해서 경우의 수가 3개 이상인 주사위 던지기 게임을 구현하기
	 * if ~ else if 문을 사용해서 구현
	 * --> 조건식 마다 중복되는 변수명, == 연산자를 없애주는 switch~case 문을 사용해서 구현
	 */
	//2. 난수를 만들어주는 Random 클래스를 사용.
	Random random = new Random();
	int diceNum = random.nextInt(6)+1;
	if(diceNum == 1){System.
		out.println(diceNum + "입니다");}
    else if(diceNum == 2){System.out.println(diceNum + "입니다");}
    else if(diceNum == 3){System.out.println(diceNum + "입니다");}
    else if(diceNum == 4){System.out.println(diceNum + "입니다");}
    else if(diceNum == 5){System.out.println(diceNum + "입니다");}
    else if(diceNum == 6){System.out.println(diceNum + "입니다");}
    else System.out.println(diceNum + "주사위에서 나올 수 없는 값입니다.");
	System.out.println("***Switch Case문 예제***");
	
	
	switch(diceNum) {
	case 1://case 문 작성 형식: case 공백문자 값 콜론(:)
		   //콜론(:) 기호: case 값과 실행할 문장을 구분
		System.out.println(diceNum + "입니다");
		break;
	case 2:
		System.out.println(diceNum + "입니다");
		break;
	case 3:
		System.out.println(diceNum + "입니다");
		break;
	case 4:
		System.out.println(diceNum + "입니다");
		break;
	case 5:
		System.out.println(diceNum + "입니다");
		break;
	case 6:
		System.out.println(diceNum + "입니다");
		break;
	default:
		System.out.println(diceNum + "주사위에서 나올 수 없는 값입니다.");
		break;//if ~ else 문에서 else역할을 수행한다. default잊지말기.-실무에서는 다쓴다.
		//다중 if문을 간소화 시켰다잉~
}
		
		/*
		 * 실행 흐름
		 * - 변수 b의 값과 case 다음의 값 1이 같은지를 비교
		 * - 만약 같다면 콜론 다음으 ㅣ문장을 실행
		 * - 만약 다르면 break 문장 아래에 있는 다른 case문을 실행
		 */
		/*
		 * switch~case문은 사용자에게 여러 개의 메뉴 번호 또는 메뉴 문자를 보여주는 경우에 사용
		 * 
		 * 예1) 1. 덧셈 계산 2 뺄셈 계산
		 * - 메뉴 번호란? 사용자가 키보드를 사용해서 입력할 수 있는 숫자
		 * 예2) 첫번째 메뉴 덧셈 계산
		 * 예3) 가위/바위/보 중에서 하나를 입력하세요.
		 * -> 즉, 사용자로부터 입력 받을 값의 범위가 좁은 경우에 주로 사용
		 * 	-> 메뉴 번호도 한 자리 정수
		 */
		/*
		 * Scanner 클래스 사용해서 사용자로부터 가위/바위/보 중에서 하나를 입력받기.
		 */
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("가위/바위/보 중에 하나를 입력하시오: ");
//		String d = sc.nextLine();
//		switch(d) {
//		
//		case "가위" : 
//			System.out.println("사용자는 가위를 냈습니다.");
//			break;
//		case "바위" : 
//			System.out.println("사용자는 바위를 냈습니다.");
//			break;
//		case "보" : 
//			System.out.println("사용자는 보를 냈습니다.");
//			break;
//		default : 
//			System.out.println();
//		}
		
		for(int e = 1; e <=10;++e)
		{//쉼표(,) 기호는 마지막 숫자 다음에는 표시되지 않음. 
//			//쉼표 기호를 추가
			if(e>= 1 && e < 10)
			{
				System.out.print(e);
				System.out.print(",");
			}
			else
				System.out.print(e);
//			if(e==10) {
//			System.out.print(e);
//			}
//			else{
//				System.out.print(e+",");
//			}
//			System.out.println(e);
			
		}
		
//		int sum = 0;
//		
//		for(int i = 0; i<=100; i++) {
//			sum+=i;
//		}
//	
//		System.out.println(sum);
		System.out.println();
		int sum2 = 1;
		int j = 1;
		for(int i = 2; i<=100; i++,j++) {//요건 몰랐네.
			sum2+=i;
			//System.out.print(j+ " ");
			System.out.print(j);
			if(j>=1&& j<99)
				System.out.print("+");
			else if(j == 99)
				System.out.print("+" + (j+1) + "=");
		}
	
		System.out.println("\n"+ sum2);
	}
	
	
}


