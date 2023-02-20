/*
 * 1. JDBC(Java DataBase Connectivity)에 대한 이해를 돕기 위한 예제를 작성
 * 
 * 1) 목적: 다양한 종류의 데이터베이스(또는 데이터베이스 관리 시스템)와 
 *    자바 프로그램과의 연결 
 *    
 * 2) 예제에서는 데이터베이스의 종류를 ArrayList와 HashSet 두 종류
 * 
 * 3) JDBC 역할을 수행하는 메소드: Iterator 인터페이스 또는
 *    각각의 ArrayList와 HashSet 클래스가 갖고 있는 iterator() 메소드
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) {
		//4) ArrayList 클래스를 사용하기 위해서 새로운 객체를 생성
		ArrayList<String> a = new ArrayList<String>();
		//5) HashSet 클래스를 사용하기 위한 객체를 생성
		HashSet<String> b = new HashSet<String>();
		//6) ArrayList 클래스에 문자열 값을 저장하기(3명의 사람 이름을 저장)
		a.add("홍길동");
		a.add("김길동");
		a.add("나길동");
		//7) HashSet 클래스에 문자열 값을 저장하기(3개의 운동 이름을 저장)
		b.add("야구");
		b.add("배구");
		b.add("축구");
		//8) ArrayList 클래스에 저장된 3개의 사람 이름들을 꺼내오기
		//9) Iterator 인터페이스를 사용
		Iterator<String> c = b.iterator();
		//10) while 반복문을 사용해서 여러 개의 사람 이름들을 하나씩 가져오기
		while(c.hasNext() == true) {
			//11) next() 메소드를 호출해서 사람 이름을 꺼내오기
			String value = c.next();
			//12) 화면에 사람 이름을 표시하기
			System.out.println("사람 이름은 " + value);
		}
	}
}






