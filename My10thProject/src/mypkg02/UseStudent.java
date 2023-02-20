package mypkg02;

import mypkg01.Adder;
import mypkg01.Student;

public class UseStudent {
	public static void main(String[] args) {
		// 1. 주의사항: 다른 패키지(mypkg01)에 있는 Student 클래스를 사용하는 방법(형식)
		// 1) import 패키지명.클래스명;
		// - import 명령어의 작성 위치: package 명령어와 public class 클래스명{} 사이.
		// 2) 클래스명을 사용하는 명령어에서 패키지명과 점(.) 연사자를 함께 사용
		// - gudtlr: mypkg01.Student 변수명 = new mypkg01.Student();
		Student a = new Student();
		//3) Student 클래스 내부에ㅓ 선언한 멤버변수인 number를 사용(현재 값 읽기)
		int b = a.number;
		int c;
		String name = a.name;
		System.out.println("학생 번호는 " + b);
		System.out.println("학생 이름은 " + name);
		//System.out.println("학생 이름은 " + a.age);default 접근제한자가 적용되었기 때문에 age에 접근 불가능 하다.
		Adder ad = new Adder();
		c = ad.add(b, 5);
		System.out.println(c);
		
	}
}
