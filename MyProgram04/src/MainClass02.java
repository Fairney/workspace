/*
 * 2. 비트 이동 연산자인 << 를 사용해서 2진수 곱셈 계산을 수행하기
 */
public class MainClass02 {

	public static void main(String[] args) {
		
		int a = 5;
		a= a << 1;//1개의 비트만 이동하겠다는뜻
		System.out.println(a);
		a= a<<2;//2개의 비트만 이동하겠다는뜻.
		System.out.println(a);
		
		
		/*
		 * >>연산자: 현재 변수가 갖고 있는 2진수 각각의 비트를 오른쪽으로 ㅣ동
		 * - 2진수 나눗셈을 하고 몫을 반환(돌려줌)
		 * - 형식: 값(정수) >> 오른쪽으로 이동할 비트 수 (정수)
		 *	/기호 연산자와 같은 기능을 수행(단, 2진수)
		 */
		a= a>>1; //2진수 나눗셈을 하겠다는 뜻.
		System.out.println(a);
		a= a>>2; //2개의 비트를 오른쪽으로 옮기되, 양수면 0 음수면 1로 채움.
		System.out.println(a);
		
		System.out.println('a'>'b');
		
		System.out.println();
	}

}
