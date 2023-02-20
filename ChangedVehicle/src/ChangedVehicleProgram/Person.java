package ChangedVehicleProgram;



public class Person {
	String name;//이건 필수적이진 않지만 그냥 넣어본것.
	double money;//필수적임.
	Integer age;//unnecessary
	Integer currentBusNum;//necessary
	boolean isRide;//necessary
	double countTime;//내리고 나서 30분 체크.
	
	public Person(String name, double money, Integer age)
	{
		this.name = name;
		this.money = money;
		this.age = age;//해당 객체의 생성.
	}
	
	public boolean ride() {//Person객체가 탔을 때의 실행되는 함수.
		isRide = true;
		return isRide;
		
	}
	public boolean getOff() {//Person객체가 내렸을 때의 실행되는 함수.
		isRide = false;
		return isRide;
	}
	
	
	
	
}
