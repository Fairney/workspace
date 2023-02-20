package pkg3;

import java.util.Arrays;

/*
 * 1. 첫번째 다형성 예제
 * -> 메소드를 정의할 때 매개변수를 선언할 수 있는 데 매개변수의 타입(클래스)을 부모 클래스로 선언
 * ->이유: 자동 형 변환
 *  -> 부모클래스명 매개변수명 = new 자식클래스명();
 *  Product p = new GamePack();
 *  Product p = new Machine();
 */
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer buyer = new Buyer();
		/*
		 * 1. 자동형 변환 성질을 이용하면 객체 참조형 변수를 하나만 선언 가능
		 */
		
		GamePack[] arrPack = new GamePack[3];
		Machine[] arrMachine =new Machine[3];
		
		Product p = new GamePack();
		p.productName = "포켓몬";
		p.price = 100000;
		p.bonusPrice= 100;
		System.out.println("게임팩 객체의 정보를 아래와 같이 화면에 표시합니다.");
		System.out.println("가격:"+p.price);
		System.out.println("보너스 포인트:" + p.bonusPrice);
		System.out.println("이름: " + p.productName);
		p.show();
		System.out.println(p.hashCode());
		arrPack[0] = (GamePack) p;
		p = new Machine();
		arrMachine[0] = (Machine)p;
		System.out.println(p.hashCode());
		p.price = 500000;
		p.bonusPrice = 300;
		p.productName = "엘다";
		System.out.println("Machine 객체의 정보 표시");
		System.out.println("가격:" + p.price);
		System.out.println("가격:" + p.bonusPrice);
		p.show();
		System.out.println(arrMachine[0].productName);
		System.out.println(arrPack[0].productName);
		
	}

}
