package pkg1;
	
public class TV {
	boolean power;
	boolean firstChange = false;
	int channel = 0;//다른 메소드, 생성자보다 만들어지는 순위가 높음.
	//기본 생성자를 main() 메소드에서 사용하는 명령어
	//TV 참조변수이름 =new TV();
	int currentChannel;
	int volume=10;
	public TV() {
		show();
	}
	//main()함수에서 매개변수를 받는 TV의 매개변수 생성자.
	//TV 객체이름 = new TV(매개변수타입 이름)
	public TV(boolean power, int channel) {
		System.out.println(power +","+channel);
		this.power = power;
		this.channel = channel;
		this.currentChannel = channel;
		show();
	}
	public TV(int channel, boolean power) {
		//순서가 다른것.
		System.out.println(channel +","+power);
		this.channel = channel;
		this.power = power;
		this.currentChannel = channel;
	}
	public void power() {
		if(!power)
			power = true;
		else
			power = !false;
		show();
		return;
	}
	public void channelUp() {
		channel++;
		if(firstChange)
			currentChannel++;
		firstChange= true;
	}
	public void channelSelect(int value) {
		if(value<999 && value>=0) {
			if(firstChange)
				currentChannel = this.channel;
		this.channel = value;
		firstChange= true;
		}
		else
			System.out.println("해당 채널이 없습니다.");
	}
	public void channelDown() {
		channel--;
		if(firstChange)
			currentChannel--;
		firstChange= true;
	}
	public void volumeUp() {
		if(this.volume==100) {
		}
		else
			volume++;
	}
	public void volumeDown() {
		if(this.volume==0) {
		}
		else
			volume--;
	}
	public void volumeSelect(int volume) {
		this.volume = volume;
	}
	
	//show() 메소드를 추가하기
	//- 기능: power, channel 멤버변수의 현재 값을 읽어와서 모니터에 표시
	// - 현재 갑승ㄹ 읽기: power, channel 이름을 사용
	// - 모니터에 표시: print*( 또는 println() 메소드를 사용.
	public void show()
	{
		System.out.println("──────────────────────────────────────");
		System.out.println("현재 TV의 켜진 상태 값은" + power);
		System.out.println("현재 TV의 채널 번호 값은 " + channel);
		System.out.println("현재 TV의 돌리기 전 채널 값은" + currentChannel);
		System.out.println("현재 TV의 음량은" + volume);
		System.out.println("──────────────────────────────────────");
	}
}
