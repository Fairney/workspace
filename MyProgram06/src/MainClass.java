import java.util.Scanner;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		int score; //임의의 값: 범위는 음수,0, 양수)
		String grade; //학점을 보관할 변수 grade를 선언 +초기
		Scanner sc = new Scanner(System.in);
		/*
		 * 특정 과목의 점수를 판단해서 학점을 부여하고 화면에 표시하는 예제
		 * 학점의 종류: 총 4가지("A","B","C","F")
		 * 여러 if 조건문 중에서 if~else if 형식을 사용
		 *  - 이유: 조건 (경우의 수)의 깃수가 3가지 이상
		 *  점수는 정수 값으로 변수 score에 대입
		 *  규칙
		 * 		-점수가 90점 이상이고, 100점 이하인 경우에만 학점을 "A"로 합니다.
		 * 		-만약 점수가 80점 이상이고 90점 미만일 경우에는 B학점을 부여
		 * 		-만약 점수가 70점 이상이고 80점 미만일 경우에는 C학점을 부여
		 * 		-그 외에는 F"
		*/
		score = sc.nextInt();
		//System.out.println(score);
		//변수 score의 값을 읽어와서 덧셈 계싼을 수행하는 명령문을 작성
		int a = score +5;
		//- 변수 score의 값을 불러와서 정수 값인 5와 덧셈 계산을 하고
		// - 덧셈 결과를 변수 a에 대입
		// - 즉, 변수이름을 사용하면 프로그램이 실행하지 않으면
		//	 변수의 현재 값을 확인할 수 없기 때문에
		//   디버깅을 통해서 미리 확인
		if(score >= 90 && score <= 100)
		{
			//실행할 문장이 하나여도 블럭 기호를 작성
			// - 기본(문장이하나이면 작성하지 않아도 됨
			if(score >= 98)
				grade = "A+";
			else
				grade = "A";
		}
		else if(score >= 80 && score < 90)
		{
			if(score >= 88)
				grade = "B+";
			else
				grade = "B";
		}
		else if(score >= 70 && score < 80)
		{
			if(score >= 78)
				grade = "C+";
			else
				grade = "C";
		}
		else {
			grade = "F";
		}
		//마지막에는 학점을 화면에 출력
		// -사용자 입장을 고려해서 점수화 학점을 모두 한 줄에 표시하기
		System.out.println("점수는 " + score + "점 이고, 학점은 " + grade);
		sc.close();

	}

}
