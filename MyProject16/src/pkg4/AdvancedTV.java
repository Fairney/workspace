package pkg4;

public class AdvancedTV implements AdvancedRC {

	@Override
	public void turnOn(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("발전된 TV의 전원켜기");
	}

	@Override
	public void turnOff(RemoteControl a) {
		// TODO Auto-generated method stub
		System.out.println("발전된 TV의 전원끄기");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("발전된 TV의 음량 높이기");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("발전된 TV의 음량줄이기");
	}

}
