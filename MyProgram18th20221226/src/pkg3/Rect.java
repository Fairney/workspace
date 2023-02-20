package pkg3;
/*
 * 사각형 도형을 표현하는 Rect 클래스를 정의하세요
 * - 필드(멤버변수): 가로 길이와 세로 길이를 보관
 * -정수 또는 실수를 선택해서 사용
 * 예)public class Rect{
 * 	int a, b; or double a, b;
 *  비교할 수 있는 equals도 override
 *  1. 다른 클래스에서 가로와 세로 길이를 입력받는 생성자를 정의
 *  2. toString을 정의해서 아까와 같이 모든 멤버 변수의 값으 읽어서 문자열로 연결한 다음 문자열을 반환:형식은 자유
 *  3. equals() 메소드를 재정의해서 현재 객체(this 참조 변수를 사용)가 갖고 있는 멤버 변수의 값과
 *  //매개변수로 전달되는 비교할 객체가 갖고 있는 멤버 변수의 값을 서로 비교하여 모든 값이 같으면 true를 반환
 *  하나라도 다른 값이 있다면 false를 반환
 * }
 */
public class Rect {
	double x, y = 0;
	public static double PI = 3.1415926;
	
	Rect(double _x, double _y){
		x= _x;
		y= _y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		Rect a = (Rect)obj;
		if(this.x==a.x && this.y==a.y)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		String result = "Rect 객체(" + x + ","+ y +")넓이: " + x*y;
		return result;	}
	
}
	