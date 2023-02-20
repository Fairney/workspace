package pkg6;

public interface Payment {
	//결재방식은 상수로 정의
	public static final String CASH_METHOD = "현금결제";
	public static final String CARD_METHOD = "카드결제";
	//자식 클래스에서 재정의할 payment() 추상 메소드
	public abstract void payment();
	
}
