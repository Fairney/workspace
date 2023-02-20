package pkg3;

import java.util.ArrayList;

public class Buyer {
	ArrayList a = new ArrayList();
	public void buy(Product p) {
		System.out.println("소비자(구매자)가 물건을 구매합니다.");
		System.out.println("물건의 정보를 출력합니다.");
//		a.add(0,p);
//		if(a.get(0) instanceof)
		if(p instanceof GamePack) {
			System.out.println("게임팩 제품입니다.");
		}
		else if(p instanceof Machine)
		{
			System.out.println("구동장치입니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
