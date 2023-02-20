package pkg2;
//다른 패키지인 pkg1에 있는 MyClass 클래스를 이용
import pkg1.MyClass;
//MyClass 클래스를 부모 클래스로 지정해서 상속 받는 새로운 클래스를 정의하기.
class MyNewClass extends MyClass{
	//MyClass 클래스에서 선언한 protected String color 멤버변수가 상속됨
	//-> 상속 받은 color 멤버변수를 사용해 보는 메소드를 정의하기
	public void method2() {
		System.out.println("MyClass 클래스로부터 상속 받은 color의 값은 " + this.color);
	}
	public void method3(int a) {
		this.money = money+a;
		System.out.println(this.money);
		
	}
}
public class MyClass3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNewClass m = new MyNewClass();//m은 객체 참조 변수.
		//p:객체명-> 더 정확한 이름: 객체 참조 변수 이름 혅 ㅐ힙 메모리에 생성된 객체의 위치 값인 주소를 보관하고 변수(스택)
		m.method2();
		m.method3(5000);
	}

}
