package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoStore {

	    Scanner scan = new Scanner(System.in);

	 

	    public void Store_Menu(){

	        System.out.println("Lotto 프로그램");

	        System.out.println("============");

	        System.out.println("1. Lotto 구입");

	        System.out.println("2. 프로그램 종료");

	        System.out.println("============");

	    }

	 

	    public void StoreStart(){

	        while(true){

	            Store_Menu();

	 

	            System.out.print("메뉴 선택 : ");

	            int choice = scan.nextInt();

	 

	            if(choice == 1)

	                BuyLotto();

	            else if(choice == 2) {

	                System.out.println("프로그램 종료");

	                return;

	            }

	            else

	                 System.out.println("번호를 잘못 입력했습니다. 1 또는2를 입력하세요.");

	        }

	    }

	 

	    public void BuyLotto(){

	        System.out.print("금액 입력 : ");

	        int money = scan.nextInt();

	 

	        if(money<1000){

	            System.out.println("1000원 이상 입력해 주세요.");

	            return;

	        }else if(money>100000){

	            System.out.println("100000원을 초과 할수 없습니다. 다시 입력해주세요.");

	            return;

	        }

	 

	        LottoNum(money);

	 

	        System.out.println("받은 금액은 " + money + "원이고, 거스름돈은 " + (money%1000) + "원 입니다.");

	}

	 

	    public void LottoNum(int money){

	        Set<Integer> lottoSet = new HashSet<>();

	 

	        int amount = money/1000;

	 

	        System.out.println();

	        System.out.println("로또 번호 출력하기");

	        for(int i=1; i<=amount; i++){

	             while(lottoSet.size()<6){

	                 lottoSet.add((int)(Math.random() * 45 + 1));

	             }

	             ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);

	             Collections.sort(lottoList);

	             System.out.println("로또번호" + i + " : " + lottoList);

	             lottoSet.clear();

	        }

	    }

	 

	    public static void main(String[] args) {

	        new LottoStore().StoreStart();

	    }
}
