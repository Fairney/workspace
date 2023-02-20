package StudyClass;
/*
 * 사용자로부터 입력 받을 항목을 정하기
 * -스마트폰에 있는 연락처(전화번호) 입력 정보들을 참고
 * -이름, 전화번호, 이메일, 메모.
 * 
 */
import java.util.Scanner;

public class SmartPhoneEx {
	

	
	
	//이름, 전화번호, 메모, 이메일 .String,
	public static void main(String[] args) {
		System.out.println("자 지금부터 스마트폰 연락처의 간단한 구현을 해볼겁니다.");
		System.out.println("구현시작, 정적인 배열을 이용할거니 size를 입력");
		Scanner sc = new Scanner(System.in);	
		int size=sc.nextInt();
	
		String[] name = new String[size];
		String[] phoneNum = new String[size];
		String[] note = new String[size];
		String[] email = new String[size];
		
		// TODO Auto-generated method stub
		
		
		if(size<=0) {
			System.out.println("방이 없어서 입력 받을 수 없습니다.");
		}
		else
		{
			sc.nextLine();//쓸모없는 것 삭제.
			for(int i = 0; i<size; i++) {
				System.out.println((i+1)+"번째 이름을 입력하세요");
				name[i] = sc.nextLine();
				System.out.println((i+1)+"번째 핸드폰 번호를 입력하세요");
				phoneNum[i] = sc.nextLine();
				System.out.println((i+1)+"번째 이메일을 입력하세요");
				email[i] = sc.nextLine();
				System.out.println((i+1)+"번째 메모를 입력하세요");
				note[i] = sc.nextLine();
				
				while(name[i].isEmpty()) {
				System.out.println("인식하지 못했습니다. 이름을 입력하세요");
				name[i]= sc.nextLine();
				}
				
				while(email[i].isEmpty()) {
					System.out.println("인식하지 못했습니다. 이메일을 입력하세요");
					email[i]= sc.nextLine();
					}
				
				while(note[i].isEmpty()) {
					System.out.println("인식하지 못했습니다. 메모를 입력하세요");
					note[i]= sc.nextLine();
					}
				
				while(phoneNum[i].isEmpty()) {
					System.out.println("인식하지 못했습니다. 폰번을 입력하세요");
					phoneNum[i]= sc.nextLine();
					}
				
			}//for문의 끝
			System.out.println("전부 입력하셨습니다.");
			
			//여러 사람의 이름들이 저장되어 있는 배열 name의 이름을 첫번째 값부터 차례때로 가져와서
			//화면에 출력하는 향상된 for문을 작성 + 실행
			//-주의사항: 이름은 String
		}//if(size<=0) else
		
		for(int i = 0; i<size; i++) {
			System.out.println(name[i] + " " + email[i] + " " + note[i] + " " + phoneNum[i]);
		}
		
		for(String a : email) {
			System.out.print(a);
			
		}
		for(String a : name) {
			System.out.print(a);
			
		}
		for(String a : note) {
			System.out.print(a);
			
		}
		for(String a : phoneNum) {
			System.out.print(a);
			
		}

		
	}

}
