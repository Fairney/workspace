package pkg4;

class ParentClass{
	public void method(){
		System.out.println("method() in ParentClass");
	}
}
class ChildClass extends ParentClass{
	public void method(){
		System.out.println("method() in ChildClass");
	}
}
public class MainClass{
	public static void main(String[] args) {
		ParentClass m = new ParentClass();
		m.method();
		
		ChildClass n = new ChildClass();
		n.method();
	}
	
}
