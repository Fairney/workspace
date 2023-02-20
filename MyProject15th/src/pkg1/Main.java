package pkg1;

import java.util.ArrayList;
import java.util.Scanner;

//다형성: 상속 + 메소드 재정의 + 동적 바인딩 + 자동 형변환
public class Main {
	
	static ArrayList<Shape> list = new ArrayList();
	static void shapeDraw() {
		Scanner sc = new Scanner(System.in);
		Shape b = null;
		/*
		 * null의 의미: 아직 구체적인 도형 객체를 생성하지 않았기 때문
		 * - 즉, 사용자가 메뉴 번호를 입력하는 시점에 생성
		 */
		//Shape c = new Line();//이건 동적 바인딩이지만, 쓰일 수도 있고 안 쓸수도 있어 낭비에 가까운 코딩방식.
		//4. 사용자가 메뉴 번호를 고를 수 있또록 메뉴들을 표시하기
		
		
		System.out.println("*** 도형 그리기 프로그램 ***");
		System.out.println("1. 선 그리기 2. 사각형 그리기 3. 원그리기 4. 별 그리기");
		System.out.println("도형을 선택하시고 그 도형의 번호를 정수로 입력하세요");
		int a;
		a = sc.nextInt();
		if(a == 1)
		{
			b = new Line();
			b.draw();
		}
		else if(a == 2)
		{
			b = new Rect();
			b.draw();
		}
		else if(a == 3) {
			b = new Circle();
			b.draw();
			}
		else if(a == 4) {
			b = new Star();
			b.draw();
		}
		sc.close();
		
		
	}
	public static void main(String[] args) {
		/*
		 * 파일 저장할 때 주로 사용하시는 단축키: Ctrl +s (하나의 파일만 저장)
		 * 한꺼번에 여러파일들을 저장할 때 단축키: Ctrl + shift +s
		 */
		//2. Scanner 클래스를 사용하기 위해서는 객체를 생성.
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//3. 자동 형 변환 개념을 사용하기 위해서 나중에 생성될 구체적인 도형
		//객체의 주소를 보관할 참조 변수를 선언
		shapeDraw();
		
		sc.close();
		
	}

}
