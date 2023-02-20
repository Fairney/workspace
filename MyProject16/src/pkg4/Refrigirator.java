package pkg4;

public class Refrigirator implements RemoteControl {

	@Override
	public void turnOn(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("냉장고를 켭니다.");
	}

	@Override
	public void turnOff(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("냉장고를 끕니다.");
	}

}
