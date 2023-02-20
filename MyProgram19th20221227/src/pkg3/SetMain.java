package pkg3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
 * 1. java.util 패키지에 있는 HashSet 클래스를 사용하기
 */
public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.객체를 생성하기
		HashSet<String> a = new HashSet<String>();
		//3. add() 메소드를 호출해서 "abc" 문자열을 저장하기
		
		boolean b= a.add("abc");
		System.out.println(b);
		if(b == true) {
			System.out.println("abc가 저장되었씁니다.");
		}
		else
			System.out.println("저장안됨.");
		b= a.add("abc");
		
		System.out.println(b);
		//5.다시 한번 같은 값을 저장했을 때 false가 나옴.
		//5-1 다시 if 조건문을 작성해서 add() 메소드의 실행 결과를 판단하기
		if(b == true) {
			System.out.println("abc가 저장되었씁니다.");
		}
		else
			System.out.println("저장안됨.");
		/*
		 * 6. 반복자(Iterator)를 사용하기
		 * -Scanner 클래스와 유사
		 * 내부에 임시 배열 공간을 사용
		 * iterator() 메소드를 호출해서 값을 갖고 있는 HashSet 클래스에 접근하기
		 * Iterator<Wrapper클래스명> 변수명 = HashSet객체참조변수이름.iterator();
		 */
		Iterator it = a.iterator();
		
		//HashSet 클래스 내부에서 갖고 있는 여러 값들을 가져오는 반복문을 작성하기
		// for문: for( 초기식; 조건식; 증감식)
		//	-지금 상황에서는 조건식 하나를 가지고도 반복을 실행
		//2) while문
		//	- 하나의 조건식을 사용해서도 반복 구조를 만들 수 있습니다.
		while(it.hasNext())
		{
			System.out.println("현재 값이 이씅ㅁ");
			String value = (String) it.next();
			System.out.println("HashSet 클래스에서 가져온 값은" + value);
		}
	}

}
