package pkg4;

public class RealAdvancedRC implements AdvancedRC {
/*
 * 새로운 자식클래스 이 아이를 통해서 객체를 만들 수 있음. 재정의한 추상메소드들을 사용할 수 있다.
 */
	@Override
	public void turnOn(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("실체 켜기");
	}

	@Override
	public void turnOff(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("실체 끄기");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("음량 올리기");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("음량 내리기");
	}

}
