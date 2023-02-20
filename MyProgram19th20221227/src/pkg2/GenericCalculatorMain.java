package pkg2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.ArrayList;

class Calculator{
	//List<? extends Number>
	//-List:인터페이스 이름(다형성)
	// - <? extends Number: 제한(한정) 외부에서 입력되는 값의 타입이 Number클래스와 같거나 Number의 자식 클래스들.?는 미지정타입-와일드카드인 *를 의미
	//- Number 클래스의 자식 클래스가 모두 허용
	
	/*
	 * int type: 숫자의 자료형의 종류를 구분하는 값을 받는 매개변수
	 * - 정수형 숫자이면 1을 입력 받음
	 * - 실수형 숫자이면 2를 입력받음
	 */
	public Number add(List<? extends Number> list, int type) {
		if(type == 1) {
			int sum = 0;
			//외부에서 입력받은 여러 값(정수값)들을 하나씩 읽어와서 덧셈 계싼을 수행
			//변수 v를 선언할 때 Number클래스를 사용
			// - 이유: 위에서 <? extends Number>
			for(Number v : list) {
				//Number 클래스가 갖고 있는 intValue() 메소드를 호출해서 정수값을 읽기
				sum += v.intValue();
			}
			//모든 덧셈 계싼을 한 후에는 결과를 반환
			return sum;
		}else
		{//type을 2로 입력해서 double을 이용한 계산. 
			double sum = 0;
			for(Number v : list) {
				sum += v.doubleValue();
			}
			//실수 덧셈 계산 반환
			return sum;
		}
	}
}
public class GenericCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 다형성을 위한 객체 생성 명령어를 작성
		 * -List 인터페이스 이름
		 *  - ArrayList 클래스의 부모 인터페이스
		 *  
		 */
		List<Integer> d = new java.util.ArrayList<Integer>();
		Calculator c = new Calculator();
		
		//add() 메소드의 기능: ArrayList 클래스 내부의 배열에 값을 저장
		// - 정수 10을 저장: Integer 클래스가 정수형 wrapper 클래스
		d.add(10);
		d.add(20);
		
		Number r3 = c.add(d, 1);
		System.out.println(r3);
		//다형성을 사용하지 않은 방법
		// - ArrayList 클래스를 바로 사용하기
		// - 형식) ArrayList<Wrapper 클래스> 객체변수명 = new ArrayList<Wrapper클래스명>();
		//위로 이동하신 후에 import java.util.ArrayList; 명령문을 추가하기
		
		List<Double> a = Arrays.asList(new Double[] { 3.0, 4.0,5.0});
		Number result2 = c.add(a, 2);
		System.out.println(result2);
		
		ArrayList<Double> e = new ArrayList<Double>();
		
		e.add(3.2);
		e.add(3.5);
		
		Number result4 = c.add(e,2);
		System.out.println(result4);
		//ArrayList 클래스를 사용하지 않은 방법
		//-Arrays 클래스가 갖고 있는 static 메소드인 asList()메소드를 호출
		//-asList() 메소드 내부에서 객체를 생성
		// - asList()메소드 에게는 덧셈 계싼에 사용할 정수 3개를 배열에 담아서 전달
		//- 동적으로 한번만 사용할 수 있는 배열을 생성
		//이유ㅣ 힘 메모리에 생성은 되지만 객체의 주소를 따로 보관하지 않기때문
		List<Integer> b = Arrays.asList(new Integer[] {10,20,30});
		Number result = c.add(b, 1);
		System.out.println(result);
		/*
		 * java.util.Vector 자바 유틸 패키지에 있는 Vector클래스 만들기
		 * Vector<Wrapper클래스명> 참조변수 = new Vector<Wrapper클래스명>();
		 * -Wrapper:String, Integer, Double, Long, Float
		 */
		Vector<String> v = new Vector<String>();
		v.add("홍길동");//값의 형식이 같아야함.
		v.add("벡터에서2번째값:");
		v.add("벡터에서3번째값:");
		
		System.out.println(v);
		/*
		 * Vector 클래스 내부에 있는 배열의 특정 방에 새로운 값을 입력하고 싶은 경우
		 * -set() 메소드를 호출하기 
		 * - 형식) 객체 참조변수 이름.set(방번호, 새로운객체);
		 * 	- 주의사항: 방번호 작성시에 0이상이고 크기보다 하나 작아야한다.
		 * 	- 즉, 0 미만이거나 현재 배열의 크기와 같거나 크면 예외 발생
		 */
		v.set(0, "옆비싼허리가운");
		System.out.println(v);
		
		/*
		 * Vector 클래스가 갖고 있는 배열의 모든 값을 확인 또는 특정 방 번호의 값 만을 확인 가능.
		 * 1. 특정 방 번호의 값 만을 읽기
		 * -get() 메소드를 호출하기
		 * -형식: 객체참조변수이름.get(방번호);
		 * -방번호 작성시 주의사항: 0~ 배열의 크기 -1 까지만 사용
		 */
		String value = v.get(0);
		System.out.println("첫번째 이름: "+value);
		value = v.get(1);
		System.out.println("두번째 이름: "+ value);
		/*
		 * Iterater
		 * Vector 클래스의 내부 배열이 갖고 있는 모든 값들을 읽어와서 출력하기
		 * -반복자 (Iterator)를 사용
		 * 또는 
		 *  -for 반복문과 get() 메소드를 함께 사용
		 *  - 차이점: get() 메소드는 방 번호를 꼭 지정해야 합니다.
		 *   - 하지만, 반복자는 방 번호를 지정하지 않습니다.
		 */
		/*
		 * 반복자를 사용하는 형식
		 * Iterator 인터페이스를 사용.
		 * 형식: Iterator<Wrapper클래스이름> 객체참조변수이름 = Vector클래스가 갖고있는iterator()메소드를 호출.
		 */
		
		/*
		 * Vector v 에는 0이상의 값이 있을 수 있끼 때문에 반복문을 사용해야 합니다.
		 * - 주로 while 반복문을 많이 사용합니다.
		 * - 형식
		 * while(조건식){
		 *  반복적으로 실행할 명령문;}
		 *  -조건식: 반복자인 Iterator 인터페이스가 갖고 있는 hasNext() 메소드를 호출
		 *  -Vector 클래스의 내부 배열에서 읽어올 값이 있다면 true을 반환
		 *  -없다면 false를 반환
		 *  -while(v.hasNext(() == true)
		 */
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println("현재 값이 있는 상태입니다.");
			String value3 = it.next();
			System.out.println(value3);
		}
		
		/*
		 * contains
		 * 검색(Search) 다길동 김길동 나길동 중에서 특정 이르을 찾기
		 * - 형식: boolean 변수명 = 객체참조변수이름.contains(찾고싶은 값 또는 객체);
		 * - 예제: 다길동 이름을 찾기
		 * - boolean h = f.contains("다길동");
		 * - 만약 다길동이 있다면 true을 반환
		 * - 만약 다길동이 있다면 true를 반환
		 */
		boolean h = v.contains("옆비싼허리가운");
		System.out.println(h);
		
		//없는 이름인 라길동을 찾기
		h = v.contains("라길동");
		System.out.println("라길동을 찾은 결과는 " + h);
		
		/*
		 * Vector 클래스가 갖고 있는 배열이 갖고 있는 값을 삭제하기
		 * 1) 모든 값을 삭제(제거): clear() 메소드를 사용
		 * - 형식: 객체참조변수이름.clear();
		 * 2) 하나의 값만을 삭제 remove(인덱스 자릿수);
		 * -형식: 객체참조변수이름.remove(인덱스);
		 */
		v.remove(0);
		System.out.println(v.toString());
		v.clear();
		/*
		 * size()메소드를 호출하면 현재 배열에 저장된 값의 갯수를 반환할 수 있따.
		 * -형식 : int 변수명 = 객체참조변수이름.size();
		 */
		int si = v.size();
		System.out.println(si);
	}

}
