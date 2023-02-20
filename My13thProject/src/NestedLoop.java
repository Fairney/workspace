
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i = 1; i<10; i ++,System.out.println()) {
			for(j = 1; j<10; j++,System.out.print('\t')) {
				System.out.print(i + "*" + j + "=" + i*j);
			}
		}
	}

}
