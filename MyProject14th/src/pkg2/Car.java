package pkg2;
/*
 * 모든 자동차 공통적인 속성과 행위(기능)들을 관찰을 통해서 뽑아내기
 * 가. 속성
 * 나. 행위
 * 부모클래스<- 자식클래스 지칭 (형변환 생략가능)
 * 자식클래스<- 부모클래스(형변환 생략 불가능)
 * a.자동차의 색상
 * -멤버 변수를 선언: String color;
 * b. 자동차가 갖고 있는 문의 갯수
 * -일반적으로 1,2,3...(정수)
 * -멤버 변수를 선언:int door;
 * 
 * 나. 행위
 * a.운전(drive)
 * -메소드를 정의
 * -메소드를 정의: public void drive(){}
 * 
 */
public class Car {
	//1) 자동차 색상을 보관할 수 있는 멤버변수(전역변수)를 선언
	//-이유: 아래에 있는 모든 메소드에서 함께 사용
	// - 매개변수는 () 안에서 선언했기 때문에 메소드 내부에서만 사용
	String color;
	//2) 자동차 문의 갯수를 보관할 수 있는 멤버변수를 선언
	int door;
	public void drive() {
		System.out.println("자동차를 운전하고 있습니다.");
	}
	//4) main() 메소드에서 자동차 색상과 문의 갯수를 입력할 때 호출할 메소드 정의
	public void save(String color, int door) {
			this.color = color;
			this.door = door;
			System.out.println("main() 메소드에서 입력된 정보를 출력합니다.");
			System.out.println("자동차 색상은 " + this.color);//this는 new할때 힙의 주소값을 보관하는 예약어.
			System.out.println("자동차 문의 갯수는 " + this.door);
	}
}
