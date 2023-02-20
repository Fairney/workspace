package pkg4;
/*
 * 인터페이스를 사용해서는 객체를 생성할 수 없습니다.
 * - 예) 인터페이스이름 객체이름 = new 인터페이스이름();//오류
 *  -> 하지만, 현재 만들어져 있는 객체의 주소를 보관이 가능합니다.
 *  	- 형식) 인터페이스이름 객체이름 = 기존객체이름;
 */
public class MainClass {
	/*
	 * 다형성 개념을 적용한새로운 메소드를 정의
	 * 1) 인스턴스 메소드로 정의: 객체마다 독립적으로 만들어지는 메소드
	 * 2) static 메소드로 정의: 클래스당 하나만 만들어지는 메소드
	 */
	
	static RemoteControl r1 = new Television();
	static RemoteControl r2 = new SmartPhone();
	static RemoteControl r3 = new AirConditional();
	static RemoteControl[] arr5 = {r1, r2, r3};
	public static void method(RemoteControl rc) {
		System.out.println("===================================================================");
		rc.turnOn(rc);
		rc.turnOff(rc);
		if(rc instanceof Television) {
			System.out.println("매개변수인 rc가 가리키고 있는 객체의 클래스 타입은 Television");
		}
		else if(rc instanceof SmartPhone) {
			System.out.println("매개변수인 rc가 가리키고 있는 객체의 클래스 타입은 SmartPhone");
		}
		else if(rc instanceof AirConditional) {
			System.out.println("매개변수인 rc가 가리키고 있는 객체의 클래스 타입은 AirConditioanl");
		}
		else if(rc instanceof Refrigirator) {
			System.out.println("매개변수인 rc가 가리키고 있는 객체의 클래스 타입은 Refrigirator");
		}
		else
			System.out.println("다른 클래스");
		
	System.out.println("===================================================================");
	}
	public static void arrayPoint() {
		for(RemoteControl value2: arr5){
			//instanceof 연산자를사용
			//->배열에서 각각의 방에 저장되어 있는 객체의 타입을 검사(판단)할 때 사용
			// -형식 boolean 변수명 = 참조변수명 instanceof 클래스명;
			// -해석: 참조변수명을 갖는 변수가 가리키고 있는 객체의 클래스 명이 클래스명과 같은지를 비교
			// - 만약 같다면 true 값을 반환, 다르다면 false 값을 반환
			// - 예제:boolean d = value2 instanceof Television;
			boolean d = value2 instanceof Television;
			if(d == true) {
				System.out.println("현재 참조 변수 value2가 가리키고 있는 객체의 타입은 Television");
			}
			else if(value2 instanceof SmartPhone) {
				System.out.println("현재 참조 변수 value2가 가리키고 있는 객체의 타입은 SmartPhone이야");
			}
			else if(value2 instanceof Refrigirator) {
				System.out.println("현재 참조 변수 value2가 가리키고 있는 객체의 타입은 Refrigirator이야");
			}
			else if(value2 instanceof AirConditional) {
				System.out.println("현재 참조 변수 value2가 가리키고 있는 객체의 타입은 AirConditional");
			}
			else
				System.out.println("다른 클래스");
		}
	}
	public static void district(RemoteControl a) {
		if(a instanceof AirConditional) {
			
		}
		else if(a instanceof Television){
			System.out.println("television인식");
//			a.turnOn(a);
//			a.turnOff(a);
			r2=a;
			a.turnOn(r2);
			a.turnOff(r3);
			
		}
		else if(a instanceof SmartPhone)
		{
			System.out.println("SmartPhone인식");
			a.turnOn(a);
			a.turnOff(a);
		}
		else if(a instanceof Refrigirator) {
			a.turnOn(a);
		}
		
		
	}
	public static void main(String[] args) {
		Television[]arr1 = new Television[3];
		SmartPhone[] arr2 = new SmartPhone[3];
		Refrigirator[] arr3 = new Refrigirator[3];
		
		/*
		 * 위에서 배열 선언 방법은 각자의 개벽적인 클래스 이름을 사용
		 * - 다형성을 적용해서 여러 개의 자식 객체들을 하나로 묶을 수 있습니다.
		 * - 형식) 부모클래스이름 또는 인터페이스 이름[] 배열명 ={new 자식클래스이름(), new 자식클래스이름2(), ...};
		 */
		RemoteControl[] arr4 = {new Television(), new SmartPhone(), new Refrigirator()};
		for(RemoteControl value: arr4) {
			System.out.println("============================================");
			value.turnOff(value);
			value.turnOn(value);
			System.out.println("============================================");
		}
		MainClass main = new MainClass();
		//1.스마트폰 객체를 생성
		SmartPhone sp = new SmartPhone();
		//2.에어컨 객체를 생성
		AirConditional air = new AirConditional();
		//1.텔레비전 객체를 생성
		Television tv = new Television();
		district(tv);
		district(sp);
		district(air);
		
		/*
		 * 업캐스팅(up casting) 자식 클래스 타입이 부모 클래스 타입으로 자동 형 변환되는 성질.
		 * 자동 형 변환되는 성질
		 * - 인터페이스에도 적용 가능
		 * - 형식: 인터페이스이름 참조변수이름 = new 자식클래스이름();
		 */
		arrayPoint();
		method(r1);
		method(r2);
		method(r3);
		
		
		System.out.println("****새로 정의한 Real AdvancedRC 클래스를 이용");
		RealAdvancedRC e = new RealAdvancedRC();
		e.turnOn(e);
		e.volumeUp();
		e.turnOff(e);
		AdvancedTV tv2 = new AdvancedTV();
		
		tv2.turnOn(tv2);
	}//end of main()

}//end of class{}
