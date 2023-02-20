package FirstProject;

public class OverridingEx extends Parent{

	
	public OverridingEx() {
		System.out.println("자식클래스의 생성자");
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("여기는 자식 클래스의 오버라이딩한 메소드.");
	}
	
	void out(){
		System.out.println("Parent에서는 접근 불가");
	}

	public static void main(String[] args) {
		//동적바인딩을 알아보자.
		
		OverridingEx p1 = new OverridingEx();
		Parent p2 = new OverridingEx();
		p1.display();
		p1.out();
		p2.display();
		//p2.out();
	}

}
