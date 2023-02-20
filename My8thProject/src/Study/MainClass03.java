package Study;
/*
 * 1. char형 배열의 선언 (초기화)과 사용
 */
public class MainClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','d'};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(char a : arr)
		{
			System.out.println(a);
		}
		
		String c = "123";
		System.out.println(c);
		/*
		 * 위에서 선언한 char형 배열 arr의 크기 arr.length;
		 * -
		 */
		System.out.println(arr.length);
		/*
		 * 구현할 기능
		 * -String형의 변수 c의 값을 모두 읽어서 char형이 변수에 보관.
		 * 현재 char형 배열인 arr의 값은 'a','b','c'
		 * ->'1','2','3'으로 변경하기
		 */
		System.out.println(c.length());//String은 클래스이기 때문에 length에 함수표시를 쓴다.
		
		if(arr.length>=c.length()) {
			System.out.println("배열의 방의 갯수가 같거나 큽니다.");
			arr= c.toCharArray();
			//3)String 클래스의 charAt()함수를 사용.
			// - 형식)char 변수명 = c.charAt(가져올문자의방번호);
			// - 현재 String 클래스의 변수 c는 "123"을 보관
			// - 첫 번째 숫자인 1으 ㅣ방 번호 : 0
			// - 두 번째 숫자인 2의 방 번호: 1
			// - 세 번째 숫자인 3의 방 번호: 2
			
			System.out.println(c.charAt(0));
			System.out.println(c.charAt(1));
			System.out.println(c.charAt(2));//유연성, 확장성이 떨어진다.
			
			for(int index = 0; index<c.length(); index++) {
				System.out.println(c.charAt(index));
			}
			
			if(arr.length == c.length()) {
				System.out.println("char형 배열의 방 갯수와 문자의 갯수가 동일");
				/*
				 * String형의 변수 c가 갖고 있는 문자열을 하나씩 읽어서 char형 배열의 arr의 각각의 방에 저장하기
				 */
				for(int index2 = 0; index2 < c.length(); index2++) {
					arr[index2] = c.charAt(index2);
					
				}
				for(char value : arr) {
					System.out.println(value);
				}
			}
			
		}
		else {
			System.out.println("배열의 방의 갯수가 작습니다.");
		}
		/*
		 * 변수의 사용 범위(Range)
		 * -scope(스코프)
		 * 제일 첫번째로 선언한 변수가 우선 순위가 높다.
		 */
		
		int f;
		{
			int e =100;//지역변수
			System.out.println(e);
		}
		//System.out.println(e);
		for(int e = 200; e <= 300; e++)
		{
			System.out.println(e);
		}
		/*
		 * 2차원 배열 선언 예쩨
		 * 1. 선언 + 초기화를 동시에 수행: 쉬운 구조
		 * 
		 */
		int[][] arr02 = {{1,2,3,4},
						 {5,6,7,8}};
		int first = arr02[0][0];
		System.out.println(first);
		
		for(int i = 0; i < arr02[i].length; i++) {
			for(int j = 0; j < arr02[i].length;j++) {
				System.out.println(arr02[i][j]);
			}
			
		}
	}

}
