package pkg5;

import java.util.Scanner;
import java.util.Vector;

class Shape{
	public void draw() {
		System.out.println("도형을 그립니다.");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("선을 그립니다.");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("원을 그립니다.");
	}
}
class Rec extends Shape{
	public void draw() {
		System.out.println("사각형을 그립니다.");
	}
}
class Ellipse extends Shape{
	public void draw() {
		System.out.println("타원을 그립니다.");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<Shape> collect = new Vector<>();
		
		System.out.println("1. 선그리기 2. 원 그리기 3 .사각형 그리기 4. 타원형 그리기");
		int a = 1;
		while(a<5&&a>0) {
		a = sc.nextInt();
		
		switch(a) {
		case 1:
			Line line = new Line();
			line.draw();
			break;
		case 2:
			Circle circle = new Circle();
			circle.draw();
			break;
		case 3:
			Rec rec = new Rec();
			rec.draw();
			break;
		case 4:
			Ellipse ellipse = new Ellipse();
			ellipse.draw();
			break;
		default:
			System.out.println("없는 번호를 입력하셨습니다.");
			
			
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		
		
		
		
		
		
	}

}
