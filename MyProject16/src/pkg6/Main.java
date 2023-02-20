package pkg6;
import java.util.Scanner;
/*
 * 사용자에게 결제 방법을 선택할 수 있는 메뉴를 보여줍니다.
 * -예) 1. 현금 2. 카드
 *  - 만약 사용자가 1을 선택하면 Cash 클래스를 사용해서 객체를 생성하고 payment() 메소드를 호출
 *  -만약 사용자가 2를 선택하면 Card 클래스를 사용해서 객체를 생성하고 payment() 메소드를 호출
 */
public class Main{
	static boolean loop = true;
	static void selectPayment(int a)
	{
		Payment p = null;
		if(a == 1) {
			p = new Cash();
			p.payment();
		}
		else if(a == 2) {
			p = new Card();
			p.payment();
		}
		else {
			exit();
		}
			

	}

	public static void exit() {
		System.exit(0);
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		while(loop) {
			System.out.println("결제 수단을 선택하세요 1. 현금결제 2. 카드결제");
			
			
			a = sc.nextInt();
			selectPayment(a);
			
		}
		sc.close();
	}

}
