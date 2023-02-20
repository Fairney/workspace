package pkg3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tri tri = new Tri(3,4);
		System.out.println(tri.getArea());
		/*
		 * 주의사항:Tri클래스 내부에서 기본 생성자를 정의하지 않고 매개변수를 갖는 생성자만 정의하면 기본 생성자를 사용할 수 없게함.
		 */
		//2. Tri 클래스에서 정의한 getArea()메소드를 호출해서 삼각형 도형의
		//넓이를 구하고 구한 값을 반환 받기
		double result = tri.getArea();
		System.out.println("삼각형 도형의 정보와 넓이를 표시하기");
		System.out.println("밑변 길이: " + 3 + ", 높이길이: " + 4 + ", 넓이:"+result);
		
		double result2 = tri.getArea(35.2, 12.4);
		System.out.println("삼각형 도형의 정보와 넓이를 표시하기");
		System.out.println("밑변 길이:"+35.2+", 높이 길이:"+12.4+", 넓이:"+result2);//오차발생가능.
		
		//5. Shape 인터페이스에 새로 추가한
		//public double getArea(double a)메소드를 호출하기
		double result3 = tri.getArea(35.2);
		// - 누락한 높이 길이는 위에서 new Tri(3, 4)에서 4를 사용
		System.out.println("삼각형 도형의 정보와 넓이를 표시하기");
		System.out.println("밑변 길이:"+35.2+", 높이 길이:"+5+", 넓이:"+result3);
	}

}
