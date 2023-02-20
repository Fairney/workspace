/*
 * 다형성 예제
 * 
 * 1.메소드를 정의할 때 매개변수 선언시에 사용
 * 1) 다형성 개념을 사용하지 않은 경우에는 같은 이름을 갖는 메소드를 여러 개 정의.
 * ->즉, 자식 클래스 마다 독립적으로 실행 할 ㅅ ㅜ있는 메소드를 자식 클래스 갯수만큼
 * 	->제약 사항: 기능(명령어)는 동일해야함.
 * 
 * 2) 쉬운 예제
 * -동물들의 소리를 내는 다양한 방법들
 * 	예1) 사람은 말을 합니다.
 * 	예2) 강아지는 멍멍 소리를 냅니다.
 * 	3)고양이는 야옹소리를
 *  4) 비둘기는 후뤀꾸
 */

class Animal{
	
}
class Human2 extends Animal{
	public void speak() {
		System.out.println("사람은 말을 합니다.");
		
	}
}
class Dog extends Animal{
	public void speak() {
		System.out.println("개는 멍멍을 합니다.");
	}
}
class Cat extends Animal{
	public void speak() {
		System.out.println("고양이는 애옹을 합니다.");
	}
}
class ControlClass{
	public void cat(Cat c) {
		System.out.println("cAT(Cat c) 메소드가 호출됨");
	}
	public void dog(Dog d) {
		System.out.println("Dog(Dog d) 메소드가 호출됨");
	}
	public void human(Human2 h) {
		System.out.println("cAT(Human h) 메소드가 호출됨");
	}
	
}
	

public class MainClass03 {
	public void speak(Animal a) {
		ControlClass con = new ControlClass();
		if(a instanceof Human2) {
			con.human((Human2)a);
		}
		else if(a instanceof Cat) {
			con.cat((Cat)a);
		}
		else if(a instanceof Dog) {
			con.dog((Dog)a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human2 a =new Human2();
		Dog b = new Dog();
		Cat c = new Cat();
		ControlClass d = new ControlClass();
		d.human(a);
		d.dog(b);
		d.cat(c);
		MainClass03 main = new MainClass03();
		main.speak(c);
	}

}
