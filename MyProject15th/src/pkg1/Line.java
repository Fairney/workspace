package pkg1;

public class Line extends Shape {
	/*
	 * draw() 메소드를 재정의하는 방법: 2가지
	 * 1. 안전한 방법: 입력 오류를 없애는 방법
	 * -예) drow() 면은 추가하는 방법임.
	 *  엄격함(강제성): jdk 1.5버전 부터 어노테이션(애노테이션)문법이 추가
	 *  -이름을 잘못 작성하면 오류를 발생시킴(컴파일 시점)
	 *  -형식: 메소드 정의 위에다 장식을 답니다. -> @Override
	 */
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
