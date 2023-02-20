/*
 * 1. 2차원 배열
 * 1) 2차원 배열 선언(자료형, 이름) + 할당(방 만들기) + 초기화(각각의 방에 대입)
 * 가. 첫 번째 예제: 행(세로 방향 또는 줄) 번호, 열(가로방향 또는 칸) 번호 화면에 표시)
 */
import java.util.Random;
public class MainClass {

	public static void main(String[] args) {
		//2. 2차원 배열을 선언 + 할당 + 초기화
		//1) 정수형 배열: ㅑㅜㅅ
		int[][] arr01 = {{10,11,12,13},{14,15,16,17}};
		/*
		 * 메모리 장치 안의 내용
		 * 1) 첫번째 행(10,11,12,13)
		 * 2) 두 번째 형(전체) 14,15,16,17
		 * 3) 첫 번째 행의 열 갯수: 배열이름[0].length!0,11,12,13->4개)
		 * 4) 두 번째 행의 열 갯수: 배열이름[1].length!14,15,16,17->4개)
		 */
		System.out.println("첫번째 행의 열 갯수: " + arr01[0].length);
		System.out.println("두번째 행의 열 갯수: " + arr01[1].length);
		
		/*
		 * 첫번째 행(전체): 10,11,12,13에서 특정 방에 있는 값을 뽑아오기
		 * -11: aar01[1]
		 */
		
		System.out.println(arr01[0][0]);
		
		/*
		 * for문을 변형하기
		 * 변하는 값: 열번호:01,20],,
		 */
		for(int i = 0; i < arr01[0].length; i++) {
			System.out.println("행 번호:0, 열 번호 : + 4");
		}
		int i2 = 0;
		
		if (i2 == 0) {}
		while (i2 <arr01[1].length) {
		i2++;
		System.out.println("행 번호 : 1, 열 번호 ");
		}
		/*
		 * 2차원 배열은 기본적으로 중첩 for문을 사용
		 * -형식:
		 * for(행을 제어하는 초기식; 조건식;증감식
		 * for(열을 제어하는 초기식; 조건식; 증감식)
		 * println();
		 */
		
		System.out.println(arr01.length);
		for(int i = 0;i<arr01.length; i++) {
			for(int j = 0; j<arr01[1].length; j++)
			{
				System.out.println("행 번호 : +" + i + ", 열 번호: " + ", 값:"+arr01[i][j]);
			}
		}
		/*
		 * 행 마다 열의 크기가 다른 가변 2차원 배열
		 * 예)
		 * 첫 번째 행의 값:1, 2, 3
		 * 두 번째 행의 값 4, 5,6,7
		 */
		int[][] arr02 = {{1,2,3,},{4,5,6,7}};
		System.out.println("첫 번째 행의 열의 갯수:" + arr02[0].length);
		System.out.println("두 번째 행의 열의 갯수:" + arr02[1].length);
		
		/*
		 * 중첩 for문의 작성 형식
		 * for(int 변수명 = 0; 변수명 < 2차원배열명.length 또는 2차원배열명[0].length; 변수명++)
		 *///- 2차원 배열명 자체는 2차원 배열 전체를 가리킴
		// - 하지만 2차원배열명[행번호]: 특정 행 번호 하나만을 가리킴
		//내부 for문을 이어서 작성: for(int 변수명2 = 0; 변수명2 < 2차원배열명[변수명].length; 변수명2++)
		//-변수명 2는 위에서 선언한 변수명 과는 다른 이름을 사용
		//-2차원배열명[변수명]: 첫 번째 for문에서 선언한 변수명의 현재 값에 따라서 서로 다른 행을 가리킴
		
		//stack과 heap 영역.
		/*
		 * First in Last out
		 * Last in First out->Stack구조: 가장 마지막에 들어온 것이 가장 먼저 나간다.
		 * FILO, LIFO: 탑 모양.
		 * 
		 * 실제로 사용되는 부분) 뒤로가기 앞으로 가기.
		 * Stack공간에는 메모리 공간의 효율을 위해서 프로그램이 실행됐을 때 할당.
		 * stack공간에 생성한 배열의 주소값이 할당되고, 주소값에 따라 heap영역에 배열의 실질적 주소의 저장소와 주소에 따른 실질적 저장메모리가 만들어진다.
		 */
		
		System.out.println("=====================================");
		for(int row = 0; row<arr02.length; row++) {//arr02.length는 행의 갯수를 말한다.
			for(int column = 0; column < arr02[row].length; column++) {//arr02[i].length는 arr02의 i번째 행의 열의 갯수를 뜻한다.
				System.out.println(row + "번째 행의" + column + "열의 값: " + arr02[row][column]);
			}
		}
		System.out.println("=====================================");

		/*
		 * 1차원 배열처럼 방의 갯수를 정수로 설정하는 것도 가능
		 * - 형식: 자료형[][] 배열명 = new 자료형[행의갯수][열의갯수];
		 * - 예제;
		 * 행의 갯수는 2, 열의 갯수는 3으로 설정해서 2차원 배열의 방을 만들기.
		 * -방에 값을 저장하지 않으면 컴파일러는 기본값을 사용
		 * -int 자료형의 기본값은 0
		 * -String 클래스형의 값의 기본값은 null
		 *  -null: String 클래스 형의 변수를 사용해서 메모리 장치에 있는 특정 공간에 이동할 수 없도록 설정하는값.(찾아갈 주소가 없음. 또는 주소를 모름.
		 *  -double 자료형의 기본값으 0.0
		 *  -boolean 자료형의 기본값으 false
		 *  
		 *  정수값을 여러 개 저장할 수 이쓴 2추언 배열을 설정
		 *  -행의 갯수는 2, 열의 갯수는 3
		 *  
		 */
		int[][] arr03 = new int[2][3];
		for(int row2 =0; row2<arr03.length;row2++)
		{
			for(int col2 = 0; col2<arr03[row2].length;col2++)
			{
				System.out.println(arr03[row2][col2]);
			}
		}
		System.out.println("=====================================");
		/*
		 * 난수(Random Number)를 생성해서 arr03배열에 저장하기
		 * 
		 */
		Random r = new Random();
		int number = r.nextInt(5)+1;
		System.out.println("1~5사이에 있는 정수" +number);
		System.out.println("=====================================");
		//2차원 배열인 arr03의 총 방의 갯수: 6개 * 10
		number = r.nextInt(6) *10 +1;
		System.out.println("1~60사이에 있는 정수" +number);
		System.out.println("=====================================");
		for(int row = 0; row<arr02.length; row++) {//arr02.length는 행의 갯수를 말한다.
			for(int column = 0; column < arr02[row].length; column++) {//arr02[i].length는 arr02의 i번째 행의 열의 갯수를 뜻한다.
				int rand = r.nextInt(100)+1;
				arr02[row][column]= rand;
				System.out.println(row + "번째 행의" + column + "열의 값: " + arr02[row][column]);
			}
		}
		System.out.println("=====================================");
		/*
		 * 사용자로부터 전체 행의 갯수를 먼저 입력 받기
		 * -행의 갯수 만큼 for문을 실행하면서 사요자로부터 각 행 마다의 열의 갯수를 입력 받기
		 * - 완전한 동적 배열( 프로그램이 실행 중에 전체 방으 ㅣ갯수가 결정)
		 * 변수명1 = 3;//고정 시키기
		 * 변수명1 = sc.nextInt();//함수 호출. 사용자가 입력한 값에 따라서 달라진다.(행 또는 줄 갯수)
		 * 변수명2 = sc.nextInt();//함수 호출. 사용자가 입력한 값에 따라서 달라진다.(행 마다 칸 갯수 또는 방의 갯수)
		 * 예) int[][] arr04 = new int[변수명1][변수명2];
		 */
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("새로 만들 2차원 배열의 전체 행의 갯수를 입력하세요.");
		int rowSize, colSize;
		int[][] arr04 =null;
		rowSize = sc.nextInt();//
		
		if(rowSize > 0) {
			System.out.println("사용자가 입력한 행의 갯수는 " + rowSize);
			//마. 사용자가 입력한 행의 갯수만큼 방을 생성
			// - 형식 : 배열이름 = new 자료형[변수명][];
			System.out.println("동적으로 2차원 배열의 세로 줄을 만들었다.");
			arr04 = new int[rowSize][];//3을 입력하면 arr04 = new int[3][]; 뒤의 대괄호를 빼면 오류가 난다. 식의 앞뒤의 형식을 똑같이 해야한다.arr04는 형식상 arr04[][]다.
			//사. for 반복문을 사용해서 세로 줄 수 만큼 열의 갯수를 사용자로부터 입력받기
			//아래 반복문은 new int[rowSIze][]에서 []를 설정하는 명령어
			//-[] 안에 숫자를 넣어주는 명령어: 기준은 위에서사용자가 입력한 줄 수.
			//row4: 행번호를 제어(0~ 사용자가 입력한 행 수 -1 까지)
			for(int row4 = 0; row4< rowSize; row4++) {
				System.out.println("행 번호는 " + row4);
				System.out.print("배열의 가로줄의 사이즈를 쓰시오.");
				//아래 명령어의 의미: 각 줄 마다 칸을 만들어주는 명령어.
				colSize = sc.nextInt();
				
				if(colSize>0) {
				System.out.println("사용자가 입력한 열의 갯수는 " + colSize);
				arr04[row4]= new int[colSize];
				//각각의 줄은 변수 row4의 값으로 설정.
				System.out.println("사용자가 입력한 칸의 갯수로 실제 방을 만듦");
				System.out.println("실제로 만들어진 방의 갯수:" + Math.abs(colSize));
				System.out.println("씰제로 만들어진 방의 갯수:" + arr04[row4].length);
				System.out.println("실제로 만들어진 실제 방의 층수:" + arr04.length);
				System.out.println("---------------------------------------");
				}
				else if(colSize == 0)
				{
					arr04[row4]= new int[5];
					System.out.println("사용자가 입력한 값이 0이므로 기본적으로 5개의 방을 생성");
				}
				else
				{
					int absColSize = Math.abs(colSize);
					arr04[row4] = new int[absColSize];
					System.out.println("음수를 양수로 받아 넣었습니다." + arr04[row4].length);
				}
				
			}
			
		}
		else {
			System.out.println("양수를 입력하시지 않으셨습니다." + rowSize);
			
			
			rowSize = Math.abs(rowSize);
		
			System.out.println("사용자가 입력한 행의 갯수는 " + rowSize);
		
			//마. 사용자가 입력한 행의 갯수만큼 방을 생성
		
			// - 형식 : 배열이름 = new 자료형[변수명][];
		
			System.out.println("동적으로 2차원 배열의 세로 줄을 만들었다.");
		
			arr04 = new int[rowSize][];//3을 입력하면 arr04 = new int[3][]; 뒤의 대괄호를 빼면 오류가 난다. 식의 앞뒤의 형식을 똑같이 해야한다.arr04는 형식상 arr04[][]다.
		
			//사. for 반복문을 사용해서 세로 줄 수 만큼 열의 갯수를 사용자로부	터 입력받기
		
			//아래 반복문은 new int[rowSIze][]에서 []를 설정하는 명령어
		
			//-[] 안에 숫자를 넣어주는 명령어: 기준은 위에서사용자가 입력한 줄 수.
		
			//row4: 행번호를 제어(0~ 사용자가 입력한 행 수 -1 까지)
		for(int row4 = 0; row4< rowSize; row4++) {
			System.out.println("행 번호는 " + row4);
			System.out.print("배열의 가로줄의 사이즈를 쓰시오.");
			//아래 명령어의 의미: 각 줄 마다 칸을 만들어주는 명령어.
			colSize = sc.nextInt();
			
			if(colSize>0) {
			System.out.println("사용자가 입력한 열의 갯수는 " + colSize);
			arr04[row4]= new int[colSize];
			//각각의 줄은 변수 row4의 값으로 설정.
			System.out.println("사용자가 입력한 칸의 갯수로 실제 방을 만듦");
			System.out.println("실제로 만들어진 방의 갯수:" + Math.abs(colSize));
			System.out.println("씰제로 만들어진 방의 갯수:" + arr04[row4].length);
			System.out.println("실제로 만들어진 실제 방의 층수:" + arr04.length);
			System.out.println("---------------------------------------");
			}
			else if(colSize == 0)
			{
				arr04[row4]= new int[5];
				System.out.println("사용자가 입력한 값이 0이므로 기본적으로 5개의 방을 생성");
			}
			else
			{
				int absColSize = Math.abs(colSize);
				arr04[row4] = new int[absColSize];
				System.out.println("음수를 양수로 받아 넣었습니다." + arr04[row4].length);
			}
			
		}
		}
		
		
		
		/*
		 * 객체)Object: 내부적으로 클래스(껍데기)
		 * -클래스는 다시 변수 영역과 함수 영역 두가지 영역을 가지고 있다.
		 * 
		 */
		System.out.println(arr03);//heap영역의 주소를 출력한다.
		System.out.println(arr03[0]);
		System.out.println(arr03[0][0]);
	}

}