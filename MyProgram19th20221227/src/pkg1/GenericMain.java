package pkg1;

class MyClass<T>{
	//멤버 변수인 A를 선언하는데 자료형은 미지정
	
	T a;
	//setter 메소드를 정의하기
	
	public void set(T value) {
		a = value;
	}
	public T get() {
		return a;
	}
	
}
/*
 * 최근에 계싼기 ㅡㄹ래스를 정의할 때 정수 덧셈 계산을 수행하는 메소드를 정의
 * + 실수 덧셈 계싼을 수행하는 메소드를 정의
 * ->중복(Overloading) 개념을 사용
 * ->각각 개별적으로 다른 메소드를 정의
 * public int add(int a, int b)
 * 	return a+ b;
 * 
 * public double add(double a, double b){
 * 	return a+b;
 * }
 * 새로운 요구사항이 생겨서 long 자료형을 추가하기
 * public long add(long a, long b){
 * 	return a+b;
 * }
 */

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 위에서 정의한 클래스를 사용하기
		//1 String을 사용해보고싶다
		MyClass<String> s1 = new MyClass<String>();
		/*
		 * new MyClass<String>() 명령어가 실행되는 시점에 MyClass내부에서 선언한 멤버 변수인 a의 자료형이 결정됩니다.
		 * class MyClass<String>{
		 * 	String a;
		 * public void set(String value){}
		 * public String get(){return }
		 * }
		 */
		//set() 메소드를 호출해서 매개변수인 value에 문자열을 전달하기
		
		s1.set("홍길동");//JVM이 T에 String을 넣어준다.
		String value = s1.get();
		//가져온 멤버 변수 a의 현재 값을 화면에 표시하기
		System.out.println("MyClass 내부에서 선언한 멤버 변수 a의 값 : "  + value);

		MyClass<Integer> s2 = new MyClass<Integer>();
		s2.set(1122);
		int b = s2.get();
		System.out.println(b);
		
		/*
		 * Double Wrapper
		 */
		MyClass<Double> s3 = new MyClass<Double>();
		s3.set(12.34);
		//public void set(Double value){} 메소드를 호출해서 실수값을 매개변수인 value에 전달하기
		double v3 = s3.get();
		//public Double get(){return } 메소드를 호출해설 실수값을 반환하기.
		System.out.println(v3);
	}

}
