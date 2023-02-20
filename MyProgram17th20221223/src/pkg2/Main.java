package pkg2;
/*
 * 1) try~catch문
 * 2) try~catch~finally
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("try-catch 블럭");
		
		try {
//		int value = 3/0;
//		int value2 =4/0;
		int[] value3 = {1,2,3,4,5};
		System.out.println(value3[5]);
		}catch(ArithmeticException e) {
			e.printStackTrace();//메소드를 사용하면 아주 자세한 오류 내용과
								//메소드 실행(호출) 순서도 알 수 있습니다.
								//- 실행 순서는 main() 메소드에서 출발
								//- 다른 메소드를 호출
								//그리고 어느 ㅁ여령어에서 오류가 발생했는지 출력(자바 소스 파일 이름
								// + 명령어의 줄 번호)
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("배열을 잘못 사용하다가 예외가 발생.");
			e.printStackTrace();
		}
		//catch는 여러개 일 수 있다.
		
		System.out.println("프로그램 종료");
		
		System.out.println("try-catch-finally");
		try {
			int result = 5/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("마지막에 무조건 실행되는 곳.");
		}
	}

}
