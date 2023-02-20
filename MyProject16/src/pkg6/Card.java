package pkg6;

public class Card implements Payment{

	//카드 결제시에 사용하는 클래스를 정의
	@Override
	public void payment() {
		System.out.println("카드로 결제를 합니다.");
		

	}

	

}
