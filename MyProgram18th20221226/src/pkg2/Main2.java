package pkg2;
/*
 * 1. 서로 다른 변수가 갖고 있는 값을 비교하기
 * -기본 자료형을 사용하는 경우
 * 참조 자료형을 사용하는 경우
 */
public class Main2 {
	public static void main(String[] args) {
		//2. 기본 자료형인 int를 사용해서 서로 다른 이름을 갖는 변수 2개를 선언 + 초기화
		int a = 10 , b = 20;
		//3. 기본 자료형의 값을 비교할 때는 동등 비교 연산자인 == 를 사용.
		if(a == b) {
			System.out.println("변수 a의 값과 변수 b의 값이 같음");
		}else {
			System.out.println("변수 a의 값과 변수 b의 값이 다름");
		}
		//4. 객체 참조형 변수 c와 d를 선언 + 각각 서로 다른 객체를 생성하기
		Circle c = new Circle(2,3,10);
		Circle d = new Circle(2,3,10);
		if(c == d) {
			System.out.println("c == d");
		}else {
			System.out.println("c != d");
		}//위의 실행 결과가 c!= d인 이유는 각각의 참조 변수가 가리키고 있는 객체의주소가 다르기 때문
		//- 주소를 확인하기 위해서는 hashCode() 메소드를 호출
		System.out.println("참조 변수인 c가 가리키고 있는 객체의 주소는 " + c.hashCode());
		System.out.println("참조 변수가 d가 가리키고 있는 객체의 주소는 " + d.hashCode());
		
		/*
		 * Object 클래스에서 Circle 클래스로 상속해준 boolean equals(비교객체){}
		 * 메소드를 호출하기
		 *  - equals() 메소드의 기본 기능은 현재 객체와 비교 객체의 주소를 비교하는 것 같다면 true, 다르면 false
		 *  - 사용방법
		 *  	-기본적으로 2개의 객체가 필요
		 *  	- Circle c = new Circle(2,3,10);
		 *  	- Circle d = new Circle(2,3,10);
		 *  	boolean e = c.equals(d);
		 */
		if(c.equals(d)) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		Circle f= new Circle(3,4,20);
		Circle g = new Circle(5,6,30);
		boolean e = f.equals(g);
		System.out.println("주소 비교 결과는 " + e);
		System.out.println("f 객체 참조 변수로 hashCode() 메소드를 호출한 결과:" + f.hashCode());
		System.out.println("g 객체 참조 변수로 hashCode() 메소드를 호출한 결과:" + g.hashCode());
		/*
		 * 대입 연산은 수행할 때 왼쪽과 오른쪽을 객체 참조 변수 이름을 사용
		 * 즉, 객체 참조 변수 g에 객체 참조 변수 f가 가리키고 있는 객체의 주소를 대입(할당)
		 */
		g = f ;
		e = f.equals(g);
		System.out.println(e+" "+f.hashCode()+" "+f.hashCode());
		
		/*
		 * 서로 다른 객체이지만 멤버 변수으 ㅣ값이 모두 같은 경우를 비교하기
		 * 7- 재정의한 equals() 메소드를 호출
		 * - 조건: Circle 클래스를 사용해서 x, y, radius 값이 같도록 설정
		 */
		Circle h = new Circle(1,2,3);
		Circle i = new Circle(1,2,3);
		boolean j = h.equals(i);
		System.out.println(j);
		
		/*
		 * 서로 다른 객체를 생성 + 멤버 변수으 ㅣ값은 하나라도 다르게 설정
		 */
		Circle k = new Circle(1,2,3);
		Circle l = new Circle(1,2,4);
		boolean m = k.equals(l);
		System.out.println(m);
	}
}
