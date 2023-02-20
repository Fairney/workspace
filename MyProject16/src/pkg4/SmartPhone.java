package pkg4;

public class SmartPhone implements RemoteControl{

	@Override
	public void turnOn(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 객체를 켭니다.");
	}

	@Override
	public void turnOff(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("스마트폰 객체를 끕니다.");
	}

}
