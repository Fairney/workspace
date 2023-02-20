package pkg4;

public class CalCulatorSet extends Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		//배열의 길이를 검사
		if(a.length==0) {
			System.out.println("값이 없습니다.");
			return 0;
		}
		double sum = 0;
		double avg = 0;
		//for 반복문을 사용해서 배열 a의 값을 차례때로 읽어와서 sum변수에 계속 누적.
		for(int i = 0; i<a.length;i++)
		{
			sum += (double)a[i];
		}
		avg = sum/a.length;
		return avg;
	}


	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}


	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		if(b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return a/b;
	}

}
