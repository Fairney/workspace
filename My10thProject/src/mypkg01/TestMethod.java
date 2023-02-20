package mypkg01;

public class TestMethod {

	/*
	 * 새로운 메소드의정의
	 * 1) 절댓값을 구하는 메소드를정의하기
	 * - 메소드의 구조 : 외부로부터 하나의 정숫값을 받기
	 *  - 매개변수를 선언: (Integer value)
	 *  반환형을 쓰기.
	 */
	
	public int abs(Integer value) {
		int result;
		if(value<0) {
			result=value*-1;
			//if조건문을 사용
			//가. 결과를 보관할 변수를 선언
			//나. 조건문에서 매개변수인 value의 값이 음수인 경우에만 양수로 바꾸기
		}
		else
			result = value;
		result = (value < 0) ? (value*-1): value;
		return result;
		
		
	}
	public int abs2(int value) {
		/*
		 * 변수 value의 값이 음수이면 -value 명령어를 실행
		 * - 만약 -5라면 --5를 실행하여 5를 만들고 변수 result에 대입.
		 */
		int result;
		result = (value<0)?-value:value;
		return result;
	}
	
	public int abs3(int value) {
		/*
		 * 지역 변수인 result를 선언하지 않고 절대갓을 구하는 함수의 정의
		 */
		return value < 0 ? -value : value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod a = new TestMethod();
		int result1, result2,result3, result4, result5, result6;
		result1 = a.abs(-1);
		result2 = a.abs(1);
		result3 = a.abs2(4);
		result4 = a.abs2(-5);
		result5 = a.abs3(-5);
		result6 = a.abs3(5);//수학관련 계산식은 주로 한줄로 만든다.
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}

}
