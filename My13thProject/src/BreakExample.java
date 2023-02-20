import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = 0;
		while(true) {
			if(in.nextInt() == -1)
			{
				System.out.println(num);
				break;
			}
			num++;
		}
	}

}
