package pkg2;
import java.sql.*;
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
	
	/*
	 * PreparedStatement 인터페이슫를 사용해서 insert into sql문을 실행하는
	 * 새로운 insert()메소드를 구현하기
	 * 1. 외부에서 입력 받을 값 목록
	 * 1) 오라클 데이터베이스에 연결할 때 사용할 연결 객체: Connection pcon
	 * 2)사원번호: int pempno
	 * 3)사원이름: String pename
	 * 주의사항: 기존에 있었던 insert 메소드와 매개변수가 달라야한다
	 */
	public void insert(Connection pcon, int pempno, String pename) {
		//4) 실행할 sql문장을 문자열로 정의하고 변수에다가 저장하기
		String sql = "INSERT INTO emp_tbl(empno,ename) values(?,?)";
		PreparedStatement ps = null;
		try {
			//7) SQL문장을 임시로 보관할 객체를 생성하기
			ps = pcon.prepareStatement(sql);
			//8) SQL문에 있는 물음표 자리에 실제 값을 대입(할당)하기
			ps.setInt(1,  pempno);
			ps.setString(2, pename);
			//9) insert into sql문을 실행하기
			int res = ps.executeUpdate();
			//10) 데이터베이스에 저장된 데이터의 갯수(실제로는 레코드(행)의 갯수)를 화면에 출력하기
			System.out.println("insert into sql문을 실행한 결과는 " + res);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	/*
	 * select max(empno)+1 from emp_tbl sql문을 실행시키는 메소드를 정의
	 * 1. 외부로부터 입력 받을 값의 목록
	 * 1) 오라클 연결 객체
	 * 2. 반환 값: max(empno)+1
	 * ->실무에서는 더 안전한 방식을 사용
	 * -max(nvl(empno, 0))+1
	 * 
	 * 3. 이름: getNextEmpno
	 */
	public int getNextEmpno(Connection pcon) {
		//반환할 변수 선언
		int res = 0;
		//sql 실행문장을 문자열로 저장
		String sql = "select max(empno)+1 from emp_tbl";
		Statement st = null;
		ResultSet rs = null;
		try {
			st = pcon.createStatement();
			rs = st.executeQuery(sql);
			//8) 오라클 데이터베이스로 부터 전달 받은 값을 변수 RES에 대입하기//-먼저 next()메소드를 호출해서 오라클에서 값을 전달했는지를 검사하기
			//-true인 경우: 오라클에서 저희가 만든 프로그램으로 값을 전달함
			while(rs.next()) {
				//9)get()메소드를 호출해서 값을 가져와서 변수 res에 대입하기
				//getInt(위치)-max(empno)+1의 위치.
				res = rs.getInt(1);
		  		//10) 화면에 출력하기
				System.out.println("오라클 데이터베이스로부터 받은 값은 " + res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			
				try {
					if(rs != null) rs.close();
					if(st != null) st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return res;
	}
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
		String insertsql = "INSERT INTO newbook(bookid,bookname,publisher,price) VALUES(14,'블라','누구세용?',15000)";
		//"insert into newbook(bookid,bookname,publisher,price)"+"values(" + 변수명 + "," + "'책이름1','출판사',가격)";
		try {
			pst = pcon.createStatement();
			//executeUpdate()메소드를 호출
			int row = pst.executeUpdate(insertsql);
			
			System.out.println("insert sql문을 실행한 결과 값:" + row);
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
	 * insert(메소드: 기능을 선언(정의)
	 * 이유: main() 메소드 내부에서 같은 명령어가 여러번 발생
	 * -중복되는 명령어들을 잘라내기 를 한 것
	 * 이유: 관리 + 유지보수를 용이하게 하기 위함 + 재사용 성을 높이기 위함
	 * -중앙 집중식 관리
	 * ->사용을 해야합니다.
	 * -> 다른 메소드에서 메소드의 이름을 불러야 합니다.
	 * ->호출 명령문을 작성
	 * ->형식: 메소드이름(매개변수 선언 형식에 맞게 값들을 나열하기)
	 * 예:insert(Connection 객체참조변수이름, Statement 객체참조변수이름, 책아이디정수,"책이름문자열","출판사이름문자열", 책가격정수);
	 */
	public boolean insert(Connection pcon, Statement pst, int pnum, String pbookname,String ppublisher, int pprice){
		boolean r = false;
		String insertSql = "insert into newbook(bookid,bookname,publisher,price)";
		insertSql += " VALUES("+pnum+", '"+pbookname+"', '"+ ppublisher+"',";
		insertSql += pprice;
		insertSql += ")";
		/*
		 * 매개변수 자리에 값을 임의의 갑승ㄹ 대입하면 아래와 같습니다.
		 * INSERT INTO newbook(bookid,bookname,publisher,price)
		 * VALUES(20, '책이름', '출판사이름', 3000)
		 */
		//3) 매개변수인 pcon이 외부에서 받은 값이 null인지를 판단하기
		if(pcon != null) {
			System.out.println("현재 프로그램과 오라클 dbms가 연결 중에 있습니다.");
			if(pst == null)
			{
			try {
				pst = pcon.createStatement();
				//4) insert문을 실행하려면 Statement 인터페이스가 갖고 있는 executeUpdate()
				//메소드를 호출해야 합니다.
				//- 메소드를 실행하면 insert sqla문이 오라클 dbms에 전달되어 실행되고
				//-실행 결과로는 테이블에 저장된 데이터의 갯수(행의 갯수)가 됩니다.
				int row = pst.executeUpdate(insertSql);
				System.out.println("테이블에 저장된 데이터의 행의 갯수:"+ row);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {}
			
		}else {
			System.out.println("현재 오라클 dbms에 연결되어 있지 않습니다...");
		}
		}return r;
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
	public void insert(String pall) {
		Connection con = null;
		Statement st = null;
		/*
		 * 매개변수인 pall은 다른 메소드로부터 4개의 값을 입력받아야 합니다.
		 * -입력 받는 형식을 정하셔야 합니다.
		 * -값과 값 사이에 구분자를 넣기
		 * ㅇ) 책아이디값+쉽표+책이름값+쉽표+출판사+쉽표+가격.
		 */
		System.out.println(pall);
		
		//getConnection등등 메인에서 구현된 기능을 전부 다시 구현해야하는 방법 1-다른 외부 메소드에서는 사용할 수 없는 상태
		//명령어를 복사해서 붙여넣기 또는 새로운 메솓를 정의해서 메소드를 호출-명령어가 단순하지 않음(복잡)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","client1","1234");
		
			//Statement 객체 생성: 용도는 insert into sql문 전체를 문자열 형식으로 보관.
			st = con.createStatement();
			
			//executeUpdate() 메소드를 호출해서 insert sql문을 실행하기.-insert문에 연결.
			int row = st.executeUpdate("INSERT INTO newbook(bookid,bookname,publisher,price) VALUES("+pall+")");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(st != null)st.close();
					if(con != null)con.close();
					System.out.println("오라클 데이터베이스 연결을 끊습니다.");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
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
	public void crIdx(Connection pcon) throws SQLException{
		String sql = "CREATE INDEX myidx1006 on testidxemp3(empno)";
		Statement s =null;
		//try {
			s = pcon.createStatement();
			s.execute(sql);
		//}catch(SQLException e) {
		//	e.printStackTrace();
		//}
	}
	
	
	public boolean delete(Connection pcon, Statement pst) {
		boolean r = false;
		String deleteSQL = "DELETE FROM NEWBOOK WHERE bookid = 14";
		
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
		TestJDBCInsert main = new TestJDBCInsert();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","client1","1234");
			//insert문 호출
			//main.insert(con, st);
			//select문 호출
			//main.select(con, st, rs);
			//delete문 호출
			//main.delete(con, st);
			//main.insert(con, st1111111111114, 20, "한여자두남자", "융진", 39000);
			//main.insert("21,'책이름1','출판사이름',1000");//insert(pall);
			//main.insert(con, 10, "몰루");
			int nextEmpno = main.getNextEmpno(con);
			System.out.println("getNextEmpno() 메소드의 반환값:" + nextEmpno);
			//main.insert(con, nextEmpno, "홍길동");
			
			//crIdx(Connection)메소드를 호출하기
			//-주의사항: 방금 전에 crIdx() 메소드 선언ㅂ ㅜ끝에 throws 명령어를 추가
			// - 호출하기 전에 try~ catch블럭을 작성해야 합니다.
			
			try {
				main.crIdx(con);
				System.out.println("crIdx() 메소드 내부의 명령어들을 모두 실행");
			}catch(SQLException e) {
				System.out.println("crIdx() 메소드 내부에서 오류가 발생");
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				//NullPointerException 예외를 방지하기 위해서 if조건문을 작성.
				if(con != null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
