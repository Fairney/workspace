package pkg3;

import java.io.IOException;

/*
 * throw 문 명령어를 학습하기
 *  - 기능 : 강제로 예외 상황을 만드는 것.
 *  - 용도: 특정 반복문 또는 특정 메소드 안을 탈출 할 때 사용 가능
 *   - 형식: if(조건식) throw new 예외클래스명();
 *   - 예제: for반복문과 System.in.read() 메소드를 사용해서 한번에 하나의 문자만을 입력받는다.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = ' ';
		try {
			for(int i = 0; i < 10; i++) {
			 ch = (char)System.in.read();//버퍼로 들어감.
//			 System.in.read();//CR : 현재 커서를 줄 올림 없이 가장 앞으로 옮기는 동작
//			 //LF : 커서는 그 자리에 그대로 둔 상황에서 종이만 한 줄 올려 줄을 바꾸는 동작
//			 System.in.read();//LF
			 System.in.skip(2);//2개의 글자를 읽어오지 말아라
			 if((int)ch == 10) {
				 System.out.println("LF 문자");
			 }
			 else if((int)ch == 13) {
				 System.out.println("CR 문자");
			 }
			 else {
				 System.out.println("사용자가 입력한 숫자또는 문자:" + ch);
				 System.out.println("사용자가 입력한 숫자 또는 문자의 ASCII 코드 값:" + (int)ch);
				 /*
				  * 사용자가 입력한 문자가 한 자리 숫자인지를 판단하기
				  * -Character Wrapper 클래스가 갖고 있는 isDigit() 메소드를 호출
				  * boolean result =Character.isDigit(ch);
				  * }
				  */
				 boolean result =Character.isDigit(ch);
				 if(result == true) {
					 System.out.println("사용자가 입력한 문자는 숫자 한 자리");
				 }else {
					 System.out.println("사용자가 입력한 문자는 숫자가 아닌 문자");
				 }
			 }
			 //System.in.read()메소드가 실행된 후에 사용자가 하나의 문자를 입력한 경우
			 //예)a를 입력한 경우 -> a를 입력하고 엔터키를 누름-> 사용자가 입력한 내용은버퍼
			 //(Buffer: 완충장치: 임시 배열 공간)|에 저장됩니다.
			 //-버퍼: 운영체제에서 생성하고 관리하는 메모리 공간.
			 // = 사용자가 입력한 문자와 LF(줄바꿈)와 CR까지 버퍼에 저장.
			 //-CR(Carriage Return) 커서를 현재 줄에서 제일 왼쪽으로 이동.
			 System.out.println("사용자가 입력한 값은" + ch);
			}
		} catch (IOException e) {//입출력 예
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
