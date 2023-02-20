import java.util.Scanner;
public class MainClass02 {

	public static void main(String[] args) {
		
		//1.Scanner 클래스를 사용하기 위한 변수를 선언 + 초기화
		
		Scanner sc = new Scanner(System.in);
		System.out.print("yes 또는 no를 입력하세요: ");
		String st =sc.nextLine();
		if(st.isEmpty() == true) {
			System.out.println("사용자는 아무런 값을 입력하지 않았습니다.");
		}
		else if(st.equalsIgnoreCase("yes") == true) {
			System.out.println("사용자는 yes를 입력하셨습니다.");
		}
		else if(st.equalsIgnoreCase("no") == true) {
			System.out.println("사용자는 no를 입력하셨습니다.");
		}
		else
			System.out.println("사용자는 다른 것을 입력하셨습니다.");

		while(st.equalsIgnoreCase("yes")) {
			System.out.println("안뇽하세용?");
			System.out.println("지속하시려면 yes를 써주세요");
			st =sc.nextLine();
			
		}
		System.out.println("프로그램 종료");
		
		
		
		do
		{
			System.out.println("졸려 뒤지겄네.");
		 st= sc.nextLine();
			
		}while(st.equalsIgnoreCase("yes")==true);
		/*
		 * for 반복문에서는 조건식은 생략 가능
		 * ->컴파일러는 내부적으로는 true값으로 판단
		 * for(;true;)-> for(초기식; ; 증감식)-> while(true)
		 */
		for(int i=1; ; i++) {//자바에서 조건식을 비웠을 때 컴파일러는 true값으로 처리한다.
			System.out.println(i+ "출력");
			if(i>=10) {
				System.out.println("변수 i의 값인 10보다 같거나 커짐");
				break;
			}
		}
		System.out.println("for 반복문을 벗어난 위치에서 제일 먼저 실행");


		int j = 1;
		boolean c = true;
		while(c)
		{
			System.out.println(j+ "출력");
			if(j>=10) 
			{
				//break; 여건 여기서 끝.
				c = false;//이건 밑까지 다 하고 끝.
				
			}
			System.out.println("1.");
			j++;
			System.out.println("2.");
		}
		
		//continue 문의 사용 범위: 반복문
		//if문, switch~case문에서는 불가능.
		//- 기능: 아래에 있는 명령어들을 실행하지 않고, 반복문의 조건식으로 이동
		// -조건식을 구분: for문은 증감ㅅ식으로 이동, while문과 do~while문은 조건식으로 이동
		
		for(int i = 1; i<=10; i++)
		{
			if(i%2==0) {
				System.out.println("변수 i의 값은 짝수");
				continue;
			}
			System.out.println("변수 i의 값은 홀수이고 실제 값은 " + i);
		}
		
		/*
		 * 변수 j의 값이 짜굿이면 화면에 표시하는 for문을 사용
		 * -continue문을 사용.
		*/
		for(int j2 = 1; j2<=10;j2++)
		{
			if(j2%2!=0)
				{System.out.println("홀수입니다.");
				continue;
				}
			else {
				System.out.println("짝수입니다."+j2);
				
			}
			System.out.println("짝수일때만 실행");
			
		}
		
		/*
		 * while ㅂ반복문과 continue문을 함께 사용
		 * -변수 ex1의 값이 홀수이면 화면에 표시
		 * -변수 ex1의 값이 짝수이면 화면에 표시하지 않음.
		 */
		int ex1=0;
		while(ex1<=10) {
			if(ex1%2==0) {
				ex1++;
				continue;
			}
			System.out.println(ex1+"ex1");
			ex1++;	
		}
//		while(ex1<=10) {
//			if(ex1%2!=0) {
//				System.out.println("홀수입니다."+ex1);
//			}
//			
//			ex1++;
//		}
		
		
		ex1=0;
		/*
		 * do~while
		 */
		do
		{
			if(ex1%2==0) {
				ex1++;
				continue;
			}
				
			System.out.println(ex1+"ex1");
			ex1++;
		}while(ex1<=10);//do while문은 조건식으로 향함(while도 마찬가지.)
		
		sc.close();
		
		
	}

}
