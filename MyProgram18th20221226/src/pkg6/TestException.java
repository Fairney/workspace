package pkg6;

import java.math.BigInteger;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger c = new BigInteger(Long.MAX_VALUE+"");
		String d = c.toString(2);//2진수로 변환
		System.out.println(d);
	}

}
