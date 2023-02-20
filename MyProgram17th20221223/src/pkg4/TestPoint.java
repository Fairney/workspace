package pkg4;
/*
 * Object 클래스에서 자식 클래스로 물려준 toString() 메소드를 재정의
 * -이유: 기본 값인 패키지명+ 명(.)+클래스명+@+숫자와문자의 조합 값을 사용하지 않기 위함
 */
//Point를 정의
class Point{
	int m_x,m_y;
	Point(int x, int y){
		m_x = x;
		m_y = y;
	}
	@Override
	public String toString() {
		String result = m_x + "," + m_y;
		// TODO Auto-generated method stub
		return result;
	}
	
}
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(3,4);
		System.out.println(p.toString());
	}

}
