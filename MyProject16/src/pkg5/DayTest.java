package pkg5;

public class DayTest implements Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("상속받은 SUNDAY 상수명을 사용하기");
		System.out.println(SUNDAY);
		System.out.println(MONDAY);
		
		int a = 5;
		
		if(a == SUNDAY) {
			System.out.println("변수 a의 값은 1");
		}
		else if(a == MONDAY) {
			System.out.println("변수 a의 값은 2");
		}
		else if(a == TUESDAY)
		{	
			System.out.println("화요일");
		}
		else if(a == WENDESDAY)
		{	
			System.out.println("수요일");
		}
		else if(a == THURSDAY)
		{	
			System.out.println("목요일");
		}
		else if(a == FRIDAY)
		{	
			System.out.println("금요일");
		}
		else if(a == SATURDAY)
		{	
			System.out.println("토요일");
		}
		
		
		switch(a) {
		case SUNDAY:
			System.out.println("일요일입니다."+a);
			break;
		case MONDAY:
			System.out.println("월요일입니다."+a);
			break;
		case TUESDAY:
			System.out.println("화요일입니다."+a);
			break;
		case WENDESDAY:
			System.out.println("수요일입니다."+a);
			break;
		case THURSDAY:
			System.out.println("목요일입니다."+a);
			break;
		case FRIDAY:
			System.out.println("금요일입니다."+a);
			break;
		case SATURDAY:
			System.out.println("토요일입니다."+a);
			break;
		}
		
	}

}
