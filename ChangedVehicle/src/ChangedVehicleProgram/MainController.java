package ChangedVehicleProgram;

import java.util.Scanner;
import java.util.Vector;

public class MainController {
	static String name;
	static Double money;
	static Integer age;
	static boolean isRide;
	
	
	
	
	
	static void district(Vehicle v, Person p) {
		if(v instanceof Bus)//bus였을때는 busNum이 작용을 하지만 busNum이 아니었을 때는 busNum을 받을 필요가 없다.
		{
			((Bus)v).take(p);
		}
		else if(v instanceof Subway)
		{
			((Subway)v).take(p);//
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		money = sc.nextDouble();
		MainController main = new MainController();
		PersonCollector collector = new PersonCollector();
		collector.makePerson(name,money,age);//객체에 대한 정보 등록
		collector.inputPerson(collector.n);//객체를 등록 
		//태그 시 만든 객체의 종류를 인식.
		Bus bus = new Bus();
		district(bus, collector.gathering.get(0));//찍은 탈것의 클래스에서 가져와야한다. 이걸 어떻게 받아올까.
		
		sc.close();
	}

}
