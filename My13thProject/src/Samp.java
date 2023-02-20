
public class Samp {
	int id;
	public Samp(int x) {
		this.id = x;
	}
	public Samp() {
		this.id = 0;
	}
	public void set(int x) {this.id = x;}
	public int get() {return this.id;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samp ob1 =new Samp(3);
		Samp ob2 = new Samp();
		//Samp s; 아직 객체를 넣지 않음.

	}
}
