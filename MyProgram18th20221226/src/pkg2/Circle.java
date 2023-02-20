package pkg2;

public class Circle {
	int x;
	int y;
	int radius;
	//또는 int x,y,radius;
	//멤버 변수에 초기화 일을 수행하는 매개 변수를 갖는 생성자를 정의
	// - 주의사항: 값의 순서 - 객체를 생성하는 명령어인 new Circle(값1, 값2, 값3)
	public Circle(int _x, int _y, int _radius){
		x = _x;
		y = _y;
		radius = _radius;
	}
	@Override
	public String toString() {
		return "Circle("+x+","+y+")반지름"+radius;
		
	}
//	@Override
//	public String toString() {
//		String r = "Circle("+x+","+y+")반지름"+radius;
//		return r
//		
//	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//지금은 재정의해서 멤버 변수의 값이 같은지를 비교
		/*
		 * 멤버변수 목록
		 * 1) x
		 * 2) y
		 * 3) radius
		 */
		//멤버 변수의 값을 비교할 때 사용할 참조 변수명: 현재 객체는 this 비교할 상대방 객체는 obj(매개변수명)
		//1) x의 값이 같은지-주의사항
		Circle cmpobj = (Circle)obj;
		boolean result;
		if(this.x == cmpobj.x && this.y ==cmpobj.y && this.radius == cmpobj.radius)
			return true;
		else
			return false;
	}
	
//	@Override
//	public String toString() {
//		return "Circle("+x+","+y+")반지름"+radius;
//		
//	}
}
