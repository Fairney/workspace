/*
 *  총 7개의 학점을 구하는 예제
 *  - 사용한 문법: if~else if
 */
public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "";
		int score = 79;
//		if(score >= 98 && score <= 100)
//			grade = "A+";
//		else if(score >= 90 && score <98)
//			grade = "A";
//		else if(score >= 88 && score <90)
//			grade = "B+";
//		else if(score >= 80 && score <88)
//			grade = "B";
//		else if(score >= 78 && score <80)
//			grade = "C+";
//		else if(score >= 70 && score <78)
//			grade = "C";
//		else
//			grade = "F";
//		
//		System.out.println(grade + score);
		
		grade = "";
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
		
		if(score >= 90){
			grade = "A";
			if(score >= 98 && score <= 100){
			//grade = grade + "+"; 명령문이 실행되면 현재 변수 grade의 값인 "A"를 읽어와서
			//뒤에 "+"기호를 붙인 새로운 "A+" ANSWKDUFDMF AKSEMFDJ WNQSLEK.
			//- 이유: grade + "+" 명령어를 = 연산자 보다 먼저 실행
			// - = 기호를 실행하면 현재 변수 grade의 값을 바꿉니다.
			grade = grade + "+";
		 	}
		}
		else if(score >= 80){
			grade = "B";
			if(score >= 88 && score < 90){
				grade = grade + "+";
			}
		}
		else if(score >= 70){
			grade = "C";
			if(score >= 78 && score < 80){
				grade = grade + "+";
			}
		}
		else
			grade = "F";

		System.out.println("점수는 " + score + "점 이고, 학점은 " + grade);
		
		
		}
	
	

}
