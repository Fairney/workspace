import java.util.HashMap;

//새로운 클래스 이름: MainClas03.java
public class MainClass03 {

	public static void main(String[] args) {
		/*
		 * 지금까지 많이 사용했던 변수의 특징(속성 또는 성질)을 알아보기
		 * - 기본적으로 하나의 값 만을 저장
		 */
		String name = "홍길동";
		System.out.println(name);
		//1) = 기호를 사라지면 기존의 값은 새로운 값으로 대체(바뀜 또는 덮어쓰기-가비지 컬렉션)
		name = "김길동";
		System.out.println(name);
		String[][] st = new String[10][10];
		
		//2)int 정수도 변수에 보관하기
		int age = 20;
		System.out.println(age);
		//3) 기호를 사용해서 20에서 30으로 변환
		age = 25;
		System.out.println(age);
		//4) 변수에 여러 개의 값들을 보관: 제약사항으로 String형만 가능
		// - >이유: String형은 내부적으로 배열 구조.
		// -> 배열은 수학의 함수에서 대응 관계: 배열명과 값의 대응 관계는 1대 多.
		String name2 = "홍길동, 김길동, 김유신";
		System.out.println(name2);
		
		int[] intArr = {1,2,3,4,5};
		int intArr2[] = {1,2,3,4,5};
		String[] nameArr = {"홍길동","3.14","true"};
		double[] douArray = {1.34,14.1,5652.1};
		float[] floatArray = {3.14f,2.14f,1.14f};
		long[] longArray = {123,54,5253};
		
		System.out.println(floatArray.length);
		for(int i=0; i<=floatArray.length-1;i++)
		{
			System.out.println(floatArray[i]);
		}
	}

}
