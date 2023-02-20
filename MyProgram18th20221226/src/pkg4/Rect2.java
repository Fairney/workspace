package pkg4;
/*
 * 클래스 내부에서 변수를 선언하면 멤버 변수(전역 변수)
 * -사용 범위: 모든 메소드에서 사용 가능
 * -단, static 제한자를 사용해서 메소드를 정의하면 사용 불가능
 * 예)
 * public class MyClass{
 * int a = 10;//인스턴스(객체) 변수
 * public static void method(){
 * 	System.out.println(a);//오류:main()메소드와 유사
 *  //인스턴스 변수를 사용하고 싶다면 객체를 생성
 *  MyClass obj =new MyClass();
 *  System.out.println(obj.a);
 * }
 */
public class Rect2 {
	int a,b;
	
	public Rect2(int _a, int _b) {
		a = _a;
		b = _b;
	}//end of Rect2(int _a, int b)

	@Override
	public String toString() {
		String r = "Rect(" + a + "," + b + ")";
		return r;
	}// end of toString()
	
	
	//equals() 메소드를 재정의
	@Override
	public boolean equals(Object obj) {
		//Rect2 rect = (Rect2) obj;
		
//		boolean check1 = this.a == rect.a;
//		boolean check2 = this.b == rect.b;
//		if(check1 && check2) {
//			return true;
//		}else
//			return false;
		// Rect 변수 선언 없이 형변환
		
		boolean check1 = this.a ==((Rect2)obj).a;
		boolean check2 = this.b ==((Rect2)obj).b;
		if(check1 == true && check2 == true) return true;
		else return false;
		//return check1 ==true&& check2 == true ? true : false
	}
	
}
