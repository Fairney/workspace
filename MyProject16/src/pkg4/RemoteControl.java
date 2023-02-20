package pkg4;
/*
 * 프로그램 전체에서 사용할 수 있는 기능들의 규격을 선언
 * -규격: 한가지 형식(접근제한자, 수정자(제한자), 반환형, 메소드이름, 매개변수 선언)
 */
public interface RemoteControl {
	public void turnOn(RemoteControl a);
	public void turnOff(RemoteControl a);
}
