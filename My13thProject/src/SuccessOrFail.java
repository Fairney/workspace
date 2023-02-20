import java.util.Scanner;

public class SuccessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력하시오: ");
		int score = in.nextInt();
		if(score>=80)
			System.out.println("축하합니다! 합격입니다.");
	}

}
