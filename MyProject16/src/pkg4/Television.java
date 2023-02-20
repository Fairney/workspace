package pkg4;

public class Television implements RemoteControl {
//interface는 상속관계가 아니기 때문에 구현한다고 표현한다.
	@Override
	public void turnOn(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("텔레비전 객체를 켭니다.");
	}

	@Override
	public void turnOff(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("텔레비젼 객체를 끕니다.");
	}

}
