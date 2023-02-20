
public class Test1 {

	public void test() {
		/*
		 * 중복의 기준
		 * 1. 메소드의 이름
		 * - 하지만, public과 반환형은 제외
		 * 2. 소괄호 안에 작성한 명령어: 매개변수 선언
		 * - 갯수가 같은 지본다
		 * - 갯수가 같으면 매개변수 타입이 같은지 본다.
		 * -만약 매개변수 타입이 같고 갯수가 같다면 순서를 본다.
		 * -만약 순서도 같다면 오류가 생긴다.
		 */
		
	}
	public void test(String str) {}
	public void test(String s,String n) {}
	public void test(int i) {}
	
	public void test(String str, int i0) {}
	public void test(int i0, String str) {}
	private void test(double s) {}
	public int test(long a) {return 0;}
	//static 수정자: 메모리에 갯수 -> 1개만ㅇㅇㅇ 생성
	//->프로그램  실행된 후에 메모리에생성
	//객체를 만들어도 다시 생성되지않는다.
	//클래스 멤버 변수를 선언할 때사용
	//-클래스 내부도를 ㅇ정의할때 사용
	//static 수정자를 사용하지 ㅇ ㅏㄴㅎ으면 n개(무한대:) 객체를 만들면 새로 만들어짐.
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
