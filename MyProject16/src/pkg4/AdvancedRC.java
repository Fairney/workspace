package pkg4;
/*
 * 새로운 인터페이스를 정의
 * -기존에 사용하고 있떤 RemoteControl 인터페이스를 확장
 * - 확장의 의미: 새로운 상수/추상 메소드의 선언을 입력
 * -주의사항: 인터페이스간에는 메소드의 재정의가 불가능.
 */
public interface AdvancedRC extends RemoteControl{
	public void volumeUp();
	public void volumeDown();
	//turnOn
	//turnOff가 있다. 컴파일 시점에는 연결된 형식을 가져온다.
	
}

