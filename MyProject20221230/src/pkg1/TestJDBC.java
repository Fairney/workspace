package pkg1;
import java.sql.*;
/*
 * 1.JDBC 프로그래밍 예제 작성
 * 1) DBMS를 만든 회사에서 무료로 제공해주는 드라이버 프로그램을 자바 프로젝트로 불러오기
 * - ojdbc6.jar
 * C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
 */
//2.java.sql.*-jdbc관련 패키지
//JDBC인터페이스 프로그램 사용하기 위해서.
public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)오라클 DBMS에 정상적으로 연결이 되었을 때 연결 정보를 보관할 객체 참조 변수 선언
		Connection con =null;
		//2) 실행할 SQL문장을 문자열 형식으로 보관할 객체의 주소를 저장할 변수를 선언
		//-모든 종류의 DML(Data Manipulation Language: 데이터 조작어)
		// - DML의 종류: SELECT, INSERT, UPDATE, DELETE
		Statement st = null;
		
		//select문장을 실행할 executeQuery() 메소드의 반환값을 보관할 참조 변수를 선언
		//- 이유: 오라클 DBMS에서 SELECT문장을 싱핼한 결과를 보관할 인터페이스
		//ResultSet: Result(결과) + (집합)의 합성어;
		ResultSet rs = null;
		
		//3)실행할 SQL문장을 문자열 형식으로 보관할 변수를 선언 + 초기화
		String select = "SELECT bookname FROM newbook";
		String select2 = "SELECT bookid FROM newbook";
		String select3 = "SELECT bookid,bookname FROM newbook";
		String selectAll = "Select * from newbook";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","client1","1234");
			
			//create Statement
			//가장 빠르면서 가장 많이 사용하는 방식
			//-select, insert,update,delete문 모두 공통
			st = con.createStatement();
			//위에서 정상적으로 객체가 생성된 경우에는 모니터 화면에 sql 문장 저장
			//객체 생성 성공 메시지 출력
			System.out.println("SQL SELECT문장 저장 객체 생성 성공");
			//SQL문이 SELECT일 때 executeQuery(String sql)-ResultSet객체에 저장할 때 사용.Statement의 메소드.
			rs = st.executeQuery(selectAll);
			//rs = 	st.execute(select3);
			//정상적으로 executeQuery(String sql)메소드가 실행될 것이다.
			//문장을 바꾼후에, 컬럼의 이름과 자료형을 일치시켜야한다. 밑에 while문에서.
			
			/*
			 * 실행할 select 문장을 바꾼 후의 주의사항
			 * -컬럼 이름과 자료형을 맞추어야 합니다.
			 * -예1) bookid: create table에서 varchar2 자료형을 사용 -> String
			 * -예2) price: create table에서 number 자료형을 사용 -> Integer
			 * while(rs.next()){
			 * 		Integer 지역변수이름 = rs.getInt("bookid");
			 * 	-> Integer 자료형과 가져온 컬럼의 이름.	
			 * }
			 * 
			 */
			System.out.println("SELECT문장 실행 성공");
			
			//SQL문이 INSERT, UPDATE, DELETE일 때'
			/*
			 * ResultSet 인터페이스가 가리키는 객체 내부에는 cursor 객체가 존재
			 * -cursor 객체를 사용할 때 next()메소드를 호출
			 *  - ResultSet 객체가 갖고 있는 행의 갯수가 0이상일 수 있기 때문에
			 *    반복문과 함께 사용해야 합니다.
			 *  - 주로 while 반복문을 많이 사용: 이유 조건식 하나를 사용해서 반복 여부를 결정가능 (간소화)
			 *  형식)
			 *  while(rs.next==true){
			 *  	//특정 컬럼(열 또는 속성)이 갖고 있는 값을 가져오기
			 *  	//-아래의 String은 bookname의 타입이 varchar2이므로 String임.
			 *  	String 지역변수이름 = rs.getString("컬럼이름 또는 열 이름");
			 *  	//화면에 표시하기
			 *  	System.out.println("오라클 데이터베이스에서 가져온 책이름: " + 지역변수이름);
			 *  }
			 */
			while(rs.next()) {
				//String value = rs.getString("bookid");//실행은 되나(형변환은 되나)오류가 발생할 수 있음.
				
				//selectAll
				int value = rs.getInt("bookid");
				String value2 = rs.getString("bookname");
				String value3 = rs.getString("publisher");
				int value4 = rs.getInt("Price");
				//System.out.println("가져온 이름은: " + value + " , " + value2);//+ " , " + value3+ " , " + value4
				System.out.println("가져온 이름은: " + value + " , " + value2+ " , " + value3+ " , " + value4);
				//select 순서를 다르게 하려면 select price,publish..이렇게 다르게 해야한다 from newbook.
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			/*
			 * 다 사용한 객체를 힙 메모리 영역에서 없애기
			 * - 운영체제에게 돌려주기(반환하기)
			 * -Connection 객체, Statement 객체, ResultSet 객체가 갖고 있는 close()메소드를 호출하기
			 * -기본순서: 제일 마지막에 생성된 객체부터 호출하기
			 * rs.close();
			 * st.close();
			 * con.close();
			 * -주의사항: SQLException 예외가 발생할 가능성이 있으므로 try~catch 블럭 내부에 작성.
			 */
			try {
				//NullPointerException 예외를 방지하기 위해서 if조건문을 작성.
				if(rs != null)rs.close();
				if(st != null)st.close();
				if(con != null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
