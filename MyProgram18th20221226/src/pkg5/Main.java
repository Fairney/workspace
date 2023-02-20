package pkg5;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger(100l+"");
		BigInteger b = new BigInteger(Long.MAX_VALUE+"");
		BigInteger c = new BigInteger(Integer.MAX_VALUE+"");
		BigInteger d = new BigInteger(1+"");
		
		//add
		
		BigInteger result1 = a.add(b);
		
		System.out.println(result1.toString());
		//9223372036854775907
		System.out.println(Long.MAX_VALUE);
		//92223372036854775807
		System.out.println(Integer.MAX_VALUE+1);
		//-2147483648
		System.out.println(Long.MAX_VALUE+1);
		
		BigInteger e = new BigInteger(Long.MAX_VALUE+"");
		BigInteger f = new BigInteger(1L+"");
		//add()메소드를 호출하기
		
		BigInteger g = e.add(f);
		System.out.println(g);
		
		//뺄셈 계싼하기: Long.Min_Value -1
		//1) BigInteger 클래스를 사용하지 않은 경우의 계산 결과를 표시하기
		System.out.println((Long.MIN_VALUE -1));
		//실행 결과: 9223372036854775807
		
		BigInteger h= new BigInteger((Long.MIN_VALUE)+"");
		BigInteger i = new BigInteger(1l+"");
		System.out.println(h.subtract(i));
		System.out.println(h);
		
		//6) 곱셈 계싼 :multiply() 메소드를 호출하기
		BigInteger j = new BigInteger(Long.MAX_VALUE+"");
		BigInteger k = new BigInteger(Long.MAX_VALUE+"");
		System.out.println(j.multiply(k));
		//7) 나눗셈 계싼 후에 몫을 반환: divide()메소드를 호출하기
		BigInteger l = new BigInteger(Long.MAX_VALUE+"");
		BigInteger m = new BigInteger(3l+"");
		System.out.println(l.divide(m));
		//8)) 나눗셈 계싼 후에 나머지를 반환: remainder()메소드를 호출하기
		System.out.println(j.remainder(k));
	}

}
