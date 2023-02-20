package pkg1;
/*
 * 기존에 사용하고 있던 TV 클래스의 모든 속성(멤버변수)과 형위(메소드)들을 물려받는 새로운 클래스를 정의
 * 단, private 접근 제한자를 갖는 멤버변수와 메소들은 제외, 생성자도 포함해서 제외.
 */
public class CaptionTV extends TV {
	//CaptionTV 클래스에만 새로 추가되는 멤버변수인text를 선언
	String text ="없음";
	
	public CaptionTV() {
		
	}
	public void caption() {
		text ="캡션이름1";
		System.out.println("현재 캡션 이름은 " + text);
	}
	public void caption(String newCaption) {
		//오버로딩
		text= newCaption;
		System.out.println("변경된 캡션 이름은 " + text);
	}
	
}