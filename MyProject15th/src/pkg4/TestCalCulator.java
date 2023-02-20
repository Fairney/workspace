package pkg4;

public class TestCalCulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalCulatorSet c = new CalCulatorSet();
		System.out.println(c.add(1, 2));
		double a4;
		int[] ab = {12,3,4,4};
		a4 = c.div(10,0);
		if(0==0 && a4 ==0) {
			System.out.println("0으로 나눌 수 없으므로 값이 없음.");
		}
		System.out.println(a4);
		
		
		int[] arr = {1,2,3,4,5};
		int d = arr.length;
		if(d>0) {
			//double result5 = a4.average(arr);
			//System.out.println("평균: " + result5);
		}
	}

}
