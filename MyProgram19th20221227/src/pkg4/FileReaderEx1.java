package pkg4;
/*
 * 1. 파일 관련 입력과 출력을 하실 때에는 java.io 패키지에 있는 클래스 또는 
 * 인터페이스를 사용하셔야 합니다.
 */
import java.io.*;
public class FileReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. FileReader 클래스를 사용해서 파일로부터 한 번에 2바이트를 읽어옵니다.
		//1) 형식: 먼저 참조 변수만 선언
		FileReader a = null;
		// - 객체 생성 명령어와 분리하는 이유는 예외처리 때문
		//2) 파일 입력과 출력 프로그램에서는 기본적으로 예외가 발생
		try {
			//3) 객체를 생성하기
			// - 형식: 참조변수명 = new FileReader("파일명.txt");
			a= new FileReader("test.txt");
			//4) while반복문을 사용해서 파일로부터 한 글자씩 읽어오기
			// - read() 메소드를 사용하기
			// - 읽은 문자의 ASCII코드값을 반환.
			int b = 0;
			while((b = a.read()) != -1) {
				/*
				 * 5) 조건식: 먼저 a.read() 메소드를 호출해서
				 * 파일로부터 한글자를 읽어오기
				 * 읽어온 글자의 코드 값을 변수 b에 저장
				 * 그 다음에  -1과 같은지를 비교하기
				 * -만약 같다면 파일의 끝( 더 이상 읽어올 내용이 없는 경우)
				 * - 조건식이 거짓이 되어서 반복문을 종료합니다.
				 * - 만약 다르면 조건식이 참이 되어서 읽어온 내용을 화면에 출력
				 * 주의사항: (char)읽어온 문자의 ASCII코드값
				 */
				System.out.println("파일에서 읽어온 문자는 " + ((char)b));
			}
		}catch(IOException e) {
			System.out.println("파일입력시에 오류가 발생.");
			e.printStackTrace();
		}finally {
			if(a!= null) {
				try {
					a.close();
				}catch(IOException e) {
					System.out.println("close() 메소드 실행 오류");
					e.printStackTrace();
				}
			}
		}
	}	

}
