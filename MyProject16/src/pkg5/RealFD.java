package pkg5;

public class RealFD implements Flyable, Drivable, Jumpable {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("달리기 기능.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날기 기능");
	}

	@Override
	public void jump(double a) {
		// TODO Auto-generated method stub
		System.out.println("점프 기능" + a);
	}
	
	

}
