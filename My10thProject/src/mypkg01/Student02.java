package mypkg01;

public class Student02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. mypkg01 패키지에 있는 Student 클래스를 사용하기
		Student b = new Student();
		//2. Student 클래스 내부에서 선언한 int age 멤버변수를 사용하기.
		int c= b.age;
		System.out.println(c);
		String grade = b.grade;
		System.out.println(grade);
		int g;
		for(int i = 0; i<b.gradePoint.length;i++) {
			System.out.println((i+1)+"번째 입력한 값은 " + b.gradePoint[i]);
		}
		//int d = b.age2; 이거는 private라 사용 불가.
		g= b.getStudentAge2();
		System.out.println(g);
	}

}
