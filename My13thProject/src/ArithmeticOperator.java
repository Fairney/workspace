import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");//초를 받아옴.
		time = sc.nextInt();
		second = time % 60;
		minute = (time/60)%60;
		hour = (time/60)/60;
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");
		
		
	}

}
