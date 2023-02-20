package pkg3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		String sql = "create view empview as select empno, ename from emp_tbl with read only";
		Statement s = null;
		
		try {
				java.lang.Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("오라클 드라이버 클래스 객체 생성 성공");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","client1","1234");
				System.out.println("오라클 데이터베이스 연결 성공");
				s = conn.createStatement();
				boolean r = s.execute(sql);
				System.out.println(r);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(s != null) s.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				System.out.println("오라클 데이터베이스 종료 오류");
				e.printStackTrace();
			}
		}
	}

}
