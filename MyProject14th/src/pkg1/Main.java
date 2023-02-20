package pkg1;
/*
 * 방금전에 만든 TV 클래스를 사용하기
 * 1ㅣ 새로운 객체를 생성
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//새로운 객체를 생성(기본 생성자를 사용)
		TV oldTV2 = new TV();
		oldTV2.power();
		oldTV2.channelDown();
		oldTV2.show();
		TV oldTV = new TV(30,true);
		oldTV.channelUp();
		oldTV.channelUp();
		//3. show() 메소드를 호출(사용)
		oldTV.show();
		oldTV.channelSelect(20);
		
		oldTV.volumeSelect(20);
		oldTV.power();
		oldTV.show();
		
		
		oldTV.power();
		oldTV.show();
		//2)public TV(boolean power, int channel)생성자 메소드를 호출
		TV oldTV3 = new TV(true,2);
		oldTV3.channelUp();
		oldTV3.show();
		
		CaptionTV newTV = new CaptionTV();
		newTV.caption();
		newTV.caption("다형성캡션");
		/*
		 * TV 클래스로부터 상속 받은 멤버변수와 메소드들을 사용하기
		 * -메소드 중심
		 * -POWER() 메소드를 호출
		 */
		newTV.power();
		//TV 클래스로부터 상속 받은
		//channelUp() 메소드를 호출
		newTV.channelUp();
		newTV.channelUp();
		newTV.channelDown();
		
		//TV클래스로부터 상속받은 show();
		newTV.show();
	}

}
