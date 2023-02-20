package pkg1;

import oracle.jdbc.driver.OracleDriver;

/*
 * 1. JDBC 프로그래밍 예제 작성
 * 1) DBMS를 만든 회사에서 무료로 제공해주는 드라이버 프로그램을 자바 프로젝트로 불러오기
 * - ojdbc6.jar
 *   - 경로: C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
 */
//2. java.sql 패키지를 사용하기: 이유는 JDBC Driver Interface 프로그램을 사용하기 위함
// - 목적: 자바 프로그램과 JDBC Driver 프로그램을 연결
import java.sql.*;
public class TestJDBC {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. 드라이버 객체를 생성하는 명령어를 작성
		
		//1) 오라클 DBMS에 정상적으로 연결이 되었을 때 연결 정보를 보관할 객체 참조 변수 선언
		Connection con = null;
		
		try {
			java.lang.Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("forName() 메소드를 정상적으로 실행함");
			System.out.println("프로그램에서 오라클 데이터베이스로 연결할 때");
			System.out.println("사용할 드라이버 객체를 생성함");
			
			con =  DriverManager.getConnection(
				   "jdbc:oracle:thin:@localhost:1521:xe","user1","1234");
			
			System.out.println("오라클 DBMS에 연결되었습니다.");
			
		}catch(java.lang.ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}















