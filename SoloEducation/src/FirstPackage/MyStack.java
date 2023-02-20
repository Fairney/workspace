package FirstPackage;

	class GStack<T> {
		int tos;
		Object[] stck;
	
		public GStack() {
			tos = 0;
			stck = new Object[10];
		}
	
		public void push(T item) {
			if(tos == 10) 
				return;
			else {
				stck[tos] = item;
				tos++;
			}
		}
		
		public T pop()
		{
			if(tos == 0)
				return null;
			else {
				tos--;
				return (T)stck[tos];
			}
		}
}
public class MyStack {

	public static void main(String[] args) {
		GStack<String> gstack = new GStack<String>();
		gstack.push("이름");
		gstack.push("이");
		gstack.push("무엇이냐");
		
		for(int i=0; i<3; i++) {
			System.out.println(gstack.pop());
			
		}
	}

}
