package mypackage03;


//작업 디레고리와는 다른 위치에 있는 클래스를 사용하기 위한 import 명령어를 작성
import java.lang.System;
//-> 소스 파일을 번역할 때 java.lang 패키지에 저장된 모든 클래스들을 사용
// import java.lang.*;
// -* 기호: 와일드 카드-모든 클래스 이름들을 사용하기 위한 명령어
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
//		java.lang.System.out.println("안녕하세요?");
		//println()에서 l은 소문자 엘입니다.
		//로 시작하는 명령어를 주석(commit)이라고 합니다.
		//-용도는 명령어에 보충 설명을 달 때 사용 합니다.
		// /* */는 여러줄 주석입니다.
		//위의 명령어를 빨리 입력 + 압축 형식(간소화)
		// - 이클립스에서 제공해주는 템플릿 이름을 사용
		// 입력 방법: sysout 입력 후에 Ctrl 키 + Space 키를 차례로 누르세요
//		System.out.println("만나서 반갑습니다.");
//		System.out.println("Hello");
//		System.out.println("hi");
		//println() 함수의 내부 동작(작동 원리)
		// - 내부적으로는 print() 함수를 사용 + 줄바꿈 기능을 추가.
		// - 줄 바꿈 기능을 사용하시려면 \n 이스케이프 시퀀스 문자를 사용
		// - 이스케이프란 탈출 또는 어떤 지역을 벗어남
		// - 또는 기존 단어가 갖고 있는 뜻을 지우고 새로운 의미를 적용
		// - exit 단어와 유사
		// - 알파벳 소문자 n이 갖고 있는 의미를 지우고 새로운 의미인 new line을 적용
		// - 이유:역슬래시 기호를 먼저 작성했기 때문 -> \n
		// - 줄바꿈: 개행 또는 새로운 줄(행:ROW)을 화면에 만들어 줌.
//		System.out.print("n안녕하세요?n반가워용");
//		System.out.print("\n안녕하세요?\n반가워용");
		
		System.out.print("\n안녕하세요?\n반가워용");
		System.out.print("\t");
		System.out.print("\n안녕하세요?\n반가워용");
		// \의 의미: 다음에 오는 기호 또는 문자의 본래 기능을 없앰. \\는 \가 출력됨
		System.out.print("\\wryyyyyyyyyyyy\\");
		//실제로 파일의 경로를 나타낼 때 쓰인다.-위치를 표현하는 문자열
		System.out.println("C:\\Program Files\\Java\\jdk1.8.0_351\\jre");
		//JDK 설치 폴더의 전체 경로(위치)의 시작 값
		/*
		 여러줄 주석
		 자주 사용하는 이스케이프 문자의 종류
		 1. \n
		 2. \t tab의 약어 tab키의 기능 수행. 한 번에 오른쪽으로 공백 문자 여러번 출력.
		 3. 
		 */
		System.out.print("\n d");
		System.out.print("\n	d");
		System.out.print("\n,,,,d");
		//쉼표(,) 기호: 액셀 파일(csv: comma separated value 또는 data)
		// - 파일의 내용 : 홍길동, 20, 178, 200
		// \t 이스케이프 시퀀스 문자를 사용해서 한 번에 여러개의 공백 문자들을 표시한다.
		System.out.println("\n안녕하세요?\t하이~\t");
	}

}
