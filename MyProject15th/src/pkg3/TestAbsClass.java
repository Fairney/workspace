package pkg3;

class Shape{
	public void draw() {
		System.out.println("기본 명령어");
	}
}
//3. 추상 클래스로 AbsShape 클래스를 정의

abstract class AbsShape{
	//추상 메소드를 선언: 접근제한자, abstract, 반환형, 이름, 매개변수
	public abstract void draw();
	/*
	 * 일반 클래스와의 차이점
	 * 1) abstract 예약어
	 * 2) { }, 명령어;를 작성하지 않음.
	 */
}

//4. 일반 클래스인 Shape를 부모 클래스로 지정(상속)

class Rect extends Shape{
	
}
//5. cntkd zmffotmdls AbsShape를 부모 클래스로 지정(상속)

class Rect2 extends AbsShape{
//컴파일러는 부모 클래스에서 추상클래스가 선언되어있으면 자식 클래스에서 추상 메소드를 재정의해야한다고 명시되어있다.
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형 도형을 화면에 그립니다.");
	}
	
}
public class TestAbsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect2 a = new Rect2();
		a.draw();//위임방식.
		//오류: 이유는 추상 메소드를 포함
		//AbsShape c = new AbsShape();
		AbsShape c = a; //다형성의 자동형변환은 가능.
	}

}
