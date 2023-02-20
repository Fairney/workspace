package pkg2;

public class MainClass {
	
	public static void districtCar(Car c) {
		if(c instanceof FireEngine)
		{
			c.drive();
			((FireEngine) c).waterShot();
		}
		else
			System.out.println("기본입니다.");
	}
	public static void main(String[] args) {
		FireEngine fireCar = new FireEngine();
		fireCar.drive();
		fireCar.save("파랑", 4);
		districtCar(fireCar);
		
		Car c = new Car();
		
		c.drive();
		c.save("노랑", 2);
		
		/*
		 * 자동 형 변환 명령어의 형식
		 * 1) 부모클래스이름 참조변수이름 = new 자식클래스이름();
		 */
		Car d = new FireEngine();
		/*
		 * 참조 변수(리모콘 역하ㅣㄹ)인 c를 사용해서 자식 클래스인 FireEngine이 갖고
		 * 있는 속성(멤버변수)과 행위(메소드)를 사용 가능
		 *  -단, 모든 것은 아니고 Car 클래스에서 FireEngine 클래스로 상속해준 것만 해당
		 */
		districtCar(d);
		c.save("하얀", 10);
		System.out.println(c.door);
		System.out.println(c.color);
		//c.waterShot();
//		((FireEngine) c).waterShot();
		
		FireEngine g = new FireEngine();
		Car e =d;
		e.drive();
		e.save("보라", 5);
		
	}

}
