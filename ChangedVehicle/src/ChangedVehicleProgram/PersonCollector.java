package ChangedVehicleProgram;

import java.util.Vector;

/*
 * 여기서는 사람들을 모아놓는 역할을 담당하고 이것을 서버로 보내는 역할
 * 하지만 서버로 보내는 코딩은 아직 모르기 때문에 생략하고 여기에서는 동적 배열 할당을 통해서
 * Class 객체를 받아서 모아놓는 클래스를 작성할 것이다.
 */
public class PersonCollector {
	Person n;
	
	static Vector<Person> gathering = new Vector<>();
	
	void inputPerson(Person n)//회원등록
	{
		gathering.add(n);
	};
	void makePerson(String name, Double money, Integer age) {
		n = new Person(name,money,age);
		
	}
	
}
