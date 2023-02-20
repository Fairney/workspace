package pkg3;
/*
 * 인터넷에서 쇼핑하실 때 구미한 제품의 속성과 행위들을 단순화시킨 클래스를 정의
 * 예) 지갑인 경우 지갑의 가격과 보너스 포인트를 갖고 있습니다.
 * 
 */
public class Product {
	int price;
	int bonusPrice;
	String productName;
	
	
	public Product() {
		
	}
	public Product(int price, int bonusPrice, String productName) {
		this.price = price;
		this.bonusPrice = bonusPrice;
		this.productName = productName;
	}
	//구매한 제품의 가격과 적립 금액을 표시합니다.
	public void show() {
		System.out.println(price+","+bonusPrice+","+productName);
		System.out.println("제품 이름:" + productName);
	}
}
