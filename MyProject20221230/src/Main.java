import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.sql.*;
public class Main {
//JDBD(java database connectivity)에 대한 이해를 돕기 위한 예제를 작성
//	목적:다양한 종류의 데이터베이스(또는 데이터베이스 관리 시스템)와 자바 프로그램의 연결
// 2)예제에서는 데이터베이스의 종류를 ArrayList와 HashSet 두종류
// 3)jdbc 역할을 수행하는 메소드: Iterator 인터페이스 또는 각각의 ArrayList와 HashSet클래스가 갖고 있는 iterator()메소드
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4) ArrayList 클래스를 사용하기 위해서 새로운 객체를 생성
		ArrayList<String> a = new ArrayList<String>();
		HashSet<String> b = new HashSet<String>();
		a.add("나는");
		a.add("뭐랄까");
		a.add("나길동");
		
		b.add("나는");
		b.add("뭐랄까");
		b.add("더길동");
		
		Iterator<String> it = a.iterator();
		while(it.hasNext())
		{
			String value = it.next();
			System.out.println(value);
		}
		//1)오라클 DBMS에 정상적으로 연결이 되었을 때 연결 정보를 보관할 객체 참조 변수 선언
		Connection con = null;
		try {
			//forName()메소드의 역할
			//-ojdbc6.jar 파일 내부에서 oracle.jdbc.driver.OracleDriver 클래스를 찾아서
			//만약 있으면 힙 메모리에 객체를 생성하고
			//객체의 주소를 DriverManager에 전달
			//-하지만 oracle.jdbc.driver.OracleDriver 정보를 잘못 작성하면
			//실행 오류가 발생합니다.(종류는 ClassNotFoundException)
			//-클래스를 찾지 못했다면 오류-객체를 만들 수 없기 때문에 발생)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","client1","1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
