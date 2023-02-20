package mypkg1;
import pkg2.TestJDBCInsert;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestJDBCInsert main = new TestJDBCInsert();
		
		main.insert("22,'책이름','출판사',1000");
}
}