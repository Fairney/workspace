
public class Goods {

	String name;
	int price ,numberOfStock, sold;
	
	public void set(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		camera.set("Nikon", 400000, 30, 50);
		System.out.println("카메라 이름 : " + camera.name);
		System.out.println("카메라 가격 : " + camera.price);
		System.out.println("카메라 재고 수 : " + camera.numberOfStock);
		System.out.println("카메라 판매 수 : " + camera.sold );
	}

}
