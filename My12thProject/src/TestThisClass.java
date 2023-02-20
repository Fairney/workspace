/*
 * 1. this 명령어가 필요한 경우
 * - 클래스 내부에서 멤버변수의 이름과 특정 메소드의 매개변수의 이름과 같은 경우
 * -메소드 내부에서는 우선순위가 매개변수가 더 높음
 * - 멤버변수를 가리키기 위해서는 this + 점)._ + 멤버변수명
 * -하지만, 매개변수명(멤버변수명과 다름)
 */
class Sample{
	private int id = 0;
	//기본 생성자: 다른 클래스에서 사용하려면 new 클래스명()명령어를 작성해야 합니다.
	public Sample() {
		id = 100;
		System.out.println("기본 생성자가 호출	");
	}
	//매개변수를 갖는 생성자: 다른 클래스에서 사용하려면 new 클래스명(정숫값) 명령어를
	//작성해야 합니다.
	public Sample(int id) {
		this.id = id;
	}
	public void set(int id) {
		System.out.println("멤버변수 id의 값을 바꾸기	");
		this.id = id;
	}
	public int get() {
		System.out.println("멤버변수 id의 값을 읽어오기");
		return id;
	}
}
public class TestThisClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample a = new Sample();
		int value = a.get();
		System.out.println("멤버변수 id의값은 " + value);
		//위에서 100이 출력
		//100을 200으로 바꾸기 -> set() 메소드를 호출 -> 객체명.set(200);
		a.set(200);
		value = a.get();
		System.out.println("멤버변수 id의 값은 " + value);
	}

}
