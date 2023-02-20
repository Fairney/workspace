package pkg1;
import java.sql.*;
import java.util.Scanner;
/*
 * 1.JDBC 프로그래밍 예제 작성
 * 1) DBMS를 만든 회사에서 무료로 제공해주는 드라이버 프로그램을 자바 프로젝트로 불러오기
 * - ojdbc6.jar
 * C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
 */
//2.java.sql.*-jdbc관련 패키지
//JDBC인터페이스 프로그램 사용하기 위해서.
public class TestJDBCInsert {
	/*
	 * 새로운 메소드를 정의하기
	 * -기능: insert sql 문을 작성하고 실행
	 * -이름: insert
	 * -매개변수
	 * 1) main() 메소드 내부에서 선언한 Connection 참조변수인 con을 입력 받는 변수 선언
	 * -Connection pcon
	 * -pcon에서 p는 parameter(매개체)의 약어
	 * 2) main() 메소드 내부에서 선언한 Statement 참조 변수인 st를 입력 받는 변수 선언
	 * -Statement pst
	 */
	public boolean insert(Connection pcon, Statement pst) {
		//결과 값인 true 또는 false을 보관할 변수를 선언
		
		//String 변수를 선언한 후에 왼쪽과 오른쪽이 1:1로 이루어져야함.	
		//테이블이 갖고 있는 모든 속성 이름을 사용하는 경우에는 모든 속성 이름들을 생략가능
					//String insert2 ="INSERT INTO newbook VALUES(15, '책이름2','출판사2',2000)";
					//값의 작성 순서는 CREATE TABLE SQL문에서 작성한 자료형
					//다른 순서로 값을 지정하기 위해서는 NEWBOOK(BOOKNAME,PRICE,BOOKID,PUBLISHER) VALUES('책이름',가격(쩡수), 책아이디(정수), '출판사이름')
		//특정 컬럼만 선택해서 값을 저장 가능
				//주의사항: 기본키, NOT NULL속성을 갖고있는 컬럼은 꼭! 값을 지정해야 합니다.
					//--기본키: PRIMARY KEY 명령어를 사용 -> 기본적으로 NOT NULL이고 유일(Unique)한 값
					//not null 제한(제약)속성: 필수
					//유일:중복을 제거
					//--newbook 테이블을 사용하는 경우에는 기본키인 bookid는 꼭 넣어야 합니다.
					// 특정 컬럼 이름이 not null 여부를 파악하시려면 desc new book;
					//String inser3 = INSERT INTO NEWBOOK(BOOKID) VALUES('15');

		boolean r = false;
		String insertsql = "INSERT INTO newbook(bookid,bookname,publisher,price) VALUES(16,'이름','누구세용?',15000)";
		try {
			pst = pcon.createStatement();
			//executeUpdate()메소드를 호출
			int row = pst.executeUpdate(insertsql);
			
			System.out.println("insert sql문을 ㅅ실행한 결과 값:" + row);
			if(row >= 1) {
				System.out.println("데이터베이스에 새로운 데이터를 저장했습니다.");
				r = true;
			}else
			{
				System.out.println("데이터베이스에 새로운 데이터를 저장하지 못했습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//pst.close();이건 해야함.
				//pcon.close();이건 안됨 main쪽에서 영향이 가기 때문.
				//다른 메소드에 영향을 끼침.
				//주의사항: Connection pcon 매개변수를 사용해서 close() 메소드를 호출해서는 안됩니다.
				//(이유: main() 메소드에 있는 다른 명령어에 영향을 끼침)
				//2. Statement pst 매개변수를 사용해서 close() 메소드를 호출합니다.
				if(pst != null) pst.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return r;
	}
	/*
	 * 2. select sql문 만을 작성하고 실행하는 메소드를 정의
	 * 1) 이름: select
	 * 2) 매개변수를 선언
	 * main() 메소드 내부에ㅓ 선언한 Connection con 참조 변수를 입력 받는 변수를 선언
	 * 	-Connection pcon
	 * 나. main() 메소드 내부에서 선언한 Statement st 참조 변수 입력 변수
	 * -Statement pst
	 * 다. main() 메소드의 ResultSet rs 참조 변수 입력 변수
	 * -ResultSet prs
	 */
	
	public void select(Connection pcon, Statement pst, ResultSet prs) {
		String q = "SELECT bookname from newbook";
		try {
			pst = pcon.createStatement();
			prs = pst.executeQuery(q);
			while(prs.next()) {
				String value = prs.getString("bookname");
				System.out.println("가져온 이름은: " + value);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(prs!= null)prs.close();
				if(pst!= null)pst.close();
				System.out.println("다 사용한 객체들을 시스템에 반환");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public boolean update(Connection pcon, Statement pst) {
		boolean r = false;
		String updateSQL = "UPDATE newbook SET bookname = '누구세용?' WHERE BOOKID =13";
		try {
			pst = pcon.createStatement();
			int row = pst.executeUpdate(updateSQL);
			if(row >= 1) {
				System.out.println("데이터베이스 업데이트");
				r=true;
			}
			else {
				System.out.println("데이터베이스 업데이트 실패.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pst!=null)pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return r;
	}
	
	public boolean delete(Connection pcon, Statement pst) {
		boolean r = false;
		String deleteSQL = "DELETE FROM NEWBOOK WHERE bookid = 16";
		
		try {
			pst = pcon.createStatement();
			int row = pst.executeUpdate(deleteSQL);
			if(row>=1) {
				System.out.println("delete했음");
				r = true;
			}
			else {
				System.out.println("delete실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(pst != null)pst.close();
				}catch(SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return r;		
		
	}
	
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","client1","1234");
			st = con.createStatement();
			}catch(ClassNotFoundException e) {
			e.printStackTrace();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
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
