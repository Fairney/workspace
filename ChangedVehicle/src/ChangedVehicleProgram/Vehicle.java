package ChangedVehicleProgram;

public interface Vehicle {
	public boolean isRide = false;
	String name = null;
	void take(Person n); //{//버스를 탔을 때, Person클래스 매개변수를 받아와서 그 클래스 내부에 있는 변수를 변화시킬 것이다.
	void getOff(Person p);
}
