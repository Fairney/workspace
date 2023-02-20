package pkg2;
import java.util.Scanner;
public class ArrayException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] intArray = new int[a];
		intArray[0] = 0;
		try {
			for(int i = 0; i<5; i++) {
				intArray[i+1] = i +1+intArray[i];
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}catch(Exception e) {//여러개는 되지 않는다.
			System.out.println("개발자의 할아버지의 마음");
		}finally {
			System.out.println("지금에서야 나를 돌아보는구나?");
		}
		/*
		 * Integer Wrapper 클래스가 갖고 있는 parseInt() 메소드를 호출해서 문자란에 있는 정수 값을 실제 정수로 변환해보자.
		 */
		int value = 0;
		int value2 =0;
		
		try {
			value = (int) Double.parseDouble("3.1415926535897");
		}catch(NumberFormatException e)
		{
			System.out.println("문자열 안에 있는 정수를 변환하는데 오류가 발생.");
		}//예외에 상관없이 무조건 실행. try와 finally는 무조건 한번만 기입가능.(구조내부에서)
		/*
		 * Scanner 클래스를 사용하는 경우
		 * - close() 메소드를 호출하는 명령어의 작성 위치
		 *  - 일반적으로 더 이상 키보드를 사용하지 않은 경우에 사용
		 *   - 오류와 상관없이 무조건 실행.print("다
		 *    - finally 블럭에 작성.
		 */
		//java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요:");
		String input = sc.next();
		System.out.println("당신의 이름은 : " + input);
		/*
		 * try catch finally 블럭을 만들기
		 * 사용자에게 나이를 정수로 입력받음(문자열)
		 */
		String ex3;
		int age= 0;
		ex3 = sc.next();
		try {
			age = Integer.parseInt(ex3);
		}catch(NumberFormatException e) {
			System.out.println("예외 발생.");
			e.printStackTrace();
		}
		finally {
			//if 조건문을 사용해서 현재 Scanner 클래스의 객체를 가리키고 있는 경우에만 힙 메모리에서 제거합니다.- 만약 null의 값을 갖고 있는 경우에만 거짓 주소이므로 close()j메소드를 호출하지 않음.
			//-만약 null의 값을 갖고 있는 경우에 close()메소드를 호출하면 NullPointerException 예외가 발생-자원(키보드) 반납 코드
			if(sc!= null) {
				sc.close();
				System.out.println("정상적으로 close() 메소드를 실행");
			}
		}
	
	}

}
