package pkg1;
/*
 * 1. 다형성을 사용하면 효율적으로 여러 자식 객체들을 처리할 수 있는 여러 가지 방법
 * 1) 메소드 정의시에 매개변수에서 부모 클래스 이름을 사용
 * 2) 멤버변수를 선언할 때 부모 클래스 이름을 사용
 * 3) 메소드 정의시에 반환형을 부모 클래스 이름을 사용
 * 
 */
/*
 * 만들 클래스 이름과 기능 목록
 * 1. 부모 클래스를 정의: 이름은 Animal(이유: 동물)
 * - 내부에는 메소드를 하나만 정의: public void speak() {}
 * System.out.println("모든 동물은 소리를 냅니다.");
 */
/*
 * Animal a의 의미
 * - Animal 클래스를 부모 클래스로 하고 있는 모든 자식 클래스들의 객체를 입력으로 받아들이겠다는 의미.
 * -형변환(upcatsting)
 *  -district(Animal a)
 *  -예) Human a = new Human();
 *  	Animal b = a;
 *  	testSpeak(a);
 */
class Animal{
	public void speak()
	{
		System.out.println("모든 동물은 소리를 냅니다.");
	}
}
class Human extends Animal{
	public void speak()
	{
		System.out.println("사람은 말을 냅니다.");
	}
}
class Cat extends Animal{
	public void speak()
	{
		System.out.println("깕옹.");
	}
}
class Dog extends Animal{
	public void speak()
	{
		System.out.println("왕왕");
	}
}
public class TestPolymorphism {

	public void district(Animal a) {
		if(a instanceof Dog){
			System.out.println("개");
			Dog dog = (Dog)a;
			dog.speak();}
		else if(a instanceof Cat) {
			System.out.println("고양이");
			Cat cat = (Cat)a;
			cat.speak();}
		else if(a instanceof Human) {
			System.out.println("사람");
			Human human = (Human)a;
			human.speak();}
		else
			System.out.println("서비스를 준비중에 있습니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat a = new Cat();
		Dog b = new Dog();
		TestPolymorphism t = new TestPolymorphism();
		t.district(a);
		t.district(b);
		
		boolean chk1 = a instanceof Cat;
		boolean chk2 = b instanceof Dog;
		boolean chk3 = a instanceof Animal;
		System.out.println(chk3);
		System.out.println(chk2);
		System.out.println(chk1);
		System.out.println("=============================================");
		Animal h1 = a;
		h1.speak();
		System.out.println("=============================================");
		Animal h2 = b;
		h2.speak();
	}

}
