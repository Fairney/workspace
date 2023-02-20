/*
 * 상속 예제 작성
 * 
 * 1) 사람 클래스를 먼저 정의하기
 * -이름: Person
 * -멤버변수 선언: String name;
 * -기본 생성자: public Person(){}
 * -매개 변수를 갖는 생성자: public Person(String name){}
 * -상속에서 제외되는 접근지정자-private, 생성자.
 * -상속을 해주는 메소드: 이름 변경 함수: public void setNmae(String name){}
 * -이름을ㅇ 읽어오는 함수: public String getName(){}
 * 
 * 2) 학생 클래스를 나중에 정의하기.
 */

class Person{
	String name;
	int age;
	public Person() {
		name= "기본이름";
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
}
class Student extends Person{
	public void method() {
		System.out.println("새로 추가한 method() 메소드가 호출됨");
		System.out.println("상속 받은 멤버 변수 name의 값은 "  + name);
	}
	
	
}
public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person();
		Person b = new Person("홍길동");
		Student s = new Student();
		s.method();
		String d = a.getName();
		System.out.println("객체명 a가 갖고 있는 이름은 " + d);
		String e = b.getName();
		System.out.println("객체명 b가 갖고 있는 이름은 " + e);
		
		s.setName("이순신");
		String f =s.getName();
		System.out.println(f);
	}

}
