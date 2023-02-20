package pkg1;
/*
 * 중심을 나타내는 정수 X, Y 와 반지름 RADIUS 필드 (멤버변수)를 가지는
 * Circle 클래스를 작성하려고한다
 * 생성자는 3개의 인자 x,y,radius를 받아 해당 필드를 초기화 하세요.
 */
class Circle{
	int x;
	int y;
	int radius;
	double PI;
	
	public Circle(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle("+ x + "," + y + ")반지름" + radius;
	}
	
	
	
}
public class Main2 {

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		//결과 원 a : Circle(2,3) 반지름5
		
	}

}
