package ChangedVehicleProgram;

public class Bus implements Vehicle{
	Integer busNum;
	String name = "Bus";
	@Override
	public void take(Person p) {//버스를 타는 시스템: 버스를 타서 돈을 지불하고 Person객체의 isRide를 true로 변환시킴
		if(p.currentBusNum == null)
		{
			if(p.age <=7 && p.money>=700) {
				p.ride();//Person n 의 n내부에 있는 값을 true로 변환시킨다.
				p.money -= 700;
			}
			else if(p.age <= 19 && p.money >=1150) {
				p.ride();
				p.money -=1150;
			}
			else if(p.age>19 && p.money>=1450){
				p.ride();
				p.money -= 1450;
			}
		}
		else if(p.currentBusNum != null && p.countTime<30) {
			if(p.age <=7 && p.money>=100) {
				p.ride();//Person n 의 n내부에 있는 값을 true로 변환시킨다.
				p.money -= 100;
			}
			else if(p.age <= 19 && p.money >=200) {
				p.ride();
				p.money -=2000;
			}
			else if(p.age>19 && p.money>=200){
				p.ride();
				p.money -= 200;
			}
		}
			
	}
		
	@Override
	public void getOff(Person p) {
		// TODO Auto-generated method stub
		p.getOff();
		
	}
	

	
	
	
	
	
	
}
