package pkg3;

public class GamePack extends Product {
	public GamePack() {
		this.price = 0;
		this.bonusPrice = 0;
	}
	public GamePack(int price, int bonusPrice) {
		this.price = price;
		this.bonusPrice = bonusPrice;
	}
	public void play() {
		System.out.println("이것을 ");
	}
}
